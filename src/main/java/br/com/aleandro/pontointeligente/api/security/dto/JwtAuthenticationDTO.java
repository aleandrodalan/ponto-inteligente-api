package br.com.aleandro.pontointeligente.api.security.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class JwtAuthenticationDTO {

	@NotEmpty(message = "Email não pode ser vazio.")
	@Email(message = "Email inválido")
	private String email;
	
	@NotEmpty(message = "Senha não pode ser vazia.")
	private String senha;
}