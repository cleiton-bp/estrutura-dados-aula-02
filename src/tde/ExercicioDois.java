package tde;

public class ExercicioDois {

    // Exercicio 2 - indice 1
    public int obterMaiorElemento(int[][] matriz) {
        int maior = Integer.MIN_VALUE;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }
        return maior;
    }

    // Exercicio 2 - indice 2
    public int obterMenorElemento(int[][] matriz) {
        int menor = Integer.MAX_VALUE;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }

    // Exercicio 2 - indice 3
    public double calcularMediaElementos(int[][] matriz) {
        int soma = 0;
        int totalElementos = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
                totalElementos++;
            }
        }
        return (double) soma / totalElementos;
    }

    // Exercicio 2 - indice 4
    public int[] somarElementosPorLinha(int[][] matriz) {
        int[] somaLinhas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int elemento : matriz[i]) {
                soma += elemento;
            }
            somaLinhas[i] = soma;
        }
        return somaLinhas;
    }

    // Exercicio 2 - indice 5
    public int[] somarElementosPorColuna(int[][] matriz) {
        int colunas = matriz[0].length;
        int[] somaColunas = new int[colunas];
        for (int[] linha : matriz) {
            for (int j = 0; j < colunas; j++) {
                somaColunas[j] += linha[j];
            }
        }
        return somaColunas;
    }

    // Exercicio 2 - indice 6
    public int calcularSomaTotal(int[][] matriz) {
        int somaTotal = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                somaTotal += elemento;
            }
        }
        return somaTotal;
    }

    // Exercicio 2 - indice 7
    public int contarOcorrencias(int[][] matriz, int valor) {
        int contagem = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento == valor) {
                    contagem++;
                }
            }
        }
        return contagem;
    }
}
