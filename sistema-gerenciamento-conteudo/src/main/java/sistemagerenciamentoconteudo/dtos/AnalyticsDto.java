package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Contents;

public record AnalyticsDto(
		@NotNull UUID id,
		Integer views,
		Integer shares,
		Integer clicks,
		LocalDateTime createdAt,
		Contents content) {

}
