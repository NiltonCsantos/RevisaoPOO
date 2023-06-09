package br.edu.revisaopoo;

public class Calculadora  {


    public double executar(int op, double num1, double num2){


        switch (op){
            case  1:

                return calcular(new Soma(), num1, num2);

            case 2:

                return  calcular(new Subtracao(), num1, num2);

            case 3:

                return calcular(new Multiplicacao(), num1, num2);

            case 4:

                return calcular(new Divisao(), num1, num2);

            case 5:

                return calcular(new Potenciacao(), num1, num2);

            case 6:
                return  calcular(new Raiz(), num1, num2);

            case 7:
                break;

        }

        return 0;

    }

    private double calcular(IOperacoes operacoes, double num1, double num2){

        return operacoes.operar(num1, num2);

    }

}
