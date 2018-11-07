import java.util.Scanner;

// Boa Sorte!

public class SequenciaAlienigena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atual = 1;
        int n = sc.nextInt();
        int ulti = 1;
        int penul = 0;
       while (n != -1 ) {
    	   if(n == 0) atual = 0;
    	   for(int i =2;i<=n;i++){
    		   atual = ulti + penul;
    		   penul = ulti;
    		   ulti = atual;
    	   }
    	   ulti = 1;
    	   penul = 0;
    	   System.out.println(atual);
    	   atual = 1;
    	   n = sc.nextInt();
       }
    }
}
