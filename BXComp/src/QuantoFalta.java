import java.util.Scanner;

public class QuantoFalta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String Inicio = sc.next();
			String arrayInicio[] = new String[3];
			String arrayFim[] = new String[3];
			arrayInicio = Inicio.split(":");
			String Fim = sc.next();
			arrayFim = Fim.split(":");
			char[] CharHoraInicio = arrayInicio[0].toCharArray();
			char[] CharMinInicio = arrayInicio[1].toCharArray();
			char[] CharSegInicio = arrayInicio[2].toCharArray();
			
			char[] CharHoraFim = arrayFim[0].toCharArray();
			char[] CharMinFim = arrayFim[1].toCharArray();
			char[] CharSegFim = arrayFim[2].toCharArray();
			int HoraInicio;
			if(CharHoraInicio.length == 1) HoraInicio = CharHoraInicio[0]-48;
			else {
				HoraInicio = (CharHoraInicio[0]-48)*10 +CharHoraInicio[1];
			
			}
			int MinutoInicio = CharMinInicio[0]-48;
			
			int SegundoInicio = CharSegInicio[0]-48;

			int HoraFim = 0;
			if(CharHoraFim.length == 1) HoraFim = CharHoraFim[0]-48;
			else {
				HoraInicio = (CharHoraFim[0]-48)*10 +CharHoraFim[1];
				Sy
			}
			int MinutoFim = CharMinFim[0]-48;
			int SegundoFim = CharSegFim[0]-48;

			int totalInicio = 0;
			int totalFim = 0;
			int Resultado = 0;
			
			totalInicio = (HoraInicio*3600)+MinutoInicio*60+SegundoInicio;
			totalFim = (HoraFim*3600)+MinutoFim*60+SegundoFim;
			Resultado = totalFim-totalInicio;
			int resultHora = 00;
			int resultMin = 00;
			int resultSeg = 00;
			
			while(Resultado>0){
				while (Resultado>=3600){
					Resultado = Resultado - 3600;
					resultHora ++;
				}
				while (Resultado>=60){
					Resultado = Resultado - 60;
					resultMin ++;
				}
				while (Resultado>0){
					Resultado = Resultado - 1;
					resultSeg ++;
				}
			}
			System.out.println(resultHora+":"+resultMin+":"+resultSeg);
			
		}
		
	}
}