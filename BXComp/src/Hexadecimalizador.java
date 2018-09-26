import java.util.*;
public class Hexadecimalizador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hexa[] = new int[7]; 
		int n = sc.nextInt();
		int dec;
		int j;
		int aux = 0;
		for (int i = 0; i < n; i++) {
			dec = sc.nextInt();
			j = 0;
			while (aux!=0 || dec != 0) {
				aux = dec%16;
				dec = dec/16;
				hexa[j] = aux;
				j++;
			}
			for (int k = j-2; k >= 0; k--) {
				if (hexa[k] < 10) {
					System.out.print(hexa[k]);
				}else{
					switch (hexa[k]) {
					case 10:
						System.out.print("A");
						break;
					case 11:
						System.out.print("B");
						break;
					case 12:
						System.out.print("C");
						break;
					case 13:
						System.out.print("D");
						break;
					case 14:	
						System.out.print("E");
						break;
					case 15:
						System.out.print("F");
						break;
					}
				}
			}
			System.out.println("");
		}
	}
}

