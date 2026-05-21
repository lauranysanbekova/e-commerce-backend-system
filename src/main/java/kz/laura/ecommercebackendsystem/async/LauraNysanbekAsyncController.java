package kz.laura.ecommercebackendsystem.controller;

import kz.laura.ecommercebackendsystem.async.LauraNysanbekAsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/async")
public class LauraNysanbekAsyncController {

    private final LauraNysanbekAsyncService asyncService;

    public LauraNysanbekAsyncController(
            LauraNysanbekAsyncService asyncService) {

        this.asyncService = asyncService;
    }

    @GetMapping("/test")
    public CompletableFuture<String> testAsync() {

        return asyncService.processAsyncTask();
    }
}