package controle;

import java.util.Scanner;

import dominio.FrequenciaCardiaca;

import java.text.DecimalFormat;

public class ControleFrequenciaCardiaca {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("CADASTRO DE ATLETA");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o sobrenome: ");
		String sobrenome = input.nextLine();
		System.out.print("Digite o dia do nascimento: ");
		int dia = input.nextInt();
		System.out.print("Digite o mês do nascimento: ");
		int mes = input.nextInt();
		System.out.print("Digite o ano do nascimento: ");
		int ano = input.nextInt();
		
		FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);
		
		System.out.println("DADOS DO ATLETA CADASTRO");
		System.out.println("Nome completo: " + frequenciaCardiaca.informarNome());
		System.out.println("Data de nascimento: " + frequenciaCardiaca.informarNascimento());
		System.out.println("Idade: " + frequenciaCardiaca.calcularIdade());
		System.out.println("Frequência Cardíaca Máxima: " + frequenciaCardiaca.calcularFcm());
		System.out.println("Frequência Cardiaca Alvo: " + df.format(frequenciaCardiaca.calcularFca()));
	}
}
