package br.com.javaoo.exceptions;

public class ChassiInvalidoException extends Exception {
	
	private static final long serialVersionUID = -5118880518162316829L;

	public ChassiInvalidoException (String chassi) {
		super(String.format("O chassi informado é inválido: %s", chassi));
	}

}
