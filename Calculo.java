public class Calculo{
    public static void main(String[] args) {
    int somaPares = 0;
    for (int i = 1; i <= 10; i++) {
        if(i % 2 !=0){
            continue;
        }
        somaPares += i;
    }
    System.err.println("A soma dos números pares de 1 a 100 é: " + somaPares);
    }
}