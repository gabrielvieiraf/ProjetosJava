//Exemplo 3: Tipos de variável String e Char
//Exercício: Escreva seu nome e o inverta.
public class Escrita {
 
    public static void main(String[] args) {
               
       //Inicializando Variáveis
       
       char g[] = new char[8];
       String nome = "Gabriel";
       
       g[0] = 'G';
       g[1] = 'A';
       g[2] = 'B';
       g[3] = 'R';
       g[4] = 'I';
       g[5] = 'E';
       g[6] = 'L';
       g[7] = '\0'; //Representa fim de linha.
       
       //Imprime nome Letra por Letra
        
       /* Usamos a estrutura de repetição for para percorrer
       o vetor de caracteres a fim de imprimir na tela letra por letra
       Começamos na posição zero do vetor e percorremos ele até o fim do tamanho do vetor.
       conseguimos o tamanho do vetor através de length.*/
       
       for (int i=0; i<g.length; i++)
       		System.out.println(g[i]);
       
       //Imprime nome
       System.out.println(nome);
       
       /*Imprime nome Letra por Letra ao contrário
       Repare a diferença na lógica do for,onde ao invés de começarmos 
       no início do vetor, começamos no final e vamos decrescendo o índice 
       até chegar ao início.*/
        
       for (int j=g.length-1; j>=0; j--)
       		System.out.println(g[j]);
        
       //Pula linha
       System.out.println("\n");
        
       //Imprime nome ao contrário
       for(int k = nome.length()-1; k >= 0; k--)
         System.out.print(nome.charAt(k)); 

    }   
}
