package tabuleiroTela;
import peices.estrutura.*;


public class inicialização {//aqui vai ficar a função responsável por inicial o jogo.


    public static void preencherTabuleiro(pecas tabuleiro[][]){//vai entrar a matriz.
        
        //peoẽs brancos:
        for(int i = 0 ; i <=7 ; i++){
            tabuleiro[1][i] = criarPecas(i+1,2,true,1, "Peão" );
        }

        //peoẽs pretos:
        for(int i = 0 ; i <=7 ; i++){
            tabuleiro[6][i] = criarPecas(i+1,7,false,1, "Peão" );
        }

        //tores brancas:
        tabuleiro[0][0] = criarPecas(1, 1, true, 5, "Torre");
        tabuleiro[0][7] = criarPecas(8, 1, true, 5, "Torre");

        //torres pretas:
        tabuleiro[7][0] = criarPecas(1, 8, false, 5, "Torre");
        tabuleiro[7][7] = criarPecas(8, 8, false, 5, "Torre");

        //cavalos bracos:
        tabuleiro[0][1] = criarPecas(2, 1, true, 3, "Cavalo");
        tabuleiro[0][6] = criarPecas(7, 1, true, 3, "Cavalo");

        //cavalos negros:
        tabuleiro[7][1] = criarPecas(2, 8, false, 3, "Cavalo");
        tabuleiro[7][6] = criarPecas(7, 8, false, 3, "Cavalo");

        //bispos brancos:
        tabuleiro[0][2] = criarPecas(3, 1, true, 3, "Bispos");
        tabuleiro[0][5] = criarPecas(6, 1, true, 3, "Bispos");

        //bispos pretos:
        tabuleiro[7][2] = criarPecas(3, 8, false, 3, "Bispos");
        tabuleiro[7][5] = criarPecas(6, 8, false, 3, "Bispos");

        //rainha branca :
        tabuleiro[0][3] = criarPecas(4, 1, true, 9, "Rainha");

        //rainha negra :
        tabuleiro[7][3] = criarPecas(4, 8, false, 9, "Rainha");

        //rei branco:
        tabuleiro[0][4] = criarPecas(5, 1, true, 4, "Rei");

        //rei negro:
        tabuleiro[7][4] = criarPecas(5, 8, false, 4, "Rei");

    }

    public static pecas criarPecas(
        int X,
        int Y,
        boolean cor,
        int valor,
        String nome
    ){
        pecas peca = new pecas(X, Y, cor, valor, nome);
        return peca;
    }
}
