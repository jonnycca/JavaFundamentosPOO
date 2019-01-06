package br.com.javaoo.classes;

import br.com.javaoo.exceptions.AcelerarVeiculoLigadoException;
import br.com.javaoo.exceptions.FrenagemDesligadoException;

public final class Moto extends VeiculoBase{

	public Moto() {
		this.qntdRodas =2;
	}
	
	public Moto(String nome, String marca) {
		this.qntdRodas =2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	@Override
	public void acelerar() throws AcelerarVeiculoLigadoException{
		if(this.isLigado()) {
			this.velocidade += 3;
		}else {
			throw new AcelerarVeiculoLigadoException();
		}
	}
	
	@Override
	public void frear() throws FrenagemDesligadoException {
		if(this.isLigado()) {
			this.velocidade -=3;
		} else {
			throw new FrenagemDesligadoException();
		}
	}
	
	@Override
	public void preparar() {
		System.out.println("Colocar o capacete.");
	}

}
