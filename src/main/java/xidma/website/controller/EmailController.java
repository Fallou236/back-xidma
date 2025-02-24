package xidma.website.controller;



import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xidma.website.service.EmailService;

import java.util.Map;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // Autorise les requêtes depuis le frontend
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@RequestBody Map<String, String> request) {
        try {
            emailService.sendEmail(
                    request.get("name"),
                    request.get("email"),
                    request.get("subject"),
                    request.get("message")
            );
            return ResponseEntity.ok(Map.of("message", "E-mail envoyé avec succès"));
        } catch (MessagingException e) {
            return ResponseEntity.status(500).body(Map.of("error", "Échec de l'envoi du mail"));
        }
    }
}
