package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;

import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.Users;

public record VersionsCreateDto(
		Integer versionNumber,
		String body,
		LocalDateTime updatedAt,
		String updatedBy,
		Contents content,
		Users user) {

}
