package wordTime;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.print("                                                                 \n");
		System.out.print("██╗    ██╗ ██████╗ ██████╗ ██████╗ ████████╗██╗███╗   ███╗███████╗\n");
		System.out.print("██║    ██║██╔═══██╗██╔══██╗██╔══██╗╚══██╔══╝██║████╗ ████║██╔════╝\n");
		System.out.print("██║ █╗ ██║██║   ██║██████╔╝██║  ██║   ██║   ██║██╔████╔██║█████╗  \n");
		System.out.print("██║███╗██║██║   ██║██╔══██╗██║  ██║   ██║   ██║██║╚██╔╝██║██╔══╝  \n");
		System.out.print("╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝   ██║   ██║██║ ╚═╝ ██║███████╗\n");
		System.out.print(" ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝    ╚═╝   ╚═╝╚═╝     ╚═╝╚══════╝\n");
		System.out.print("                                                                 \n");

		
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			
			Words randomWord = new Words();
			
			System.out.println("A palavra selecionada é: "+randomWord.palavraSelecionada.toUpperCase() + "\n");
			
			System.out.println("Digite a palavra: ");
			
			System.out.println();
			
			
			
			//CONTANDO O TEMPO QUE SE DIGITA A PALAVRA
			Instant startTime = Instant.now();
			
			String typedWord = scanner.nextLine();
			
			//FIM DA CONTAGEM
			Instant finishTime = Instant.now();
			
			//CAPTURANDO O TEMPO DA DURAÇÃO
			Duration duration = Duration.between(startTime, finishTime);
			
			float timeDuration = duration.toMillis();
			
			System.out.println("Tempo decorrido: " + duration.toMillis() + "ms");
			
			if(timeDuration > 5000) {
				
				System.out.println("Você perdeu!");
				System.out.println("Não Digitou em menos de 5s :(");
				
				break;
				
			}
		
		}
	}
}
