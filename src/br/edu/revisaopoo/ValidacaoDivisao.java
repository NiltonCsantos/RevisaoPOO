package br.edu.revisaopoo;

public class ValidacaoDivisao {

    public  void  validar(int op, double num2){

        if (op==4 && num2==0){
            throw  new ValidacaoCalculadoraException("Número inválido! \nNão é possível dividir um número por 0");
        }

    }

}
