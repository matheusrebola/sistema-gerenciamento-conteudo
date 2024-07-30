package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;

import sistemagerenciamentoconteudo.entities.Contents;

public record AnalyticsCreateDto(
		Integer views,
		Integer shares,
		Integer clicks,
		LocalDateTime createdAt,
		Contents content) {

}
