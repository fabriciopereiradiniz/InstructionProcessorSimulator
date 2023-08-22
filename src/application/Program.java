package application;

import java.util.Scanner;
import entities.Simulator;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Simulator s1 = new Simulator();

		int menu = 0;
		s1.terminate = false;
		while (s1.terminate != true) {
			System.out.println("================================");
			System.out.println("=            OPCOES:           =");
			System.out.println("================================");
			System.out.println("=1 -          INSERIR          =");// FALTA ADD OS Q VEM DPS DOS JUMP
			System.out.println("=2 -      VER INSTRUCOES       =");
			System.out.println("=3 -         VER DADOS         =");
			System.out.println("=4 -         EXECUTAR          =");
			System.out.println("=5 -          LIMPAR           =");
			System.out.println("=6 -           SAIR            =");
			System.out.println("================================");
			menu = sc.nextInt();

			if (menu == 1) {
				s1.insert();
			}

			if (menu == 2) {
				System.out.println("=============================================");
				System.out.println("=                INSTRUCOES:                =");
				System.out.println("=============================================");
				System.out.println("=COD    - OP1  - OP2   - RESULTADOS         =");
				System.out.println("=000001 - #POS -       - MBR <- #POS        =");
				System.out.println("=000010 - #POS - #DADO - #POS <- #DADO      =");
				System.out.println("=000011 - #POS -       - MBR <- MBR + #POS  =");
				System.out.println("=000100 - #POS -       - MBR <- MBR - #POS  =");
				System.out.println("=000101 - #POS -       - MBR <- MBR * #POS  =");
				System.out.println("=000110 - #POS -       - MBR <- MBR / #POS  =");
				System.out.println("=000111 - #LIN -       - JUMP to #LIN       =");
				System.out.println("=001000 - #LIN -       - JUMP IF Z to #LIN  =");
				System.out.println("=001001 - #LIN -       - JUMP IF N to #LIN  =");
				System.out.println("=001010 -      -       - MBR <- sqrt(MBR)   =");
				System.out.println("=001011 -      -       - MBR <- - MBR       =");
				System.out.println("=001111 - #POS -       - #POS <- MBR        ="); // add esse
				System.out.println("=001100 -      -       - NOP                =");
				System.out.println("=============================================");
			}
			if (menu == 3) {
				s1.printInstrucoes();
			}
			if (menu == 4) {
				s1.pc = 0;
				s1.run();
			}

			if (menu == 5) {
				System.out.println("Limpo com sucesso");
				s1.reset();
			}

			if (menu == 6) {
				s1.terminate = true;
			}
		}

		sc.close();
	}
}
