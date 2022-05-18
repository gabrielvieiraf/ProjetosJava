/*
   Desenvolva um programa em Java que:
   - Declara variáveis inteiras, char e String;
   - Receba dois números inteiros e uma opção,
   - Calcula o produto dos dois números se eles forem positivos (ex.: p = n1 * n2),
   - Calcula o produtório do primeiro número, o número de vezes do segundo e mostra as informações (ex.: p = p * n1). <-- Ficou bem confuso isso aqui
     PS: Como não entendi o que você diz aqui, vou interpretar que  p = n1 * n1 * n2
   !! Usar estruturas de decisão e de múltipla escola
*/



import javax.swing.*;


class Exercicio {

    public static void main(String entrada[]){
        int num, num2;
        char op = '0';
        String msg = "", msgEntr = "Digite 1 para multiplicar se os numeros forem positivos\nDigite 2 calcular o produto dos numeros\n";


        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));

        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch (op) {

            case '1': 
                if ((num > 0) & (num2 > 0)) {
                    msg =  Integer.toString(num * num2);
                    break;
                }
                msg = "amigão, esses numeros são negativos";
                break;


            case '2': 
                msg = Integer.toString(num * num * num2);
                break;


            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
        }

        if (op == '1' || op == '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }



}