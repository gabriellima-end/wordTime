package wordTime;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	//FORMALIZAR UM ERRO CASO USUÁRIO DIGITE LETRAS AO INVÉS DE NÚMERO NOS MENUS
	
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
		
		int escolhaDificuldade = 0;
		
		int escolhaDuracao = escolhaTempo;
		
		int scoreSum = 0;
		
		int scoreSumDificuldade = 0;
		
		
		
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
		
		//MENU DA ESCOLHA DA DIFICULDADE DAS PALAVRAS
		while(true) {
			System.out.println("Escolha a dificuldade das Palavras Selecionadas");
			System.out.println("1 - Fácil : 15 pontos");
			System.out.println("2 - Normal : 35 pontos");
			System.out.println("3 - Dificil : 50 pontos");
			System.out.println();
			
			escolhaDificuldade = scanner.nextInt();
			System.out.println();
			scanner.nextLine();
			
			if(escolhaDificuldade >= 1 && escolhaDificuldade <= 3) {
				
				switch(escolhaDificuldade) {
				case 1 :
					scoreSumDificuldade = 15;
					break;
					
				case 2 : 
					scoreSumDificuldade = 35;
					break;
					
				case 3 :
					scoreSumDificuldade = 50;
					break;
					
			}
				
				break;
				
			}else {
				
				System.out.println("Dificuldade INVÁLIDA, escolha uma dificuldade VÁLIDA!\n");
				
			}
			
		}
		
		//CONTAGEM REGRESSIVA------------------------
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
		//FIM CONTAGEM REGRESSIVA-------------------
		
		//DIGITAÇÃO
		while(true) {
			
			Words randomWord = new Words();
			
			if(escolhaDificuldade == 3) {
				
				System.out.println("A palavra selecionada é: "+randomWord.palavraSelecionadaHard.toUpperCase() + "\n");
				//ADICIONANDO AS PALAVRAS SELECIONADAS NA LISTA
				listaPalavraSelecionada.add(randomWord.palavraSelecionadaHard.toUpperCase());
				
			}else if(escolhaDificuldade == 2) {
				
				System.out.println("A palavra selecionada é: "+randomWord.palavraSelecionadaNormal.toUpperCase() + "\n");
				//ADICIONANDO AS PALAVRAS SELECIONADAS NA LISTA
				listaPalavraSelecionada.add(randomWord.palavraSelecionadaNormal.toUpperCase());
				
			}else if(escolhaDificuldade == 1) {
				
				System.out.println("A palavra selecionada é: "+randomWord.palavraSelecionadaEasy.toUpperCase() + "\n");
				//ADICIONANDO AS PALAVRAS SELECIONADAS NA LISTA
				listaPalavraSelecionada.add(randomWord.palavraSelecionadaEasy.toUpperCase());
				
			}
			
			System.out.println("Digite a palavra: ");
			
			System.out.println();
			
			//CONTANDO O TEMPO QUE SE DIGITA A PALAVRA---------------------
			Instant startTime = Instant.now();
			
			String typedWord = scanner.nextLine();
			System.out.println();
			
			//ADICIONANDO AS PALAVRAS DIGITADAS NA LISTA
			listaPalavrasDigitadas.add(typedWord.toUpperCase());
			
			//FIM DA CONTAGEM-----------------------------------------------
			Instant finishTime = Instant.now();
			//--------------------------------------------------------------
			
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
		
		int palavrasCorretas = 0;
		
		//VERIFICANDO SE AS PALAVRAS ESTÃO IGUAIS E PONTUANDO
		for(int i = 0; i<listaPalavraSelecionada.size(); i++) {
			
			if(listaPalavraSelecionada.get(i).equals(listaPalavrasDigitadas.get(i))) {
				
				score += scoreSum;
				score += scoreSumDificuldade;
				palavrasCorretas += 1;
				
			}
			
		}
		
		System.out.println("Sua pontuação: " + score +"\n");
		System.out.println("Palavras corretas: "+ palavrasCorretas);
		System.out.println();
		System.out.println("Palavras sorteadas: "+listaPalavraSelecionada);
		System.out.println("Palavras digitadas: "+listaPalavrasDigitadas);
		
		
	}
	
	
	public static int formataTempo(int tempo) {
		
		tempo = tempo * 1000;
		
		return tempo;
	}
	
	
	
}
