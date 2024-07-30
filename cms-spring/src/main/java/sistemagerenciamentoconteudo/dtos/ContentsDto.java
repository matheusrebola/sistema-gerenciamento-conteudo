package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.StatusContent;
import sistemagerenciamentoconteudo.entities.Users;

public record ContentsDto(
		@NotNull UUID id,
		String title,
		String body,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		StatusContent statusContent,
		Users user) {

}
