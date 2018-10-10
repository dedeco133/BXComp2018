import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;



public class Teclado {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroCaso = sc.nextInt();
		String lixo = sc.nextLine();
		
		for (int i = 0; i < numeroCaso; i++) {
			String frase = sc.nextLine();
			String entradaSplit[];
			entradaSplit = frase.split("");
			int j = 0;
			int p=0;
			String aux[]=new String[10000000];
			aux
			
			while ( j < entradaSplit.length) {
				if (p==0){
					p++;
				}
				if (entradaSplit[p].equalsIgnoreCase(entradaSplit[p+1])) {
					entradaSplit[p]="";
					
				}
				
				System.out.print(entradaSplit[p]);
			}
		}
	}
}