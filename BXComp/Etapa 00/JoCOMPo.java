import java.util.Scanner;

public class JoCOMPo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String J1 = "";
       String J2 = "";
       int rodadas=0,pontos1 =0, pontos2=0,partidas=0;
       partidas=sc.nextInt();
        for (int i = 0; i < partidas; i++) {
            rodadas =sc.nextInt();
            for (int j = 0; j < rodadas; j++) {
                J1=sc.next().toUpperCase();
                J2=sc.next().toUpperCase();
                
                switch(J1){
                    case "R":
                        if (J2.equals("S")) {
                         pontos1++;   
                        }
                        if (J2.equals("P")) {
                         pontos2++;   
                        }
                        break;
                    case "S":
                        if (J2.equals("P")) {
                         pontos1++;   
                        }
                        if (J2.equals("R")) {
                         pontos2++;   
                        }
                        break;
                    case "P":
                        if (J2.equals("R")) {
                         pontos1++;   
                        }
                        if (J2.equals("S")) {
                         pontos2++;   
                        }
                        break;
                }//Switch
            }//2 for
            
            
            if (pontos1>pontos2) {
                System.out.println("O primeiro jogador ganhou!");
            }
            else if (pontos1<pontos2) {
                System.out.println("O segundo jogador ganhou!");
            }else{
                System.out.println("O jogo terminou empatado!");
            }
            pontos1 =0;
            pontos2 =0;
        }
    }
}
