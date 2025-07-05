package wordTime;

import java.util.Random;

public class Words {

	String palavraSelecionadaHard;
	String palavraSelecionadaNormal;
	String palavraSelecionadaEasy;
	
	
	public Words() {
        this.sorting_word();
    }


	private void sorting_word() {
		
		Random random = new Random();
		
		String[] allWordsEasy = {
			    "casa", "gato", "pato", "bola", "mão", "sol", "lua", "pé", "vaca", "rato",
			    "mesa", "fogo", "carro", "paz", "vida", "mar", "rua", "ceu", "noite", "chao",
			    "olho", "copo", "vento", "livro", "luz", "flor", "faca", "peixe", "pao", "sapo",
			    "roupa", "porta", "amigo", "cafe", "filho", "doce", "leao", "ave", "nuvem", "navio",
			    "praia", "folha", "tinta", "beijo", "braco", "festa", "prato", "chuva", "farol", "pente",
			    "velha", "mundo", "linha", "tarde", "noivo", "fruta", "campo", "barco", "terno", "anel",
			    "dedo", "nariz", "papel", "pular", "sonho", "gelo", "voto", "motor", "janela", "banco",
			    "chave", "pilha", "quadro", "copos", "ninho", "passe", "veado", "cinto", "senha", "garra",
			    "trave", "pedra", "livre", "verde", "firme", "limpo", "alegre", "preto", "branco", "azul",
			    "sorte", "norte", "leste", "baixo", "vazio", "bonito", "certo", "morar", "andar", "grito"
			};
		
		int indexSelectionEasy = random.nextInt(allWordsEasy.length);
		
		String randomWordEasy = allWordsEasy[indexSelectionEasy];
		
		this.palavraSelecionadaEasy = randomWordEasy;
		
		String[] allWordsNormal = {
			    "computador",
			    "telefone",
			    "mensagem",
			    "trabalho",
			    "documento",
			    "cadeira",
			    "universidade",
			    "bicicleta",
			    "hospital",
			    "brasileiro",
			    "informação",
			    "conversar",
			    "importante",
			    "atividade",
			    "planejado",
			    "amizade",
			    "conhecido",
			    "distância",
			    "história",
			    "cidadania",
			    "solução",
			    "resposta",
			    "desenho",
			    "viagem",
			    "passagem",
			    "garantia",
			    "elevador",
			    "caminhada",
			    "atendimento",
			    "professor",
			    "matemática",
			    "gramática",
			    "explicação",
			    "educação",
			    "abertura",
			    "sentimento",
			    "expansão",
			    "liberdade",
			    "sociedade",
			    "tecnologia",
			    "carregador",
			    "presença",
			    "precisão",
			    "intenção",
			    "curiosidade",
			    "capacidade",
			    "importação",
			    "conclusão",
			    "residência",
			    "aplicação",
			    "comunidade",
			    "melhoria",
			    "decoração",
			    "reposição",
			    "ferramenta",
			    "computação",
			    "informativo",
			    "relatório",
			    "habilidade",
			    "instalação",
			    "combinação",
			    "organizado",
			    "resultado",
			    "cooperativa",
			    "transporte",
			    "garantido",
			    "participar",
			    "conectando",
			    "servidores",
			    "preferência",
			    "tradição",
			    "companhia",
			    "alimentação",
			    "experiência",
			    "repetição",
			    "observação",
			    "motivação",
			    "formulário",
			    "cidadão",
			    "benefício",
			    "consciente",
			    "preparação",
			    "equipamento",
			    "diversidade",
			    "possível",
			    "realidade",
			    "manutenção",
			    "configurar",
			    "atualizado"
			};
		
		int indexSelectionNormal = random.nextInt(allWordsNormal.length);
		
		String randomWordNormal = allWordsNormal[indexSelectionNormal];
		
		this.palavraSelecionadaNormal = randomWordNormal;
		
		String[] allWordsHard = {
				"desconsoladamente",
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
		
		
		
		int indexSelectionHard = random.nextInt(allWordsHard.length);
		
		String randomWordHard = allWordsHard[indexSelectionHard];
		
		this.palavraSelecionadaHard = randomWordHard;
		
	}
}
