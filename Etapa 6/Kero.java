import java.util.Scanner;

public class Kero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kero;
        int c = sc.nextInt();
        for (int i = 0; i<c; i++){
        	kero = sc.nextInt();
        	System.out.println(kero%3);
        }
    }
}
