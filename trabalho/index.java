package trabalho;




public class index {
	public static void main (String[] args) throws java.lang.Exception{
		
		cabecalho cabecalho1 = new cabecalho();
		System.out.println("=========================================================================");

		cabecalho1.nome = "NOME: Ricardo Gabriel Dias Vieira";

		cabecalho1.professor = "PROFESSOR: Brenno";

		cabecalho1.materia = "MATERIA: Algoritmos e Programação II";

		cabecalho1.faculdade = "FACULDADE: UNIFAN";
		cabecalho1.escrevaCabecalho();
		System.out.println("=========================================================================");

		int numeroAcertos = 0;
	    System.out.println("mensagem inicio do grupo 1");
	    // chama os métodos dos grupos
	    numeroAcertos = numeroAcertos + grupo2();
	    // grupo3
	    // grupo4
	    // grupoN
		System.out.println("mensagem fim do grupo 1");
		System.out.println("Fim do Quiz!  Parabéns... De 15 perguntas vc acertou: " + numeroAcertos);
	}
	
	public static int grupo2() {
	    int cont = 0; // contador de respostas corretas
	    String respostaUsuario = "";
	    // respostaUsuario = questao1.leiaResposta();
		System.out.println("=========================================================================");
	    Questao questao1 = new Questao();
	    questao1.pergunta = "De acordo com o próprio criador de Tom e Jerry, inicialmente este não era o nome dos personagens. Qual eram os nome que ele planejava colocar?  ";
	    questao1.opcaoA = "A - Jasper para o gato, e Jinx para o rato";
	    questao1.opcaoB = "B - Cris para o gato, e Leo para o  rato";
	    questao1.opcaoC = "C - Faunt para o gato, e Dippy para o rato";
	    questao1.opcaoD = "D - Norvill para o gato, e Faunt para o rato";
	    questao1.opcaoE = "E - Nenhuma das alternativas";
	    questao1.correta = "A"; // coloca aqui a opção correta da questão
	    questao1.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao1.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		 System.out.println
		("=========================================================================");
	    Questao questao2 = new Questao();
	    questao2.pergunta = "Qual é motivo do Mickey usar luvas? ";
	    questao2.opcaoA = "A - Para se tornar a carecteristica diferencial do personagem.";
	    questao2.opcaoB = "B - Por conta de contexto histórico.";
	    questao2.opcaoC = "C - Porque Walty Disney sempre usava luvas.";
	    questao2.opcaoD = "D - Para as crianças não se assustarem com as unhas do rato.";
	    questao2.opcaoE = "E - Nenhuma das alternativas.";
	    questao2.correta = "D"; // coloca aqui a opção correta da questão
	    questao2.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao2.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao3 = new Questao();
	    questao3.pergunta = "Há uma teoria envolvendo o desenho Bob Esponja que cada um dos personagens principais representam os sete pecados capitais. Nesta teoria as representações do Patrick seria:";
	    questao3.opcaoA = "A - Orgulho.";
	    questao3.opcaoB = "B - Gula.";
	    questao3.opcaoC = "C - Pregruiça.";
	    questao3.opcaoD = "D - Luxúria.";
	    questao3.opcaoE = "E - Inveja.";
	    questao3.correta = "C"; // coloca aqui a opção correta da questão
	    questao3.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao3.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao4 = new Questao();
	    questao4.pergunta = "Qual é o motivo do Gasparzinho ser um fantasma?";
	    questao4.opcaoA = "A - O autor gostava de filmes do genero 'terror', então decidiu colocar o personagem como um fantasma.";
	    questao4.opcaoB = "B - Na época,  existia uma lenda de um fantasma que ajudava os outros";
	    questao4.opcaoC = "C - Por conta do fantasma ser facilmente ilustrad.";
	    questao4.opcaoD = "D - Porque as crianças gostavam de personagens do tipo.";
	    questao4.opcaoE = "E - Por conta dele ser um menino, que faleceu, aos 12 anos de idade, devido a uma pneumonia.";
	    questao4.correta = "C"; // coloca aqui a opção correta da questão
	    questao4.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao4.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao5 = new Questao();
	    questao5.pergunta = "Qual o nome do criador do desenho Os Simpsons?";
	    questao5.opcaoA = "A -  Matt Groening";
	    questao5.opcaoB = "B - Seth MacFarlane";
	    questao5.opcaoC = "C - Mike Judge";
	    questao5.opcaoD = "D - Trey Parker";
	    questao5.opcaoE = "E - Dan Harmon";
	    questao5.correta = "A"; // coloca aqui a opção correta da questão
	    questao5.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao5.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao6 = new Questao();
	    questao6.pergunta = "Qual o nome do criador do desenho Os Simpsons?";
	    questao6.opcaoA = "A - 1939";
	    questao6.opcaoB = "B - 1940";
	    questao6.opcaoC = "C - 1941";
	    questao6.opcaoD = "D - 1942";
	    questao6.opcaoE = "E - 1943";
	    questao6.correta = "B"; // coloca aqui a opção correta da questão
	    questao6.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao6.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao7 = new Questao();
	    questao7.pergunta = "Qual personagem é conhecido por ser o melhor amigo do Pernalonga nos desenhos animados da Warner Bros?";
	    questao7.opcaoA = "A -  Patolino";
	    questao7.opcaoB = "B -  Frajola";
	    questao7.opcaoC = "C -  Piu-Piu";
	    questao7.opcaoD = "D -  Coiote";
	    questao7.opcaoE = "E -  Gaguinho";
	    questao7.correta = "E"; // coloca aqui a opção correta da questão
	    questao7.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao7.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao8 = new Questao();
	    questao8.pergunta = "Qual é o nome do cachorro falante na série Hora de Aventura?";
	    questao8.opcaoA = "A -  Jake";
	    questao8.opcaoB = "B -  Finn";
	    questao8.opcaoC = "C -  BMO";
	    questao8.opcaoD = "D -  Princesa Jujuba";
	    questao8.opcaoE = "E -  Marceline";
	    questao8.correta = "A"; // coloca aqui a opção correta da questão
	    questao8.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao8.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao9 = new Questao();
	    questao9.pergunta = "Qual é o nome do cachorro falante na série Hora de Aventura?";
	    questao9.opcaoA = "A -  Jake";
	    questao9.opcaoB = "B -  Finn";
	    questao9.opcaoC = "C -  BMO";
	    questao9.opcaoD = "D -  Princesa Jujuba";
	    questao9.opcaoE = "E -  Marceline";
	    questao9.correta = "A"; // coloca aqui a opção correta da questão
	    questao9.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao9.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao10 = new Questao();
	    questao10.pergunta = "Quem é o vilão principal na série He-Man e os Defensores do Universo";
	    questao10.opcaoA = "A -  Esqueleto";
	    questao10.opcaoB = "B -  Hordak";
	    questao10.opcaoC = "C -  Trap Jaw";
	    questao10.opcaoD = "D -  Homem-Fera";
	    questao10.opcaoE = "E -   Beast Man";
	    questao10.correta = "A"; // coloca aqui a opção correta da questão
	    questao10.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao10.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao11 = new Questao();
	    questao11.pergunta = "Em Avatar: A Lenda de Aang, quantos elementos existem que os dobradores podem controlar?";
	    questao11.opcaoA = "A -  3";
	    questao11.opcaoB = "B -  4";
	    questao11.opcaoC = "C -  5";
	    questao11.opcaoD = "D -  6";
	    questao11.opcaoE = "E -  7";
	    questao11.correta = "B"; // coloca aqui a opção correta da questão
	    questao11.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao11.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao12 = new Questao();
	    questao12.pergunta = "Qual é o nome do dragão de estimação de Mulan na animação da Disney?";
	    questao12.opcaoA = "A -  Mushu";
	    questao12.opcaoB = "B -  Cri-Kee";
	    questao12.opcaoC = "C -  Khan";
	    questao12.opcaoD = "D -  Ling";
	    questao12.opcaoE = "E -  Yao";
	    questao12.correta = "A"; // coloca aqui a opção correta da questão
	    questao12.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao12.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao13 = new Questao();
	    questao13.pergunta = "Qual é o nome do mascote alienígena da série Ben 10 que se transforma em diferentes formas?";
	    questao13.opcaoA = "A -  XLR8";
	    questao13.opcaoB = "B -  Quatro Braços";
	    questao13.opcaoC = "C -  Chama";
	    questao13.opcaoD = "D -  Besta";
	    questao13.opcaoE = "E -  Diamante";
	    questao13.correta = "D"; // coloca aqui a opção correta da questão
	    questao13.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao13.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao14 = new Questao();
	    questao14.pergunta = "Qual é o nome do anime de estimação do Bob Esponja?";
	    questao14.opcaoA = "A -  Billy";
	    questao14.opcaoB = "B -  Roger";
	    questao14.opcaoC = "C -  Bobby";
	    questao14.opcaoD = "D -  Gary";
	    questao14.opcaoE = "E -  Sparky";
	    questao14.correta = "D"; // coloca aqui a opção correta da questão
	    questao14.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao14.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");
		System.out.println
		("=========================================================================");
	    Questao questao15 = new Questao();
	    questao15.pergunta = "Qual o nome do coelho de pelúcia que é o melhor amigo de Christopher Robin em Ursinho Pooh?";
	    questao15.opcaoA = "A -  Leitão";
	    questao15.opcaoB = "B -  Bisonho";
	    questao15.opcaoC = "C -  Guru";
	    questao15.opcaoD = "D -  Abel";
	    questao15.opcaoE = "E -  Tigrão";
	    questao15.correta = "E"; // coloca aqui a opção correta da questão
	    questao15.escrevaQuestao();
	    respostaUsuario = questao1.leiaResposta();
	    if (questao15.isCorreta(respostaUsuario)){
	        cont++;
	    }
	    System.out.println("=========================================================================");


		return cont;

	}

	
   
}
