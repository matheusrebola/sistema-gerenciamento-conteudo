package sistemagerenciamentoconteudo.entities;

import jakarta.persistence.Entity;

@Entity
public record UserPermissions(
		Users user,
		Permissions permission) {

}
