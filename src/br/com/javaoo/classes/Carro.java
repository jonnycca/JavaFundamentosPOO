package br.com.javaoo.classes;

public final class Carro extends VeiculoBase{
	
	private int quantidadePortas;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public Carro (){
		this.qntdRodas = 4;
	}

	public Carro(String nome, String marca) {
		this.qntdRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de seguran�a.");
	} 
}
