public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Você é de maior");
        } else {
            System.out.println("Você é de menor");
        }
    }
    // Classe Principal
    public static class Principal{
        static void main(String[] args) {
            IdadePessoa pessoa1 = new IdadePessoa();

            pessoa1.setIdade(20);
            pessoa1.setNome("Lívia");

            IdadePessoa pessoa2 = new IdadePessoa();

            pessoa2.setNome("Madalena");
            pessoa2.setIdade(5);

            System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
            pessoa1.verificarIdade();

            System.out.println("");

            System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
            pessoa2.verificarIdade();
         }
    }
}
