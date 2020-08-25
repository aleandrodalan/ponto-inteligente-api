package br.com.aleandro.pontointeligente.api.dtos;

import java.util.Optional;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LancamentoDTO {

	private Optional<Long> id = Optional.empty();
	
	@NotEmpty(message = "Data não pode ser vazia.")	
	private String data;
	
	private String tipo;
	private String descricao;
	private String localizacao;
	private Long funcionarioId;
	
}
