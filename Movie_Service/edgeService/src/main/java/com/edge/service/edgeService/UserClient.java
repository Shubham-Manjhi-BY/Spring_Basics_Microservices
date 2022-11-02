package com.edge.service.edgeService;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Collection;
import java.util.List;

@FeignClient("authentication-service")
public interface UserClient {

    @GetMapping("/users")
    Collection<User> readUsers();
}
