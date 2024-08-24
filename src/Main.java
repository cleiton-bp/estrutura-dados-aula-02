import tde.ExercicioUm;
import tde.ExercicioDois;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------ exercicios 1-----------------------------------");
        ExercicioUm frutas = new ExercicioUm(5);

//        exercicio 1 - indice 1 👇
//        frutas.aumentarCapacidade();

//        exercicio 1 - indice 2 👇
//        frutas.listar();
//        System.out.println("inserindo primeiro posicao o elemento");
//        frutas.inserirPrimeiraPosicaoDeslocandoDireita("kaki");
//        System.out.println(" ");
//        System.out.println(" lista nova");
//        frutas.listar();

//        exercicio 1 - indice 3 👇
//        System.out.println("inserindo na ultima posicao");
//        frutas.inserirElemento("Maçã");
//        frutas.inserirElemento("Abacaxi");
//        frutas.inserirElemento("Kiwi");

//        exercicio 1 - indice 4 👇
//        System.out.println("metodo buscar elemento por posicao");
//        frutas.buscarElementoPorPosicao(0);

//        exercicio 1 - indice 5 👇
//        frutas.alterar(0, "melancia");
//        System.out.println("alterado a fruta da posicao 0");

//        exercicio 1 - indice 6 👇
//        frutas.listar();
//        System.out.println(" removido elemento ");
//        frutas.excluir(1);
//        System.out.println(" listando sem o elemento");
//        frutas.listar();

//        exercicio 1 - indice 7 👇
//        System.out.println("lista 1");
//        frutas.listar();
//        frutas.excluirPorFruta("Maçã");
//        System.out.println("lista 2 alterada" );
//        frutas.listar();

//        exercicio 1 - indice 8 👇
//        frutas.verificarElementos("Abacaxi");

//        exercicio 1 - indice 9 👇
//        frutas.obterTamanhoTotal();

//        exercicio 1 - indice 10 👇
//        frutas.verificarItensVazio();

//        exercicio 1 - indice 11 👇
//        frutas.limparVetor();

//        exercicio 1 - indice 12 👇
//        System.out.println(frutas);

        System.out.println("------------------------------ exercicios 2-----------------------------------");

        int[][] matriz = {
                {1, 2, 3, 8, 3},
                {4, 5, 6, 8, 3},
                {7, 8, 9, 8, 3}
        };

        ExercicioDois exercicio = new ExercicioDois();

        // Exercicio 2 - indice 1
//        int maior = exercicio.obterMaiorElemento(matriz);
//        System.out.println("Maior numero da matriz: " + maior);

        // Exercicio 2 - indice 2
//        int menor = exercicio.obterMenorElemento(matriz);
//        System.out.println("Menor numero da matriz: " + menor);

        // Exercicio 2 - indice 3
//        double media = exercicio.calcularMediaElementos(matriz);
//        System.out.println("Média dos numeros da matriz: " + media);

        // Exercicio 2 - indice 4
//        int[] somaLinhas = exercicio.somarElementosPorLinha(matriz);
//        System.out.println("-------- soma por linhas --------");
//        for (int i = 0; i < somaLinhas.length; i++) {
//            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
//        }
//        System.out.println("---------------------------------");

        // Exercicio 2 - indice 5
//        int[] somaColunas = exercicio.somarElementosPorColuna(matriz);
//        System.out.println("-------- Soma por colunas --------");
//        for (int j = 0; j < somaColunas.length; j++) {
//            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
//        }
//        System.out.println("----------------------------------");

        // Exercicio 2 - indice 6
//        int somaTotal = exercicio.calcularSomaTotal(matriz);
//        System.out.println("Soma total: " + somaTotal);

        // Exercicio 2 - indice 7
//        int contagem = exercicio.contarOcorrencias(matriz, 8);
//        System.out.println("Contagem do valor 8: " + contagem);
    }
}
