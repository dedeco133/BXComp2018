import java.util.Scanner;
import java.*;

import com.sun.javafx.image.impl.ByteIndexed.ToIntArgbAnyConverter;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class SeteaUm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n =  scan.nextInt();
		String respostr;
		double resp;
		for (int k = 0; k < n; k++) {
			char []prime = new char [40];
			String prim = scan.next();
			String st = scan.next();
			char []segu = new char [40];
			String seg = scan.next();
			double a = 0;
			double b = 0;
			prime = prim.toCharArray();
			segu = seg.toCharArray();
			for (int i = 0; i < prime.length; i++) {
				if (prime[i] == '7') {
					prime[i] = '0';
					System.out.println(prime[i]);	
				}
				a = a + prime[i]*Math.pow(10, i);
			}
			for (int i = 0; i < segu.length; i++) {
				if (segu[i] == '7') {
					segu[i] = '0';
					System.out.println(segu[i]);
				}
				b = b + segu[i]*Math.pow(10, i);
			}	
			switch (st) {
			case "+":
				resp = a + b;
				double []array= new double[1];
				array[0]=resp;
				String s = array.toString();
				char[] c =s.toCharArray();
				
				System.out.println(c[0]);
				break;
				
			case "x":
				
				break;

			}
			resp = 0;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for (int i = n; i > 0; i--) {
			int a = scan.nextInt();
			String st = scan.next();
			int b = scan.nextInt();
			
			switch (st) {
			case "+":
				resp = a+b;
				respostr = ""+resp;
				if(respostr.contains("7")){
					System.out.println("Entrou aqui");
					respostr.replaceAll("0","7");
					System.out.println(respostr);
					if (respostr.startsWith("0")) {
						System.out.println(respostr.replaceFirst("","0"));
					}else{
						System.out.println(respostr);
					}
				}
				if(resp == 7){
					System.out.println("0");
				}else System.out.println(resp);
				break;
				
			case "x":
				resp = a*b;
				if(resp == 7){
					System.out.println("0");
				}else System.out.println(resp);
				break;

			}
			resp = 0;
		}*/
	}
}
