package criarFuncoesEmJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//instacia a classe scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: \n");
		
		//variaveis de entrada
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//funcao que calcula qual o maior numero dentre os tres
		int higher = max(a,b,c);
		
		//funcao que exibe o resultado
		showResult(higher);
		
		//fecha o scanner
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z ) {
			aux = x;
		}
		else if (y > x && y >z) {
			aux = y;
		}
		else {
			aux = z;
		}
				
		return aux;
		
	}
	
	public static void showResult(int result) {
		System.out.println("higher: "+result);
	}
		
}
