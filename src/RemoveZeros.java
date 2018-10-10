import java.util.Scanner;

public class RemoveZeros {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroCaso = sc.nextInt();
		String lixo = sc.nextLine();
		
		for (int i = 0; i < numeroCaso; i++) {
			String frase = sc.nextLine();
			String entradaSplit[];
			entradaSplit = frase.split("");
			for (int j = 0; j < entradaSplit.length; j++) {
				if (entradaSplit[j].equals(entradaSplit[j+1])) {
					entradaSplit[j] = "";
				}
				System.out.print(entradaSplit[j]);
			}
			System.out.println();
		}


	}

}