package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("NoteBook");
        //p1.nome = "NoteBook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        Produto p2 = new Produto("Monitor");
        //p2.nome = "Monitor";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double media = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f", media);

    }

}