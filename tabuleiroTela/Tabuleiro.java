package tabuleiroTela;
import  tabuleiroTela.inicialização;
import peices.estrutura.*;

public class Tabuleiro{

    //preciso fazer uma matriz de 8X8
    //são atributas da classe inteira.

    public pecas[][] tabuleiro;//aqui vai ficar todsa as informações das peças.
    public boolean acabou;
    public int quantidade_pecas_pretas;
    public int quantidade_pecas_brancas;
    public boolean turnoBranco;//as brancas sempre começam jogando.
    public int pontosBrancos;
    public int pontosPretos;

    public Tabuleiro(){//cria o tabuleiro.
        this.tabuleiro = inicialização.preencherTabuleiro();
        this.acabou = false;
        this.quantidade_pecas_brancas = 16;
        this.quantidade_pecas_pretas = 16;
        this.turnoBranco = true;
        this.pontosBrancos = 0;
        this.pontosPretos = 0;
        }
    
}