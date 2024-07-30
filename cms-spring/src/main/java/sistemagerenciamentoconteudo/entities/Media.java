package sistemagerenciamentoconteudo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Media(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String fileName,
		String filePath,
		LocalDateTime uploadedAt,
		Users user) {

}
