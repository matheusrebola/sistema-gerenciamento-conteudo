package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;

import sistemagerenciamentoconteudo.entities.StatusContent;
import sistemagerenciamentoconteudo.entities.Users;

public record ContentsCreateDto(
		String title,
		String body,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		StatusContent statusContent,
		Users user) {

}
