public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreço() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double valorPercentual) {
        double desconto = preco * (valorPercentual / 100);
        preco -= desconto;
    }

    // Classe Principal
    public static class Principal {
        static void main(String[] args) {
            Produto produto = new Produto("Celular", 2000.0);

            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Valor do produto: " + produto.getPreço());

            produto.aplicarDesconto(10);
            System.out.println("Novo preço após Desconto: "  + produto.getPreço());
        }
    }
}


