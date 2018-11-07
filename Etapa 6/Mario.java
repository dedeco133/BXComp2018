import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
			int pe = sc.nextInt();
			int disp = sc.nextInt();
			if (pe == 0 && disp == 0) break;
			int[] aDispo =  new int[disp];
			int aBura = 0; 
			for (int i = 0; i < disp; i++) {
				aDispo[i] = sc.nextInt();
			}
			int aux = 1;
			int auxBura = 0;
			int nSeq = 0;
			int nOpe = 0;
			for (int i = 0; i < aDispo.length; i++) {
				if(aux == aDispo[i]) nSeq++;
				else auxBura++;
				if(aBura>auxBura) aBura = auxBura;
				auxBura = 0;
				if(nSeq == pe) System.out.println(nOpe);
			}
			
		}
    }
}
