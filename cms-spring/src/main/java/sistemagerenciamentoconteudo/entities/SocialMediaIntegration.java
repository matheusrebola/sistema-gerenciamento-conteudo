package sistemagerenciamentoconteudo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record SocialMediaIntegration(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Plataform plataform,
		String postId,
		LocalDateTime postedAt,
		Contents content) {

}
