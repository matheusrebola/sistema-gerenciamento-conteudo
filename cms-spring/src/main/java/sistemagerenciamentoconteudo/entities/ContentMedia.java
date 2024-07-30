package sistemagerenciamentoconteudo.entities;

import jakarta.persistence.Entity;

@Entity
public record ContentMedia(
		Media media,
		Contents content) {

}
