package kz.laura.ecommercebackendsystem.controller;

import kz.laura.ecommercebackendsystem.async.LauraNysanbekAsyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/async")
@RequiredArgsConstructor
public class LauraNysanbekAsyncController {

    private final LauraNysanbekAsyncService asyncService;

    @GetMapping("/email")
    public String sendEmail() {

        asyncService.sendEmailAsync();

        return "Email process started";
    }

    @GetMapping("/report")
    public String generateReport() {

        asyncService.generateReportAsync();

        return "Report generation started";
    }

    @GetMapping("/order")
    public String processOrder() {

        asyncService.processOrderAsync();

        return "Order processing started";
    }
}