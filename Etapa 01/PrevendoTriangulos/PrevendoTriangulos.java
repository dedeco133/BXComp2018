import java.util.Scanner;

public class PrevendoTriangulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double []lados = new double[3];
		int ladospossiveis = 0;
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			double []x = new double[m];
			double []y = new double[m];
			for (int j = 0; j < m; j++) {
				x[j]= sc.nextDouble();
				y[j]= sc.nextDouble();
			}
			for (int j = 0; j < m-2; j++) {
				for (int j2 = j+1; j2 < m-1; j2++) {
					for (int k = j2+1; k < m; k++) {
						lados[0] = (double)(Math.pow(Math.pow(x[j]-x[j2], 2.0)+Math.pow(y[j]-y[j2], 2.0), (1.0/2.0)));
						lados[1] = (double)(Math.pow(Math.pow(x[j2]-x[k], 2.0)+Math.pow(y[j2]-y[k], 2.0), (1.0/2.0)));
						lados[2] = (double)(Math.pow(Math.pow(x[k]-x[j], 2.0)+Math.pow(y[k]-y[j], 2.0), (1.0/2.0)));
						if(lados[0] > lados[1] && lados[0] > lados[2]){
							if (lados[1]+lados[2] > lados[0]) {
								ladospossiveis++;
							}
						}
						if(lados[1] > lados[2] && lados[1] > lados[0]){
							if (lados[2]+lados[0] > lados[1]) {
								ladospossiveis++;
							}
						}
						if(lados[2] > lados[1] && lados[2] > lados[0]){
							if (lados[1]+lados[0] > lados[2]) {
								ladospossiveis++;
							}
						}
					}
				}
			}
			System.out.println(ladospossiveis);
			ladospossiveis = 0;
		}
	}
}
