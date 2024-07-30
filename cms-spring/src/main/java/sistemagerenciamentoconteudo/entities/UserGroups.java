package sistemagerenciamentoconteudo.entities;

import jakarta.persistence.Entity;

@Entity
public record UserGroups(
		Groups group,
		Users user) {

}
