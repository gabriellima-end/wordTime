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
		System.out.print("BY: Gabriel Lima \n");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> listaPalavraSelecionada = new ArrayList<>();
		
		List<String> listaPalavrasDigitadas = new ArrayList<>();
		
		int score = 0;
		
		int escolhaTempo = 0;
		
		int escolhaDuracao = escolhaTempo;
		
		int scoreSum = 0;
		
		int segundosEscolhido = formataTempo(escolhaDuracao);
		
		//MENU ESCOLHA DO TEMPO
		while(true) {
			System.out.println("Escolha o tempo mínimo para digitação:");
			System.out.println("1 - 1s (impossível) : 500 pontos");
			System.out.println("2 - 2s (díficil) : 300 pontos");
			System.out.println("3 - 3s (médio) : 150 pontos");
			System.out.println("4 - 4s (normal) : 100 pontos");
			System.out.println("5 - 5s (fácil) : 50 pontos");
			System.out.println();
			
			escolhaTempo = scanner.nextInt();
			System.out.println();
			scanner.nextLine(); // CONSOME O "\n" PENDENTE

			escolhaDuracao = escolhaTempo;
			
			scoreSum = 0;
			
			segundosEscolhido = formataTempo(escolhaDuracao);
			
			if(escolhaTempo >= 1 && escolhaTempo <= 5) {
				
				switch(escolhaTempo) {
				case 1 :
					scoreSum = 500;
					break;
					
				case 2 : 
					scoreSum = 300;
					break;
					
				case 3 :
					scoreSum = 150;
					break;
					
				case 4 :
					scoreSum = 100;
					break;
				
				case 5 : 
					scoreSum = 50;
					break;
					
			}
				
				break;
				
			}else {
				
				System.out.println("Tempo INVÁLIDO, escolha um tempo VÁLIDO!\n");
				
			}
		}
		
		//CONTAGEM REGRESSIVA
		try {
			
            for (int i = 3; i > 0; i--) {
            	
                System.out.println(i + "...");
                
                Thread.sleep(1000);
            }
            
            System.out.println();
            System.out.println("Vai! \n");
            
        } catch (InterruptedException e) {
        	
            System.out.println("A contagem foi interrompida.");
            
        }
		
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
			
			if(timeDuration > segundosEscolhido) {
				
				System.out.println("Você perdeu!");
				System.out.println("Não Digitou em menos de "+ escolhaDuracao +"s"+" :(");
				System.out.println();
				
				break;
				
			}
		
		}

		//***DEV*** A ÚLTIMA PALAVRA DIGITADA, SE CERTA, AINDA PONTUA 
		//MESMO QUE EM UM TEMPO MAIOR QUE O PERMITIDO *CORRIGIR
		
		//VERIFICANDO SE AS PALAVRAS ESTÃO IGUAIS E PONTUANDO
		for(int i = 0; i<listaPalavraSelecionada.size(); i++) {
			
			if(listaPalavraSelecionada.get(i).equals(listaPalavrasDigitadas.get(i))) {
				
				score += scoreSum;
				
			}
			
		}
		
		System.out.println("Sua pontuação: " + score);
		System.out.println();
		System.out.println("Palavras sorteadas: "+listaPalavraSelecionada);
		System.out.println("Palavras digitadas: "+listaPalavrasDigitadas);
		
		
	}
	
	
	public static int formataTempo(int tempo) {
		
		tempo = tempo * 1000;
		
		return tempo;
	}
	
	
	
}