package atividade9_logprog;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do texto
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        // Contadores
        int vog = 0, cons = 0, totLetras = 0, totPalavras = 0;

        // Percorre o texto caractere por caractere
        for (int i=0;i<texto.length();i++) {
            char caractere = Character.toLowerCase(texto.charAt(i));

            // Verifica se é uma letra do alfabeto
            if (caractere >= 'a' && caractere <= 'z') {
                totLetras++;

                // Verifica se é vogal
                if (Vogal(caractere)) {
                    vog++;
                } else {
                    cons++;
                }
            }
        }

        // Contar palavras no texto
        totPalavras = contPalavras(texto);

        // Exibir resultados
        System.out.println("Quantidade de vogais: " + vog);
        System.out.println("Quantidade de consoantes: " + cons);
        System.out.println("Quantidade total de letras: " + totLetras);
        System.out.println("Quantidade de palavras: " + totPalavras);

        sc.close();
    }

    // Método para verificar se um caractere é uma vogal
    public static boolean Vogal(char caractere) {
        return "aeiou".indexOf(caractere) != -1;
    }

    // Método para contar palavras no texto
    public static int contPalavras(String texto) {
        if (texto.trim().isEmpty()) {
            return 0;
        }
        return texto.trim().split("\\s+").length;
    }
}
