import br.edu.revisaopoo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IOperacoes operacoes = new Soma();
        Calculadora calculadora = new Calculadora();
        Validacao validacao= new Validacao();
        DadosOperacoes dadosOperacoes= new DadosOperacoes();

        Scanner leia = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        String informacaoOperacao;
        boolean condicao = false;
        double result;
        int i = 0;


        while (!condicao) {

            System.out.println("-----Calculadora-----");
            System.out.println("(1)-Somar");
            System.out.println("(2)-Subtrair");
            System.out.println("(3)-Multiplicar");
            System.out.println("(4)-Dividir");
            System.out.println("(5)-sair");
            int opcao = leia.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {

                System.out.println("Digite um número: ");
                double num1= leia.nextDouble();
                System.out.println("Digite outro número: ");
                double num2= leia.nextDouble();


                try {

                    validacao.validar(opcao, num2);

                    result=calculadora.executar(opcao, num1, num2);

                    informacaoOperacao="Opção: "+opcao+" num1: "+num1+ " num2: "+num2+ " resultado: " +result;

                    dadosOperacoes.pegarOperacoes(informacaoOperacao);

                }catch (RuntimeException e){

                    System.out.println(e.getMessage());

                }

            }else if(opcao==5){
                condicao = true;
            }else{
                System.out.println("Opção inválida!");
            }

        }

        System.out.println("Operações realizadas: ");
        dadosOperacoes.listarDados();

    }


}