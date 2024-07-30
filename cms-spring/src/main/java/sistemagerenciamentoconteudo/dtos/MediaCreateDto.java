package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;

import sistemagerenciamentoconteudo.entities.Users;

public record MediaCreateDto(
		String fileName,
		String filePath,
		LocalDateTime uploadedAt,
		Users user) {

}
