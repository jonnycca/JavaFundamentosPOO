package br.com.javaoo.interfaces;

import br.com.javaoo.exceptions.AbastecimentoVeiculoLigadoException;
import br.com.javaoo.exceptions.AcelerarVeiculoLigadoException;
import br.com.javaoo.exceptions.FrenagemDesligadoException;

public interface Veiculo {

	void ligar();
	void desligar();
	void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;
	void acelerar() throws AcelerarVeiculoLigadoException;
	void frear() throws FrenagemDesligadoException;
	
}
