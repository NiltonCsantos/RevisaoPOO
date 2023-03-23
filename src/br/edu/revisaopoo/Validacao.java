package br.edu.revisaopoo;

public class Validacao {

    public  void  validar(int op, double num2){

        if (op==4 && num2==0){
            throw new RuntimeException("Número inválido!");
        }

    }

}
