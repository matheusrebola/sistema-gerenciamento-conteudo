package sistemagerenciamentoconteudo.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Contents;

public record SEODto(
		@NotNull UUID id,
		String metaFile,
		String metaDescription,
		String metaKeywords,
		Contents content) {

}
