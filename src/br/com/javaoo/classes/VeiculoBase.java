package br.com.javaoo.classes;

import br.com.javaoo.exceptions.AbastecimentoVeiculoLigadoException;
import br.com.javaoo.exceptions.AcelerarVeiculoLigadoException;
import br.com.javaoo.exceptions.ChassiInvalidoException;
import br.com.javaoo.exceptions.FrenagemDesligadoException;
import br.com.javaoo.interfaces.Andador;
import br.com.javaoo.interfaces.Ligador;
import br.com.javaoo.interfaces.Veiculo;

public abstract class VeiculoBase implements Veiculo, Ligador, Andador {
//Veículo base que serve de suporte para os outros veiculos
	
	private String nome;
	private String marca;
	private String chassi;
	protected int qntdRodas;
	private float qntdCombustivel;
	private Boolean ligado;
	protected float velocidade;

	public VeiculoBase() {
		this.ligado = false;
		this.velocidade = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	
	//usando encapsulamento para verificar no get SetChassi se o chassi é igual 5 caracteres
	public void setChassi(String chassi) throws Exception {
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else { //caso o chassi nao seja igual a 5 caracteres, retorna um erro
			throw new ChassiInvalidoException(chassi); //cria uma exeção para quando o chassi for inválido
		}
	}

	public int getQntdRodas() {
		return qntdRodas;
	}

	public float getQntdCombustivel() {
		return qntdCombustivel;
	}

	public Boolean isLigado() {
		return ligado;
	}

	public float getVelocidade() {
		return velocidade;
	}

	//final foi utilizado para nao deixar o método ligar ser sobre escrito nas outras classes, pois todo veiculo liga de forma igual
	public final void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("O veículo ligou!");
	}

	public final void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("O veículo desligou!");
	}
	

	public void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		if (!this.ligado) {
			qntdCombustivel += litros;
		} else {
			throw new AbastecimentoVeiculoLigadoException(); //retorna uma exceção caso for abastecer e o veículo esteja ligado
		}
	}

	public void acelerar() throws AcelerarVeiculoLigadoException {
		if (this.ligado) {
			this.velocidade += 10;
		} else {
			throw new AcelerarVeiculoLigadoException(); //retorna exceção caso tente ligar e o veículo esteja desligado
		}
	}

	public void frear() throws FrenagemDesligadoException{
		if (this.ligado) {
			this.velocidade -= 10;
		} else {
			throw new FrenagemDesligadoException();
		}
	}
	
	public abstract void preparar();
	
}
