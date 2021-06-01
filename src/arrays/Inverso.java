package arrays;

import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Guardando datos");
		
		int numeros [] = new int[5];
		
		for(int i=0; i<5;i++) {
			
			System.out.println("Digita el número: "+ (i+1));
			numeros[i]=entrada.nextInt();
		}

		for(int j=(numeros.length-1); j>=0;j--) {
			System.out.println(numeros[j]);
		}
	}

}
