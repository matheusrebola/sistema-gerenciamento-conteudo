package sistemagerenciamentoconteudo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Versions(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer versionNumber,
		String body,
		LocalDateTime updatedAt,
		String updatedBy,
		Contents content,
		Users user) {

}
