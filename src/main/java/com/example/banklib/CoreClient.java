package com.example.banklib;

import com.example.banklib.error.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
    name = "core-client",
    url = "${api.core.url}",
    contextId = "core-client-context",
    configuration = FeignConfig.class

)
public interface CoreClient extends CoreFacade {
}