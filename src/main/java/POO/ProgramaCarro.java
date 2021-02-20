package POO;
import java.util.Scanner;

public class ProgramaCarro {
    public static void main(String[] args) {
        boolean saida = true;
        boolean saidaPrimeiroLoot = true;
        boolean saidaSegundaLoot = true;
        Scanner scan = new Scanner(System.in);
        Carro car = new Carro();
        int scanResult;

        do {
            while (saidaPrimeiroLoot){
                System.out.println("0 - adicionar pessoas, 1 - remover pessoas:");
                scanResult = scan.nextInt();
                if ( scanResult == 1) {
                    System.out.println("Quantas pessoas?");
                    var pessoas = scan.nextInt();
                    System.out.println(car.removerPessoas(pessoas));
                    saidaPrimeiroLoot = false;
                } else if (scanResult != 0) {
                    System.out.println("O número tem que ser 0 ou 1.");
                } else {
                    System.out.println("Quantas pessoas?");
                    var pessoas = scan.nextInt();
                    System.out.println(car.adicionarPessoas(pessoas));
                    saidaPrimeiroLoot = false;
                }
            }

            while (saidaSegundaLoot) {
             System.out.println("Deseja parar? 0 - não, 1 - sim:");
             scanResult = scan.nextInt();
             if (scanResult == 0) {
                 saidaSegundaLoot = false;
             } else if (scanResult != 1) {
                 System.out.println("O número tem que ser 0 ou 1.");
             } else {
                 saidaSegundaLoot = false;
                 saida = false;
             }
         }
            saidaPrimeiroLoot = true;
            saidaSegundaLoot = true;
        } while(saida);
    }
}
