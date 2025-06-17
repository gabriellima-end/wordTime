package wordTime;

import java.util.Random;

public class Words {

	String palavraSelecionada;
	
	
	public Words() {
        this.sorting_word();
    }


	private void sorting_word() {
		
		String[] allWords = {"desconsoladamente",
			    "desproporcionalmente",
			    "inacreditavelmente",
			    "inconstitucionalmente",
			    "inexplicavelmente",
			    "intransigentemente",
			    "desenvolvimento",
			    "desproporcionalidade",
			    "desorganizações",
			    "desconfiadoramente",
			    "desvalorizadamente",
			    "desinteressadoramente",
			    "desestimulantes",
			    "desestabilização",
			    "profissionalismo",
			    "desvalorizadoramente",
			    "intransitivamente",
			    "intransponivelmente",
			    "desvinculadamente",
			    "psicologicamente",
			    "descongestionante",
			    "intransmutavelmente",
			    "desestabilizantes",
			    "despropositadamente",
			    "intransparência",
			    "desorganizadoramente",
			    "desproporcional",
			    "inacessivelmente",
			    "desrespeitosamente",
			    "desinteressados",
			    "inconscientemente",
			    "desapontadamente",
			    "desconfortavelmente",
			    "desenvolvimentos",
			    "desrespeitadoramente",
			    "desencorajadora",
			    "incompreensível",
			    "desconhecimento",
			    "desqualificadamente",
			    "desconectividade",
			    "desencorajamento",
			    "transcontinental",
			    "satisfatoriamente",
			    "incontestavelmente",
			    "desvinculadoramente",
			    "anticonstitucional",
			    "desaparecimento",
			    "desconfortável",
			    "incontrolavelmente",
			    "desencadeamento",
			    "incompatibilidade",
			    "desencantamento",
			    "desaparecimentos",
			    "desconsoladoramente",
			    "incompativelmente",
			    "desencorajantemente",
			    "desqualificadoramente",
			    "desinteressantemente",
			    "ininteligivelmente",
			    "ininterruptamente",
			    "inconstitucional",
			    "responsavelmente",
			    "inexpressivamente",
			    "desestabilizadoramente",
			    "desqualificadora",
			    "inquestionável",
			    "desinteressadamente",
			    "extraordinário",
			    "inquestionavelmente",
			    "desorganização",
			    "intransmissivelmente",
			    "inexoravelmente",
			    "desconfiadamente",
			    "involuntariamente",
			    "desnecessariamente",
			    "revolucionariamente",
			    "descongestionantemente",
			    "desnecessariedade",
			    "desprotegidamente",
			    "desinteressante",
			    "incompreensivelmente",
			    "incomunicavelmente",
			    "desconhecidamente",
			    "desencadeadoramente",
			    "desqualificação",
			    "desencantadoramente",
			    "desconcentrados"};
		
		Random random = new Random();
		
		int indexSelection = random.nextInt(allWords.length);
		
		String randomWord = allWords[indexSelection];
		
		this.palavraSelecionada = randomWord;
		
	}
}
