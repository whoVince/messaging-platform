package portfolio.messaging;

import jakarta.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public MessageReceipt send(@RequestBody MessageRequest request) {
        return new MessageReceipt(UUID.randomUUID(), "QUEUED", Instant.now());
    }
    public record MessageRequest(@NotBlank String recipient, @NotBlank String body, @NotBlank String idempotencyKey) {}
    public record MessageReceipt(UUID messageId, String status, Instant acceptedAt) {}
}
