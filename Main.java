import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double peso;
        double altura;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu peso ");
        peso = leia.nextDouble();
        System.out.println("Informe a sua altura com ponto separando o metro dos cm ");
        altura = leia.nextDouble();

        double imc;
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Baixo peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Regular");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }
        System.out.println("O seu IMC eh" + imc);
    }
}