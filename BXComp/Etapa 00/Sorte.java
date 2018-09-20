import java.util.Scanner;
public class Sorte {

	public static void main (String[] args){

          Scanner s = new Scanner(System.in);
          int numduelos = s.nextInt();
     
          int x = 0 ; 
          int y = 0 ; 
          int somay = 0 , somax = 0 ;
          int bonusx = 1;
          int bonusy = 1;
          int w[] = new int[numduelos]; 
          int c[] = new int[numduelos];
            for(int i = 0; i<numduelos; i++){
              for(int j = 0 ; j<6 ; j++){

              x = s.nextInt(); 
              y = s.nextInt(); 
              
              somax = somax+(x*bonusx);
              somay = somay+(y*bonusy); 
                  
                    if(x==6){
                        if(bonusx==0) bonusx=1;
                        else bonusx=2;
                    }
                  
                    else if(x==1){
                        if(bonusx==0) bonusx=1;
                        else bonusx=0;
                    }
                    
                    else{bonusx=1;}
                    
                    
                    if(y==6){
                      if(bonusy==0) bonusy=1;
                        else bonusy=2;
                    }
                    else if(y==1){
                        if(bonusy==0) bonusy=1;
                        else bonusy=0;
                    }
                    else
                    {bonusy =1;}
                       
                  
              }
              w[i]=somax;
              c[i]=somay;
                
                somax = 0;
                somay = 0;
                bonusx = 1;
                bonusy=1;
          }
           for(int i=0;i<numduelos;i++){
               
           
          if(w[i]>c[i]){
                System.out.println("Wanessa venceu com "+w[i]+" pontos");
                }else if(w[i]<c[i]){
                System.out.println("Camargo venceu com "+c[i]+" pontos");
                }else{
                System.out.println("De acordo com os dados nao ha vencedores");
                }
           }
	}
       
}

