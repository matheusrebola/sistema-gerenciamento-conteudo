package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.Users;

public record VersionsDto(
		@NotNull UUID id,
		Integer versionNumber,
		String body,
		LocalDateTime updatedAt,
		String updatedBy,
		Contents content,
		Users user) {

}
