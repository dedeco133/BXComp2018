import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Carregamento {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int itens = sc.nextInt();
			int Pesos[] = new int[itens];	
			for (int j = 0; j < itens; j++) {
				Pesos[j] = sc.nextInt();
			}
			int pessoas = sc.nextInt();
			int suporta[] = new int[pessoas];
			for (int j = 0; j < pessoas; j++) {
				suporta[j] = sc.nextInt();
			}
			
			//-------------------------------
			int aux=0;
			for (int j = 0; j < suporta.length; j++) {
				for (int j2 = 0; j2 < suporta.length-(j+1); j2++) {
					if (suporta[j2]<suporta[j2+1]) {
						aux = suporta[j2];
						suporta[j2] = suporta[j2+1];
						suporta[j2+1] = aux;
					}
				}
			}
			for (int j = 0; j < Pesos.length; j++) {
				//System.out.println("buuble");
				for (int j2 = 0; j2 < Pesos.length-(j+1); j2++) {
					if (Pesos[j2]<Pesos[j2+1]) {
						aux = Pesos[j2];
						Pesos[j2] = Pesos[j2+1];
						Pesos[j2+1] = aux;
					}
				}
			}
			
			//----------------------------------
			int somapesos = 0;
			int contador = 0;
			for (int j = 0; j < suporta.length; j++) {
				contador = 0;
				somapesos = 0;
				while (suporta[j]>somapesos&&contador<Pesos.length) {
					somapesos += Pesos[contador];			
					if (suporta[j]>somapesos) Pesos[contador] = 0;
					contador++;
				}
			}
			boolean verdade = false;
			for (int j = 0; j < Pesos.length; j++) {
				
				if (Pesos[j] != 0) {
					
					verdade = true;
					break;
				}
			}
			if (verdade==true) {
				System.out.println("Nao foi possivel carregar todos os itens");
			}else{
			System.out.println("Foi possivel carregar todos os itens");
			}
		}
	}
}

