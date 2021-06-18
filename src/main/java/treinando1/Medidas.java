// 1 - Pacote
package treinando1;

// 2 - Referencia as Bibliotecas


import java.util.Scanner;

// 3- Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos ( faz mas nao da retorno) e Funções ( faz e da um retorno, resultado...)
    public static void main(String[] args){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, hardware ou software (API)

        // utilizar a classe Scanner do JAVA para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E   O P Ç Õ E S ");
        System.out.println("C - Calcular Area Modo Curto ");
        System.out.println("D - Contar ate Dez ");
        System.out.println("E - Calcular Area Modo Extenso ");
        System.out.println("I - If Simples ");
        System.out.println("R - Contagem regressiva de dez a zero ");
        System.out.println("Digite a opção desejada: ");

        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "curto";

        switch (opcao){

            case "C":
            case "c":
                System.out.println("Você escolheu o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "D":
            case "d":
                System.out.println("Você escolheu a opção Contar a ate Dez");
                contarAteDez();
                break;
            case "E":
            case "e":
                System.out.println("Você escolheu o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
            case "I":
            case "i":
                System.out.println("Você escolheu o método ifSimples");
                ifsimples();
                break;
            case "R":
            case "r":
                System.out.println("Você escolheu o método Contagem Regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não esta associado ");
                break;



        }


    }
    public static void ifsimples(){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, hardware ou software (API)

        // if = se
        // else = senão
        //Exemplo: criar uma variavel tipo String :
        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }


    }


    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Areas Modo Curto");

        // calculo de area - reduzido

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m² e o comprimento de " + comprimento + "m² a area é de "
                + largura * comprimento + "m²");

    }
    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");
        // Calculo de área - Exemplo : o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;  // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a larguea de " + largura + "m² e o comprimento de " + comprimento + "m² a area é de "
                + resultado + "m²");


    }
        public static void contarAteDez(){

        // Loops ou Repetições
        // for = repetição incondicional
            System.out.println("Contagem Crescente");

        for (int numero = 1; numero <=10; numero++){
            System.out.println(numero);

        }

        }
        public static void contagemRegressiva(){
            System.out.println("Contagem Regressiva");

            for (int numero = 10; numero > -1; numero--){
                System.out.println(numero);
            }

        }




}
