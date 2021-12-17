import java.util.Scanner;
//1.	Ler dois valores inteiros:
//•	e se forem iguais, mostrar “Números iguais”;
//•	caso contrário, apresentar a diferença do maior pelo menor.

public class DiferencaEntreNumeros {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1, num2, diferenca;

        System.out.print("Por favor informe um número: ");
        num1 = entrada.nextInt();
        System.out.print("Por favor informe outro número: ");
        num2 = entrada.nextInt();

        if (num1 == num2){
            System.out.print("Os números são iguais");
        } else {
            if (num1 > num2){
                diferenca = num1 - num2;
                System.out.println("Os números não são iguais, e a diferença do maior para o menor é: " + diferenca);
            } else {
                diferenca = num2 - num1;
                System.out.println("Os números não são iguais, e a diferença do maior para o menor é: " + diferenca);
            }
        }
        entrada.close();
    }
}