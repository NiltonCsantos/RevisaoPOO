package br.edu.revisaopoo;

public class Raiz implements IOperacoes{

    @Override
    public double operar(double num1, double num2) {
        return Math.pow(num1, 1/num2);
    }
}
