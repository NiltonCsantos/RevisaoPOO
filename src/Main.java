import br.edu.revisaopoo.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        ValidacaoDivisao validacaoDivisao = new ValidacaoDivisao();
        DadosOperacoes dadosOperacoes= new DadosOperacoes();

        Scanner leia = new Scanner(System.in);

        String informacaoOperacao;
        boolean condicao = false;
        double result;



        while (!condicao) {

            System.out.println("-----Calculadora-----");
//            System.out.println("(1)-Somar");
//            System.out.println("(2)-Subtrair");
//            System.out.println("(3)-Multiplicar");
//            System.out.println("(4)-Dividir");
//            System.out.println("(5)-Potência");
//            System.out.println("(6)-Raiz");
//            System.out.println("(7)-Sair");
              String entrada = leia.next();

              String[] numeros=entrada.split(";");



            for (int i = 0; i < numeros.length; i++) {

                System.out.println(numeros[i]);

            }

            if (numeros.length>3) {

                System.out.println("Entrada inválida");

            } else if (entrada.equals("0")) {
                condicao=true;
                break;
            } else {

                System.out.println("Oi");

                try {


                    int op= Integer.parseInt(numeros[1]);
                    int n1= Integer.parseInt(numeros[0]);
                    int n2= Integer.parseInt(numeros[2]);

                    validacaoDivisao.validar(op, n2);
                    ValidacaoRaiz.validar(op, n2);

                    result=calculadora.executar(op, n1, n2);

                    informacaoOperacao=n1+";"+op+";"+ n2 +"="+result;

                    dadosOperacoes.pegarOperacoes(informacaoOperacao);

                }catch (ValidacaoCalculadoraException e){

                    System.out.println(e.getMessage());

                }


            }
        }

        System.out.println("Operações realizadas: ");
        dadosOperacoes.listarDados();
        leia.close();


    }

}







