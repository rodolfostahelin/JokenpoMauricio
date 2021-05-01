package JoKenPo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Papel = 0");
		System.out.println("Pedra = 1");
		System.out.println("Tesoura = 2");
		
		System.out.print("Usuario: ");
		
		Usuario usuario = new Usuario();
		usuario.setEscolha(0);
		usuario.setName("Rodolfo");
		
		
		
		Escolhas jogada = new Escolhas();
		//jogada.getJogada();
		
		Scanner leitor = new Scanner(System.in);
		int jogadaUsuario = usuario.setuEscolha(leitor.nextInt());
		
	
	}

}