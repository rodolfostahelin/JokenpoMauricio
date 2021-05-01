package JoKenPo;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Papel = 0");
		System.out.println("Pedra = 1");
		System.out.println("Tesoura = 2");
		
		System.out.print("Usuario: ");
		
		Jogador usuario = new Jogador();
		Jogador computador = new Jogador();
		
		Escolha escolhaU = new Escolha();
		Escolha escolhaC = new Escolha();
		
		Scanner leitor = new Scanner(System.in);
		escolhaU.setJogada(leitor.nextInt());
		Escolha jogadaUsuario = usuario.setEscolha(escolhaU);
		
		Random geradorN = new Random();
		escolhaC.setJogada(geradorN.nextInt(3));
		Escolha jogadaComputador = computador.setEscolha(escolhaC);
		
		switch (jogadaComputador.getJogada()) {
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
		
		if (0 <= jogadaUsuario.getJogada() && jogadaUsuario.getJogada() <= 2) {
			
			if (jogadaUsuario.getJogada() == jogadaComputador.getJogada()) {
				System.out.println("Empate");
			} else {
				if ((jogadaUsuario.getJogada() == 0 && jogadaComputador.getJogada() == 2) || (jogadaUsuario.getJogada() == 1 && jogadaComputador.getJogada() == 0)
						|| (jogadaUsuario.getJogada() == 2 && jogadaComputador.getJogada() == 1)) {
					System.out.println("Computador venceu!");
				} else {
					System.out.println("Jogador venceu!");
				}
			}
		} else {
			System.out.println("Você jogou um número inválido!");
		}
		
	
	}

}