package tabuleiroTela;
import peices.estrutura.*;

public class tabuleiro{

    //preciso fazer uma matriz de 8X8
    //são atributas da classe inteira.

    public static pecas[][] tabuleiro = new pecas[8][8];//matriz de peças.
    public static boolean acabou = false;
    public static int quantidade_pecas_pretas = 16;
    public static int quantidade_pecas_brancas = 16;
    public static boolean turnoBranco = true;//as brancas sempre começam jogando.

    public tabuleiro(){}//apenas é para instanciar um objeto.
    
    public static void mover(){

        //ele deve escolher uma peça com o mouse
        //indicar uma casa que para a peça ir. o jogo deve indicar se é possível.
        //deve indicar se tem uma peça inimiga.



    }
}