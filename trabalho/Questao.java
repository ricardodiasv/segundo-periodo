package trabalho;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Questao {

    public String pergunta;
    public String opcaoA;
    public String opcaoB;
    public String opcaoC;
    public String opcaoD;
    public String opcaoE;
    public String correta;
        
    public String leiaResposta() {
	    Scanner ler = new Scanner(System.in);
	    String resp;
	    do {
			System.out.println("Digite a resposta: ");
			resp = ler.next();
		} while (!respostaValida(resp));
		return resp;
	}


    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            return false;
        }
    }

    
    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
    
    

    public static boolean respostaValida(String resp){
	    if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") || 
	    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
	       return true;
	    }
	    System.out.println("Resposta inválida ... ");
	    return false;
	}
}
