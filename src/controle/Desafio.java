package controle;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");

        String dia = entrada.next();

        //equalsIgnoreCase permite que o usuario escreva a palavra com letras maiúsculas ou minusculas
        if("segunda".equalsIgnoreCase(dia)){
            System.out.println("1");
        }else if("terça".equalsIgnoreCase(dia)){ 
            System.out.println("2");
        }else if("quarta".equalsIgnoreCase(dia)){ 
            System.out.println("3");
        }else if("quinta".equalsIgnoreCase(dia)){ 
            System.out.println("4");
        }else if("sexta".equalsIgnoreCase(dia)){ 
            System.out.println("5");
        }else if("sabado".equalsIgnoreCase(dia)){ 
            System.out.println("6");
        }else if("domingo".equalsIgnoreCase(dia)){ 
            System.out.println("7");
        }else{ 
            System.out.println("Dia invalido!");
        }


        entrada.close();
    }
    
}