package com.mycompany.arraylist;

/**
 *
 * @author ryann
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MeuArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Caso queira encerrar o progama escreva 'sair' para ver os elementos e o tamanho do seu vetor");
        
        //ele vai fazer esse while até que o usuario digite 'sair' para fechar o progama
        while (true) {
            System.out.println("Digite um elemento: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            arrayList.add(input);
        }

        //Mostra os elementos digitado pelo usuario
        System.out.println("Elementos na lista:");
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
        
        //Aqui ele vai pegar o tamanho do array
        System.out.println("\n Tamanho do vetor: " + arrayList.size());
        
        //Para o scanner
        scanner.close();
    }
}