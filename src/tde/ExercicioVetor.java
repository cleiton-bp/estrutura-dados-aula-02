package tde;

import java.util.List;

public class ExercicioVetor {
    private String[] elementos;
    private int valorAtual;

    public ExercicioVetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.valorAtual = 0;
    }

//    indice 1
    public void aumentarCapacidade() {
        String[] novoElementos;

        novoElementos = new String[this.elementos.length * 2];

        for (int i = 0; i < this.valorAtual; i++) {
            novoElementos[i] = this.elementos[i];
        }

        this.elementos = novoElementos;
    }

//    indice 2
    public void inserirPrimeiraPosicaoDeslocandoDireita(String elemento) {
        if (this.valorAtual < this.elementos.length) {
            String[] copy = new String[this.elementos.length + 1];

            copy[0] = elemento;

            for (int i = 0; i < this.elementos.length; i++) {
                copy[i + 1] = this.elementos[i];
            }

            this.elementos = copy;
            this.valorAtual++;
        } else {
            System.out.println("deu ruim O_O");
        }
    }

//    indice 3
    public void inserirElemento(String elemento) {
        if (this.valorAtual < this.elementos.length) {
            elementos[valorAtual] = elemento;
            valorAtual++;
        } else {
            System.out.println("Vetor cheio");
        }
    }

//    indice 4
    public void buscarElementoPorPosicao(int posicao) {
    if (posicao >= 0 && posicao < this.elementos.length) {
        this.elementos[posicao] = this.elementos[posicao];
        System.out.println("fruta: " + this.elementos[posicao]);
    } else {
        System.out.println("esta posicao nao foi encontrada");
    }
}

//    indice 5
    public void alterar(int indice, String elemento) {
    if (indice > -1 && indice < this.valorAtual) {
        elementos[indice] = elemento;
    } else {
        System.out.println("indice invalido");
    }
}

//    indice 6
    public void excluir(int indice) {
        if (indice < 0 || indice >= this.valorAtual) {
            System.out.println("Índice inválido");
            return;
        }
        for (int i = indice; i < this.valorAtual - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[this.valorAtual - 1] = null;
        this.valorAtual--;
    }

//    indice 7
    public void excluirPorNome(String elemento) {
        int posicao = -1;

        // Encontra a posição do elemento a ser removido
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null && this.elementos[i].equalsIgnoreCase(elemento)) {
                posicao = i;
                break;
            }
        }

        // Se o elemento foi encontrado, remove-o e desloca os elementos subsequentes para a esquerda
        if (posicao != -1) {
            for (int i = posicao; i < this.elementos.length - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[this.elementos.length - 1] = null; // Opcional: limpa o último elemento
            this.valorAtual--;
        } else {
            System.out.println("Elemento não encontrado");
        }
    }

//    indice 8
    public boolean verificarElementos(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null && this.elementos[i].equalsIgnoreCase(elemento)) {
                System.out.println("Elemento encontrado na posição [" + i + "]: " + this.elementos[i]);
                return true;
            }
        }
        System.out.println("Elemento não encontrado");
        return false;
    }

//    indice 9
    public void obterTamanhoTotal(){
        System.out.println("Tamanho total: " + this.elementos.length);
    }

//    indice 10
    public void verificarItensVazio() {
        int total = 0;
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null) {
                total++;
            }
        }
        if (total > 0) {
            System.out.println("tem " + total + " elementos ");
        } else {
            System.out.println("esta vazio");
        }
    }

//    indice 11
    public void limparVetor() {
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = null;
        }
        this.valorAtual = 0;
        System.out.println("Todos os elementos foram removidos. O vetor está vazio.");
    }

//    indice 12
    @Override
    public String toString() {
        String str;
        str = "[";
        for (int i = 0; i < this.valorAtual; i++) {
            str += elementos[i];
            if (i < valorAtual - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }

    //    extra 1
    public void listar() {
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println(this.elementos[i]);
        }
    }
}
