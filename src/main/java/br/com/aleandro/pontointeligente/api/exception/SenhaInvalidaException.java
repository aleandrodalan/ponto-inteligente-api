package br.com.aleandro.pontointeligente.api.exception;

public class SenhaInvalidaException extends RuntimeException {
	
	private static final long serialVersionUID = 1968432874827356458L;

	public SenhaInvalidaException() {
		super("Senha inválida!");		
	}
}