package sistemagerenciamentoconteudo.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Users(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String username,
		String password,
		String email,
		String fullName,
		Roles role) {

}
