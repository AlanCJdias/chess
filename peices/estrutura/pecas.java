package peices.estrutura;
//aqui ficará todo as informações das peças.

public class pecas {

    //só com isso daqui já é possível fazer a parte das peças.

    public int valor;
    public boolean branca;
    public String nome;
    public boolean status;
    public int X;
    public int Y;
    public String caminho;

    public pecas
    (
        int posiX,
        int posiY,
        boolean cor,
        int value,
        String name
    ){
        this.status = true;
        this.X = posiX;
        this.Y = posiY;
        this.branca = cor;
        this.nome = name;
        this.valor = value;
        if(cor){
            this.caminho = "pieces/estrutura/imagens/" + name + ".png";//vei pegar a imagem branca.
        }else{
            this.caminho = "pieces/estrutura/imagens/" + name + "-preta.png";//vai pegar a imagem branca.
        }
    }

}
