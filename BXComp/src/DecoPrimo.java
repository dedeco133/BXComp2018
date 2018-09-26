import java.util.Scanner;



public class DecoPrimo{

	public static void main(String[] args) {
		int s=0;
		int j=1;
		int primos[]=new int[100];
		int t=0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(s<100){
			for(i = 1 ; i<=(j/2);i++){
				if(j%i==0)t++;
			}
			if(t==2){
				primos[s]=i;
				s++;
			}
			j++;
		}
		int z;
		int x=0;
		for(int k=0; k<n; k++){
			z=sc.nextInt();
			while(z%primos[x]==0){
		
			z=z/primos[x];
			System.out.print(primos[x]);
			x++;
		}
		}
	}
}