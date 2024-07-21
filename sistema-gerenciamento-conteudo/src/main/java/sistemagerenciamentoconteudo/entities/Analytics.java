package sistemagerenciamentoconteudo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Analytics(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer views,
		Integer shares,
		Integer clicks,
		LocalDateTime createdAt,
		Contents content) {

}
