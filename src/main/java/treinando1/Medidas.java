// 1 - Pacote
package treinando1;

// 2 - Referencia as Bibliotecas


// 3- Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos ( faz mas nao da retorno) e Funções ( faz e da um retorno, resultado...)
    public static void main(String[] args){
        System.out.println("Cálculo de Areas");
        System.out.println("Bom dia!!!");
        // calculo de area - reduzido

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a larguea de " + largura + "m² e o comprimento de " + comprimento + "m² a area é de "
                + largura * comprimento + "m²");
    }

    public void calcularModoExtenso(){

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

    public void calcularAreaModoCompacto(){

        // calculo de area - reduzido

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a larguea de " + largura + "m² e o comprimento de " + comprimento + "m² a area é de "
                + largura * comprimento + "m²");



    }

}
