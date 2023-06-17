package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int quantidaDedeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){ 
            System.out.print("Digite a nota ou -1 para sair: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){ 
                quantidaDedeNotas ++;
                total += nota;
            }else if(nota != -1){
                System.out.print("Nota invalida!"); 
            }
        }

        double media = total / quantidaDedeNotas;
        System.out.print("Média da turma: " + media);


        entrada.close();

    }
    
}
