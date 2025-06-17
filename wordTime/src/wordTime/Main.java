package wordTime;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		List<String> listaPalavraSelecionada = new ArrayList<>();
		
		List<String> listaPalavrasDigitadas = new ArrayList<>();
		
		int score = 0;
		
		//DESENVOLVER MENU DE ESCOLHA DO TEMPO MINIMO
		
		while(true) {
			
			Words randomWord = new Words();
			
			System.out.println("A palavra selecionada é: "+randomWord.palavraSelecionada.toUpperCase() + "\n");
			
			//ADICIONANDO AS PALAVRAS SELECIONADAS NA LISTA
			listaPalavraSelecionada.add(randomWord.palavraSelecionada.toUpperCase());
			
			System.out.println("Digite a palavra: ");
			
			System.out.println();
			
			//CONTANDO O TEMPO QUE SE DIGITA A PALAVRA
			Instant startTime = Instant.now();
			
			String typedWord = scanner.nextLine();
			System.out.println();
			
			//ADICIONANDO AS PALAVRAS DIGITADAS NA LISTA
			listaPalavrasDigitadas.add(typedWord.toUpperCase());
			
			//FIM DA CONTAGEM
			Instant finishTime = Instant.now();
			
			//CAPTURANDO O TEMPO DA DURAÇÃO
			Duration duration = Duration.between(startTime, finishTime);
			
			float timeDuration = duration.toMillis();
			
			System.out.println("Tempo decorrido: " + duration.toMillis() + "ms");
			System.out.println();
			
			if(timeDuration > 5000) {
				
				System.out.println("Você perdeu!");
				System.out.println("Não Digitou em menos de 5s :(");
				
				break;
				
			}
		
		}
		
		//VERIFICANDO SE AS PALAVRAS ESTÃO IGUAIS E PONTUANDO
		for(int i = 0; i<listaPalavraSelecionada.size(); i++) {
			
			if(listaPalavraSelecionada.get(i).equals(listaPalavrasDigitadas.get(i))) {
				
				score += 50;
				
			}
			
		}
		
		System.out.println(listaPalavraSelecionada);
		System.out.println(listaPalavrasDigitadas);
		System.out.println("Sua pontuação: " + score);
		
	}
}
