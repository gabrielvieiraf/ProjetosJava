import javax.swing.JOptionPane;


/*
 TO-DO:
 Com os conhecimentos adquiridos até agora,
 desenvolva um programa em Java que:
 - Declara variáveis inteiras, reais e String - OK
 - Recebe dois números inteiros usando interface com usuário -OK
 - Calcule:
    - O quociente da divisão dos dois números -OK
    - Potência do primeiro número pelo segundo número OK
 - Mostre essas informações usando interface com usuário -OK
*/


// Classe calculadora contém métodos separados para receber input, calcular potencia, calcular divisão e mostrar na tela
// Essa forma de desenvolver o código permite com que ele se torne mais genralista para outros casos.


public class Calculadora {


    // Método onde faremos os inputs
    public int[] InputCalc() {
        int Number1;
        int Number2;
        int Numeros[] = new int[2];


        // Variável do tipo string permite com que peguemos o input dado 
        String numero1 = JOptionPane.showInputDialog(null, "Insira o primeiro numero inteiro", "Calculadora",
        JOptionPane.INFORMATION_MESSAGE);


        // Transformamos o input dado em um número inteiro
        Number1 = Integer.parseInt(numero1);


        String numero2 = JOptionPane.showInputDialog(null, "Insira o segundo numero inteiro", "Calculadora",
                JOptionPane.INFORMATION_MESSAGE);
        Number2 = Integer.parseInt(numero2);
        
        // Atribuindo valores ao vetor
        Numeros[0] = Number1;
        Numeros[1] = Number2;
    
        return Numeros;
    }


    // Temos dois métodos estáticos que servirão para efetuar os calculos 
    public static Double Divisao(Integer Number1, Integer Number2) {
        // Variável do tipo double permite com que o resultado da divisão de dois inteiros seja mostrado de forma decimal
        Double resultado = Double.valueOf(Number1) / Double.valueOf(Number2);
        return resultado;
    }


    public static Double Potencia(Integer Number1, Integer Number2) {
        // Variável do tipo double permite com que o resultado da divisão de dois inteiros seja mostrado de forma decimal
        Double resultado = Math.pow(Double.valueOf(Number1), Double.valueOf(Number2));
        return resultado;
    }


    // Essa será o unico método que o usuário precisará chamar na main
    public void MostraResultados() {
        // Caso algum espero queira digitar algo que não seja um numero inteiro, fazemos um tratamento de erro
        try
        {
            int numeros[] = InputCalc();
            Double ResultadoPotencia = Potencia(numeros[0], numeros[1]);
            Double ResultadoDivisao = Divisao(numeros[0], numeros[1]);
    
            String mensagem =  String.format(
                "O resultado de %d ^ % d = %.2f \ne o resultado de   %d / % d = %.2f",
                numeros[0], numeros[1], ResultadoPotencia, numeros[0], numeros[1], ResultadoDivisao);
            
            JOptionPane.showMessageDialog(null, mensagem, "Calculadora",
            JOptionPane.PLAIN_MESSAGE);
        }
        catch(NumberFormatException e) {
            String mensagem = String.format("Eu disse pra digitar um número inteiro, rs.\nERRO:\n%s", e);
            JOptionPane.showMessageDialog(null, mensagem, "ERRO Calculadora",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}


class MyCalculator {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.MostraResultados();
        System.exit(0);
    }
}

