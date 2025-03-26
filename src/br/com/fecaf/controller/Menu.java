package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    // Instancia Teclado
    Scanner scanner = new Scanner(System.in);

    public void executarMenu () {


        boolean exit = false;

        while (!exit) {
            System.out.println("/*******************/");
            System.out.println("/*    Geometria    */");
            System.out.println("/*******************/");
            System.out.println("/* 1 - Circulo     */");
            System.out.println("/* 2 - Retângulo   */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair        */");
            System.out.println("/*******************/");

            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();
            System.out.println();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    Circulo circulo = new Circulo();
                    boolean validaCadastro = false;

                    while (!exitCirculo) {

                        System.out.println("/**************************/");
                        System.out.println("/****     Circulo      ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionCirculo = scanner.nextInt();
                        System.out.println();

                        switch (optionCirculo) {
                            case 1:
                               validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo\n");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo\n");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do Circulo ...\n");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !\n");
                        }

                    }
                    break;
                case 2:

                    boolean exitRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/**************************/");
                        System.out.println("/****     Retangulo    ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Retangulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionRetangulo = scanner.nextInt();
                        System.out.println();

                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retangulo !\n");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retangulo !\n");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo Retângulo...\n");
                                exitRetangulo = true;
                                 break;
                            default:
                                System.out.println("Escolha uma opção valida...\n");
                        }

                    }
                    break;
                case 3:
                    boolean exitTriangulo = false;

                    Triangulo triangulo = new Triangulo();

                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/****************************/");
                        System.out.println("/****      TRIANGULO     ****/");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Triangulo  */");
                        System.out.println("/* 2 - Calcular Area        */");
                        System.out.println("/* 3 - Calcular Perimetro   */");
                        System.out.println("/* 4 - Definir Tipo         */");
                        System.out.println("/* 5 - Triangulo Magico     */");
                        System.out.println("/* 9 - Sair                 */");
                        System.out.println("/****************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionTriangulo = scanner.nextInt();
                        System.out.println();

                        switch (optionTriangulo){
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triângulo !\n");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triângulo !\n");
                                }
                                break;
                            case 4:
                                if (validaTriangulo) {
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um Triângulo !\n");
                                }
                                break;
                            case 5:
                                if (validaTriangulo) {
                                    if (triangulo.magicTriangulo()){
                                        System.out.println("\nEsse É um exemplo de Triangulo Mágico! \n");
                                        System.out.println("Especificações: \n" +
                                                "-> Hipotenusa: " + triangulo.hipotenusa + "\n" +
                                                "-> Cateto: " + triangulo.cateto1 + "\n" +
                                                "-> Cateto: " + triangulo.cateto2 + "\n");
                                    }else {
                                        System.out.println("\nEsse NÃO é um exemplo de Triangulo Mágico! \n");
                                    }
                                } else {
                                    System.out.println("Cadastre um Triângulo !\n");
                                }
                                break;
                            case 9:
                                System.out.println("Saindo Triângulo...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida...\n");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Escolheu 4");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida\n");

            }

        }

    }

}
