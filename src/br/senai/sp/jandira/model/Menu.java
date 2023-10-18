package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
        public void startMenu(){
                Scanner scanner = new Scanner(System.in);

                boolean continuar = true;

                while (continuar) {
System.out.println("Escolha uma opção:");
System.out.println("1. Criar um círculo");
System.out.println("2. Criar um retângulo");
System.out.println("3. Sair");
int respostaUsuario = scanner.nextInt();

switch (respostaUsuario){
    case 1:
        System.out.print("Informe o raio do circulo: ");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);
        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Perimetro do circulo: " + circulo.calcularPerimetro());
        break;

        case 2:
            System.out.print("Informe o comprimento do retangulo: ");
            double comprimento = scanner.nextDouble();
            System.out.print("Informe a largura do retangulo: ");
            double largura = scanner.nextDouble();
            Retangulo retangulo = new Retangulo(comprimento, largura);
            System.out.println("Area do retangulo: " + retangulo.calcularArea());
            System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
            break;

            case 3:
                continuar = false;
                break;
}}}
}