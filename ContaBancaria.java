public class ContaBancaria {
    private int numeroConta;
    private int saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    // Classe Principal
    public static class Principal{
        public static void main(String[] args){
            ContaBancaria conta = new ContaBancaria();

            conta.setNumeroConta(341);
            conta.setSaldo(2000);
            conta.titular = ("Leonardo");

            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Titular: " + conta.titular);

            conta.setSaldo(1500);
            System.out.println("Novo Saldo: " + conta.getSaldo());



        }
    }
}

