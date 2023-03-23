package br.edu.revisaopoo;

import java.util.ArrayList;

public class DadosOperacoes {

    ArrayList<String> listaOperacoes= new ArrayList<>();

    public  void pegarOperacoes(String operacoes){

        listaOperacoes.add(operacoes);

    }

    public  void listarDados(){
        for (String operacoes: listaOperacoes) {

            System.out.println(operacoes);

        }
    }

}
