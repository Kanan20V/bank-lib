package com.example.banklib;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
    name = "core-client",
    url = "${api.core.url}",
    contextId = "core-client-context",
    configuration = FeignClient.class

)
public interface CoreClient extends CoreFacade {
}