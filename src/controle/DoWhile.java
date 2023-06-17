package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do{ 
            System.out.print("Digite as palavras magicas: ");
            texto = entrada.nextLine();

        }while(!texto.equalsIgnoreCase("Por favor"));

        System.out.print("Obrigado!");
        entrada.close();

 }
}
