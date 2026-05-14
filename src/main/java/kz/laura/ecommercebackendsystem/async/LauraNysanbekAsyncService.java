package kz.laura.ecommercebackendsystem.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class LauraNysanbekAsyncService {

    @Async
    public CompletableFuture<String> sendEmailAsync() {

        log.info("Sending email asynchronously...");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return CompletableFuture.completedFuture(
                "Email sent successfully"
        );
    }

    @Async
    public CompletableFuture<String> generateReportAsync() {

        log.info("Generating report asynchronously...");

        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return CompletableFuture.completedFuture(
                "Report generated"
        );
    }

    @Async
    public CompletableFuture<String> processOrderAsync() {

        log.info("Processing order asynchronously...");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return CompletableFuture.completedFuture(
                "Order processed"
        );
    }
}