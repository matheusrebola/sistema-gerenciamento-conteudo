package sistemagerenciamentoconteudo.entities;

import jakarta.persistence.Entity;

@Entity
public record GroupPermissions(
		Groups group,
		Permissions permission) {

}
