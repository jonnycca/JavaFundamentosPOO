package br.com.javaoo.main;

import br.com.javaoo.classes.Carro;
import br.com.javaoo.classes.VeiculoBase;
import br.com.javaoo.exceptions.AbastecimentoVeiculoLigadoException;
import br.com.javaoo.exceptions.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			//Veiculo corsa = new Carro("Corsa", "GM");
			VeiculoBase corsa = new Carro("Corsa", "GM");
			corsa.setNome("Corsa");
			corsa.setMarca("GM");
			corsa.setChassi("erscj");
			corsa.abastecer(30);
			//((Carro)corsa).setQuantidadePortas(4);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQntdCombustivel());
			System.out.println(corsa.getQntdRodas());
			System.out.println(String.format("O veiculo %s est� ligado? %b ", corsa.getNome(), corsa.isLigado()));
			corsa.preparar();
			corsa.ligar();
			corsa.acelerar();
			System.out.println(String.format("A velocidade atual do veiculo �: %f", corsa.getVelocidade()));
			corsa.frear();
			System.out.println(String.format("A velocidade atual do veiculo �: %f", corsa.getVelocidade()));
		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("N�o pode abastecer com o ve�culo l�gado.");
		} catch (ChassiInvalidoException e) {
			System.out.println("O chassi informado � inv�lido." + e.getMessage());		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}

}
