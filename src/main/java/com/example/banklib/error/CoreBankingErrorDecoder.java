package com.example.banklib.error;

import com.example.banklib.error.exception.CoreBankingException;
import com.example.banklib.error.exception.CustomerException;
import com.example.banklib.error.exception.InsufficientBalanceException;
import com.example.banklib.error.exception.NotFoundException;
import com.example.banklib.error.exception.ResourceAlreadyExistsException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
@Component
public class CoreBankingErrorDecoder implements ErrorDecoder {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Exception decode(String methodKey, Response response) {
        ErrorResponseDto errorResponse = null;
        
        try (InputStream body = response.body().asInputStream()) {
            errorResponse = objectMapper.readValue(body, ErrorResponseDto.class);
        } catch (IOException e) {
            log.error("Error parsing error response", e);
        }

        String message = errorResponse != null ? errorResponse.getMessage() : "Unknown error";
        int status = response.status();

        return switch (status) {
            case 404 -> new NotFoundException(message);
            case 409 -> {
                if (message.contains("balance")) {
                    yield new InsufficientBalanceException(message);
                }
                yield new ResourceAlreadyExistsException(message);
            }
            case 400 -> new CustomerException(message);
            default -> new CoreBankingException(message);
        };
    }
}