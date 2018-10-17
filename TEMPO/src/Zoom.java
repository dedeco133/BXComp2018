import java.util.Scanner;


public class Zoom {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int disti;
		double restdist = 0; 
		double dist, zoom=0;
		int x,y,n;
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(x>=2 && x<=7){
				
				dist = y+2;
			}else{
				y = y+2;
				x = 1;
				dist = Math.sqrt((x*x)+(y*y));
				
			}
			
			disti = (int)dist;
				
			
			if(dist == 3)zoom = 1.5;
			else if(dist >3 && dist <=9) zoom = 2.5;
			else if(dist >9) zoom = 4;
			System.out.println(disti + " " + zoom + "x");
		}
		
	}
}

