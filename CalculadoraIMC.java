import java.util.Locale;
import java.util.Scanner;

/*
ENUNCIADO DO EXERCÍCIO:

Desenvolva um programa em Java que calcule o Índice de Massa Corporal (IMC)
de uma pessoa.

O programa deve:
- Solicitar ao usuário o peso (em quilogramas).
- Solicitar ao usuário a altura (em metros).
- Calcular o IMC utilizando a seguinte fórmula:

IMC = peso / (altura * altura)

- Exibir o valor do IMC calculado.
- Exibir a classificação do IMC de acordo com a tabela padrão.

Tabela de Classificação do IMC:

IMC (kg/m²)              Classificação
------------------------------------------------
Abaixo de 17             Muito abaixo do peso
17 até 18,49             Abaixo do peso
18,5 até 24,99           Peso normal
25 até 29,99             Acima do peso
30 até 34,99             Obesidade I
35 até 39,99             Obesidade II (severa)
Acima de 40              Obesidade III (mórbida)

Observação:
O IMC é uma ferramenta de triagem e não representa um diagnóstico definitivo.
Para uma avaliação completa da saúde, consulte um profissional especializado.
*/

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // aceita ponto como separador decimal

        System.out.println("=== CALCULADORA DE IMC ===");
        System.out.println("Informe os dados abaixo:");
        System.out.println();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        System.out.println();
        System.out.printf("IMC calculado: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }

    // Método responsável pelo cálculo do IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método responsável pela classificação do IMC
    public static String classificarIMC(double imc) {

        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Acima do peso";
        } else if (imc < 35) {
            return "Obesidade I";
        } else if (imc < 40) {
            return "Obesidade II (severa)";
        } else {
            return "Obesidade III (mórbida)";
        }
    }
}
