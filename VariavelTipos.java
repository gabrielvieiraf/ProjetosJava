//Exemplo 2: Tipos de variável
//Ao escolher um tipo para nossas variáveis, devemos nos atentar
//em suas características e também à quantidade de memória necessária para armazená-la.
public class VariavelTipos {
 
    public static void main(String[] args) {
       
        //Declaração de variáveis
        
        //Inteiros
        int a;     //Variável inteira   - Tamanho: 4 bytes/ 32 bits
        long b;    //Variável long      - Tamanho: 8 bytes/ 64 bits      
        byte c;    //Variável byte      - Tamanho: 1 byte / 8  bits
        short d;   //Variável short     - Tamanho: 2 bytes/ 16 bits
        
        //Pontos Flutuantes
        float e;   //Variável flutuante - Tamanho: 4 bytes/ 32 bits
        double f;  //Variável double    - Tamanho: 8 bytes/ 64 bits
        
        char g[] = new char[20]; //Variável carácter  - Tamanho: 2 bytes/ 16 bits
        
        boolean h; //Variável booleana (Variável lógica (verdadeiro/falso)))
               
       //Inicializando Variáveis
        
       a = 3;
       e = 2.14F; //Note que no float há a necessidade de colocar o F ou f ao final do número.
       f = 2.14;
        
       System.out.println("Resultado da soma: ");
       System.out.println(a+f);
        
       //A precisão que o ponto flutuante dá para a equação
       //é desnecessária no exemplo da soma
      
       //Agora veja a diferença entre os tipos em uma divisão não exata  
       //Ponto Flutuante
       //Double 
       System.out.println("Resultado da divisao: ");
       System.out.println(a/f);
       //Float 
       System.out.println("Resultado da divisao: ");
       System.out.println(a/e);
       //Inteiro  
       int var = a/2;
       System.out.println("Resultado da divisao: ");
       System.out.println(var);
       //No caso do inteiro, todas as casas após a vírgula são desconsideradas.
    }   
}
