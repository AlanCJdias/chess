package tabuleiroTela;
import  tabuleiroTela.inicialização;
import peices.estrutura.*;

public class Tabuleiro{

    //preciso fazer uma matriz de 8X8
    //são atributas da classe inteira.

    public  pecas[][] tabuleiro;//aqui vai ficar todsa as informações das peças.
    public  boolean acabou;
    public  int quantidade_pecas_pretas;
    public  int quantidade_pecas_brancas;
    public  boolean turnoBranco;//as brancas sempre começam jogando.

    public Tabuleiro(){//cria o tabuleiro.
        this.tabuleiro = inicialização.preencherTabuleiro();
        this.acabou = false;
        this.quantidade_pecas_brancas = 16;
        this.quantidade_pecas_pretas = 16;
        this.turnoBranco = true;
        }
    
    public static void mover(){

        //ele deve escolher uma peça com o mouse
        //indicar uma casa que para a peça ir. o jogo deve indicar se é possível.
        //deve indicar se tem uma peça inimiga.



    }
}