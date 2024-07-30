package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Users;

public record MediaDto(
		@NotNull UUID id,
		String fileName,
		String filePath,
		LocalDateTime uploadedAt,
		Users user) {

}
