package br.edu.revisaopoo;

public class ValidacaoRaiz {

    public static  void validar(int op, double n2){
        if (op==6 && n2<0){
            throw  new ValidacaoCalculadoraException("Erro! Não exites raíz de números negativos");
        }
    }



}
