package sistemagerenciamentoconteudo.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record SEO(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String metaFile,
		String metaDescription,
		String metaKeywords,
		Contents content) {

}
