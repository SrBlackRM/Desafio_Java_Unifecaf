package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura, hipotenusa = 0, cateto1 = 0, cateto2 = 0;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("\n/**************************/");
        System.out.println("/*   Cadastro Triângulo   */");
        System.out.println("/**************************/");
        System.out.print("--> Informe o Base: ");
        base = scanner.nextDouble();
        System.out.print("--> Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("--> Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.print("--> Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("\nTriângulo Cadastrado com Sucesso !\n");

        return true;
    }

    public void calcularArea () {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2 ;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro () {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo () {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        if (base == lado2 && base == lado3) {

            System.out.println("Este Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triângulo é Escaleno ...");

        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");

    }

    // Definir se é um triângulo "mágico"
    public boolean magicTriangulo() {
        // crio as bases do triângulo pitagorico especial (magico)
        int hipotenusaBase = 5, cateto1Base = 4, cateto2Base = 3;

        // se nao for um triângulo retângulo, nem faz a verificação e já descarta
        if (defineTrianguloRetanguloPorPitaogras()) {

            // Aqui precisei comparar se o valor da divisão entre os lados do triângulo atual e o triângulo base são iguais
            // porem como não tem como saber qual cateto é o 1 ou o 2, precisei usar um OU. Pois a ordem dos fatores não altera o produto
            // sendo assim, independente de qual for o primeiro ou o segundo cateto, o resultado é o mesmo
            // e todas as divisões pela base precisam ser iguais de cada lado do triângulo
            return (hipotenusa / hipotenusaBase) == (cateto1 / cateto1Base) || (hipotenusa / hipotenusaBase) == (cateto2 / cateto1Base)
                    && (hipotenusa / hipotenusaBase) == (cateto2 / cateto2Base) || (hipotenusa / hipotenusaBase) == (cateto1 / cateto2Base);
        }

        else return false;
    }

    // Identifica se é um triângulo retângulo (teorema de Pitágoras)
    public boolean defineTrianguloRetanguloPorPitaogras(){

        // chama a função que vai organizar os lados do triângulo retângulo, identificando-os como hipotenusa e catetos
        organizaLadosTrianguloRetangulo();

        // no caso de não conseguir identificar um lado maior ele não vai definir as variáveis novas, portanto nao vai considerar um triângulo retângulo
        if( hipotenusa != 0 && cateto1 != 0 && cateto2 != 0){
            // ainda que tenha um maior lado, verifica se é mesmo um triângulo retângulo aplicando Pitágoras e comparando o quadrado da hipotenusa
            // com a soma do quadrado dos catetos
            return Math.pow(hipotenusa, 2) == (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        }

        else return false;
    }

    // Identifica maior lado do triângulo (possível hipotenusa)
    public void organizaLadosTrianguloRetangulo(){

        // faz as verificações necessárias para ver qual é a possível hipotenusa, já que ela é sempre a maior dos lados
        // ja define também os demais lados relativos a um triângulo retângulo, mesmo sem ainda ter a certeza de ser.
        if(base > lado2 && base > lado3){
            hipotenusa = base;
            cateto1 = lado2;
            cateto2 = lado3;
        }else if(lado2 > base && lado2 > lado3){
            hipotenusa = lado2;
            cateto1 = base;
            cateto2 = lado3;
        }else if(lado3 > lado2 && lado3 > base){
            hipotenusa = lado3;
            cateto1 = lado2;
            cateto2 = base;
        }
        else{
            System.out.println("\nNão tem maior lado!\n");
        }
    }
}
