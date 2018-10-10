import java.util.Scanner;

public class CifraDaAlma {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeroCasos = sc.nextInt();
		String lixo = sc.nextLine();
		for (int i = 0; i < numeroCasos; i++) {
			
			String entrada = sc.nextLine();
			String entradaSplit[];
			entradaSplit = entrada.split("");
			for (int j = 0; j < entradaSplit.length; j++) {
				switch (entradaSplit[j]) {
				case "A":
					entradaSplit[j] = "N";
					break;
				case "B":
					entradaSplit[j] = "O";
					break;
				case "C":
					entradaSplit[j] = "P";
					break;
				case "D":
					entradaSplit[j] = "Q";
					break;
				case "E":
					entradaSplit[j] = "R";
					break;
				case "F":
					entradaSplit[j] = "S";
					break;
				case "G":
					entradaSplit[j] = "T";
					break;
				case "H":
					entradaSplit[j] = "U";
					break;
				case "I":
					entradaSplit[j] = "V";
					break;
				case "J":
					entradaSplit[j] = "W";
					break;
				case "K":
					entradaSplit[j] = "X";
					break;
				case "L":
					entradaSplit[j] = "Y";
					break;
				case "M":
					entradaSplit[j] = "Z";
					break;
				case "N":
					entradaSplit[j] = "A";
					break;
				case "O":
					entradaSplit[j] = "B";
					break;
				case "P":
					entradaSplit[j] = "C";
					break;
				case "Q":
					entradaSplit[j] = "D";
					break;
				case "R":
					entradaSplit[j] = "E";
					break;
				case "S":
					entradaSplit[j] = "F";
					break;
				case "T":
					entradaSplit[j] = "G";
					break;
				case "U":
					entradaSplit[j] = "H";
					break;
				case "V":
					entradaSplit[j] = "I";
					break;
				case "W":
					entradaSplit[j] = "J";
					break;
				case "X":
					entradaSplit[j] = "K";
					break;
				case "Y":
					entradaSplit[j] = "L";
					break;
				case "Z":
					entradaSplit[j] = "M";
					break;
				case " ":
					entradaSplit[j] = " ";
					break;	
				}
				System.out.print(entradaSplit[j]);
			}
			System.out.println();
			
		}
		
	}

}