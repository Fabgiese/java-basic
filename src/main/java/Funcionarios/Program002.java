package Funcionarios;

public class Program002 {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Rodrigo", 3000.00);
    Atendente atendente = new Atendente("Aline", 1200.00);
    Supervisor supervisor = new Supervisor("Paula", 4000.00);

    System.out.println(gerente.Imposto());
    System.out.println(atendente.Imposto());
    System.out.println(supervisor.Imposto());
  }
}
