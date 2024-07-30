package sistemagerenciamentoconteudo.dtos;

import sistemagerenciamentoconteudo.entities.Contents;

public record SEOCreateDto(
		String metaFile,
		String metaDescription,
		String metaKeywords,
		Contents content) {

}
