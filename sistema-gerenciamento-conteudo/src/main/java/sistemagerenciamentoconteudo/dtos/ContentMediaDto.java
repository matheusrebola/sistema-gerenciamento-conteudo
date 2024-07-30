package sistemagerenciamentoconteudo.dtos;

import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.Media;

public record ContentMediaDto(
		Media media,
		Contents content) {

}
