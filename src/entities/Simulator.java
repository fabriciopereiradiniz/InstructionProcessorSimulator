package entities;

import java.util.Arrays;
import java.util.Scanner;

import application.Program;

public class Simulator extends Program {
	public double[] posicoes = new double[250]; // posicoes na memoria
	public double MBRs; // mbr pra executar operacoes
	public int pc;
	public String[] opcode = new String[250]; // opcode de instrucoes
	public int[] op1 = new int[250]; // posicao
	public int[] op2 = new int[250]; // dado
	public int quantInstrucoes;
	public int aux; // aux posicao
	public int aux2; // aux dados
	public boolean terminate;
	public int i = 0;
	Scanner sc = new Scanner(System.in);

	public void a000001(int op1) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 000001");
		System.out.println("IR <OP1>: " + op1);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <-- #POS");
		System.out.println(MBRs + "+<-- #" + op1);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + op1);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op1);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR:");
		System.out.println("+" + MBRs);
		System.out.println("O VALOR NA MEMORIA:");
		System.out.println("+" + posicoes[op1]);
		System.out.println("VALOR DO MBR APOS A OPERACAO:");
		MBRs = posicoes[op1];
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a000010(int op1, int op2) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 000010");
		System.out.println("IR <OP1>: " + op1);
		System.out.println("IR <OP2>: " + op2);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("#POS <-- #DADO");
		System.out.println(op1 + "#<-- +" + op2);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + op1);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op1);
		System.out.println("CALCULO DO ENDERECO DO SEGUNDO OPERANDO: ");
		System.out.println("ENDERECO: " + op2);
		System.out.println("BUSCANDO O SEGUNDO OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op2);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("ARMAZENANDO");
		System.out.println("+" + op2);
		System.out.println("NA POSICAO");
		System.out.println("#" + op1);
		System.out.println("CALCULANDO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: ");
		System.out.println("ARMAZENANDO O OPERANDO: ");
		System.out.println("MAR: " + op1);
		posicoes[op1] = op2;
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a000011(int op1) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 000011");
		System.out.println("IR <OP1>: " + op1);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <-- #MBR + #pos");
		System.out.println("MBR <-- +" + MBRs + " + #" + op1);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + op1);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op1);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO CONTEUDO DA POSICAO");
		System.out.println("+" + posicoes[op1]);
		System.out.println("VALOR DO MBR APOS A OPERACAO");
		MBRs = (MBRs + posicoes[op1]);
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a000100(int op1) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 000100");
		System.out.println("IR <OP1>: " + op1);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <-- #MBR - #pos");
		System.out.println("MBR <-- +" + MBRs + " - #" + op1);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + op1);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op1);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO CONTEUDO DA POSICAO");
		System.out.println("+" + posicoes[op1]);
		System.out.println("VALOR DO MBR APOS A OPERACAO");
		MBRs = (MBRs - posicoes[op1]);
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a000101(int op1) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 000100");
		System.out.println("IR <OP1>: " + op1);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <-- #MBR * #pos");
		System.out.println("MBR <-- +" + MBRs + " * #" + op1);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + op1);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op1);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO CONTEUDO DA POSICAO");
		System.out.println("+" + posicoes[op1]);
		System.out.println("VALOR DO MBR APOS A OPERACAO");
		MBRs = (MBRs * posicoes[op1]);
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a000110(int op1) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 000100");
		System.out.println("IR <OP1>: " + op1);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <-- #MBR / #pos");
		System.out.println("MBR <-- +" + MBRs + " / #" + op1);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + op1);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + op1);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO CONTEUDO DA POSICAO");
		System.out.println("+" + posicoes[op1]);
		System.out.println("VALOR DO MBR APOS A OPERACAO");
		MBRs = (MBRs / posicoes[op1]);
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a000111(int jump) {
		pc = pc + 1;
		System.out.println("JUMP to #LIN");
		i = (jump - 1);
	}

	public void a001000(int jump) {
		System.out.println("JUMP IF Z to #LIN");
		if (MBRs == 0) {
			pc = pc + 1;
			i = (jump - 1);
		} else
			i++;
	}

	public void a001001(int jump) {
		System.out.println("JUMP IF Z to #LIN");
		if (MBRs < 0) {
			pc = pc + 1;
			i = (jump - 1);
		} else
			i++;
	}

	public void a001010() {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 001010");
		System.out.println("IR <OP1>: ");
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <- sqrt(MBR)");
		System.out.println("MBR <-- +" + MBRs + " + " + Math.sqrt(MBRs));
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: ");
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: ");
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO CONTEUDO DA POSICAO");
		System.out.println("+" + Math.sqrt(MBRs));
		System.out.println("VALOR DO MBR APOS A OPERACAO");
		MBRs = Math.sqrt(MBRs);
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a001011() {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 001011");
		System.out.println("IR <OP1>: ");
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("MBR <- - MBR");
		System.out.println("MBR <-- +" + MBRs + " - " + MBRs);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: ");
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: ");
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DO MBR");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO CONTEUDO DA POSICAO");
		System.out.println("+" + MBRs);
		System.out.println("VALOR DO MBR APOS A OPERACAO");
		MBRs = (MBRs - MBRs);
		System.out.println("+" + MBRs);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void a001111(int op1) {
		pc = pc + 1;
		System.out.println("================================");
		System.out.println("=          EXECUTANDO          =");
		System.out.println("================================");
		System.out.println("PC= " + pc);
		System.out.println("BUSCANDO A INSTRUCAO:");
		System.out.println("IR <OPCODE>: 001111");
		System.out.println("IR <OP1>: " + MBRs);
		System.out.println("DECODIFICANDO A INSTRUCAO:");
		System.out.println("#POS <- MBR ");
		System.out.println(op1 + "+<-- #" + MBRs);
		System.out.println("CALCULO DO ENDEREÇO DO OPERANDO");
		System.out.println("ENDEREÇO: " + MBRs);
		System.out.println("BUSCANDO O OPERANDO NA POSICAO: ");
		System.out.println("MAR: " + MBRs);
		System.out.println("OPERACAO DE DADOS:");
		System.out.println("VALOR DA POSICAO:");
		System.out.println("+" + posicoes[op1]);
		System.out.println("O VALOR NA MEMORIA:");
		System.out.println("+" + posicoes[op1]);
		System.out.println("VALOR DA POSICAO APOS A OPERACAO:");
		posicoes[op1] = MBRs;
		System.out.println("+" + posicoes[op1]);
		System.out.println("O VALOR FOI ARMAZENADO!");
		System.out.println("================================");
	}

	public void reset() {
		Arrays.fill(posicoes, 0.0);
		MBRs = 0.0;
		pc = 0;
		Arrays.fill(opcode, null);
		Arrays.fill(op1, 0);
		Arrays.fill(op2, 0);
		quantInstrucoes = 0;
		aux = 0;
		aux2 = 0;
		terminate = false;
		i = 0;
	}

	public void printInstrucoes() {
		System.out.println("================================");
		System.out.println("=          INSTRUCOES          =");
		System.out.println("================================");
		for (int i = 0; i < opcode.length; i++) {
			if (opcode[i] != null) {
				System.out.println("================================");
				System.out.println("INSTRUCAO " + i + ": " + "Opcode: " + opcode[i] + ", " + "Op1: " + op1[i] + ", "
						+ "Op2: " + op2[i]);
			}
		}
		System.out.println("================================");
	}

	public void insert() {
		terminate = true;
		for (int i = 0; i < 250; i++) {
			if (quantInstrucoes != 0) { // pra poder entrar mais instrucoes se necessario
				i = quantInstrucoes;// tipo o cara da inserir dnv se nao o indice voltava pra 0
			}
			System.out.println("Digite o OPCODE [" + (i + 1) + "]");
			opcode[i] = sc.next();
			switch (opcode[i]) {
			case ("000001"):
				System.out.println("Digite a posicao que vai pro MBR.");
				aux = sc.nextInt(); // tem que por +1?
				op1[i] = aux;
				break;
			case ("000010"):
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				System.out.println("Digite o dado.");
				aux2 = sc.nextInt();
				op2[i] = aux2;
				break;
			case ("000011"):
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;

			case ("000100"):
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;

			case ("000101"):
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;
			case ("000110"):
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;
			case ("000111"): // jump
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;

			case ("001000"): // jump if z
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;

			case ("001001"): // jump if N
				System.out.println("Digite a posicao.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;

			case ("001010"): // sqrt
				System.out.println("");
				break;

			case ("001011"):
				System.out.println("");
				break;

			case ("001111"):
				System.out.println("Digite a posicao que vai para o MBR.");
				aux = sc.nextInt();
				op1[i] = aux;
				break;

			case ("001100"): // coloquei p nao cair no default
				System.out.println("NO OPERATION SET");
				i = 251;
				break;

			default:
				System.out.println("O OPCODE NAO EXISTE! ESSA OPERACAO IRA SER IGNORADA.");

			} // fim switch case
			quantInstrucoes = quantInstrucoes + 1;
		} // fim setar quant de isntrucoes q vai pedir
		terminate = false;
	}

	public void run() {
		while (i < quantInstrucoes) {

			switch (opcode[i]) {
			case ("000001"):
				a000001(op1[i]);
				break;
			case ("000010"):
				a000010(op1[i], op2[i]);
				break;
			case ("000011"):
				a000011(op1[i]);
				break;
			case ("000100"):
				a000100(op1[i]);
				break;
			case ("000101"):
				a000101(op1[i]);
				break;
			case ("000110"):
				a000110(op1[i]);
				break;
			case ("000111"):
				a000111(op1[i]);
				continue;
			case ("001000"):
				a001000(op1[i]);
				continue;
			case ("001001"):
				a001001(op1[i]);
				continue;
			case ("001010"):
				a001010();
				break;
			case ("001011"):
				a001011();
				break;
			case ("001111"):
				a000001(op1[i]);
				break;

			case ("001100"): {
				System.out.println("NO OPERATION");
				break;
			}
			}
			i++;
		}
		i = 0;
	}

}
