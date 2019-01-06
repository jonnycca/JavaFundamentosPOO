package br.com.javaoo.interfaces;

import br.com.javaoo.exceptions.AcelerarVeiculoLigadoException;
import br.com.javaoo.exceptions.FrenagemDesligadoException;

public interface Andador {

	void acelerar() throws AcelerarVeiculoLigadoException;
	void frear() throws FrenagemDesligadoException;
}
