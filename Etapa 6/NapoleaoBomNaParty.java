import java.util.Scanner;

public class NapoleaoBomNaParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        for (int i = 0; i < n; i++) {
			int Fran = sc.nextInt();
			int en = sc.nextInt();
			int aux = en;
			int Cans = sc.nextInt();
			int quanEs = 24000;
			int dist = 0;
			while (dist < 24000) {
				if (en>=24) quanEs += 2400;
				else{
					quanEs += (en*100);
					dist += ((24-en)*100);
				}
				if (en<=0){
					en = aux;
					
				}
				else {
					en -= Cans;
					if(en<=0) en = 0;
				}
				if(quanEs > Fran){
					quanEs = Fran;
					break;
				}
			}
			System.out.println(quanEs);
		}
    }
}
