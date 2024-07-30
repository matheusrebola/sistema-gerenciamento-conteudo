package sistemagerenciamentoconteudo.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record PermissionsDto(
		@NotNull UUID id,
		String name,
		String description) {

}
