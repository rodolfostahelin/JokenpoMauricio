package JoKenPo;

import java.util.Random;
import java.util.Scanner;

public class Escolhas {
	
	private int jogada;

	public int getJogada() {
		
		Usuario uEscolha = new Usuario();
		
		
		
		Random geradorN = new Random();
		Computador cEscolha = new Computador();
		int jogadaComputador = cEscolha.setEscolhaC(geradorN.nextInt(3));
		
		switch (jogadaComputador) {
		case 0:
			System.out.println("Computador escolheu papel.");
			
			break;
		case 1:
			System.out.println("Computador escolheu pedra.");
			
			break;
			
		case 2:
			System.out.println("Computador escolheu tesoura.");
			
			break;
			
		}
		
		if (0 <= jogadaUsuario && jogadaUsuario <= 2) {
			
			if (jogadaUsuario == jogadaComputador) {
				System.out.println("Empate");
			} else {
				if ((jogadaUsuario == 0 && jogadaComputador == 2) || (jogadaUsuario == 1 && jogadaComputador == 0)
						|| (jogadaUsuario == 2 && jogadaComputador == 1)) {
					System.out.println("Computador venceu!");
				} else {
					System.out.println("Jogador venceu!");
				}
			}
		} else {
			System.out.println("Você jogou um número inválido!");
		}
		
		return jogada;
	}
	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	
}