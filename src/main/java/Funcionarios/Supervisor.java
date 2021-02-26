package Funcionarios;

public class Supervisor extends Funcionarios{
  public Supervisor(String nome, Double salario){
    super(nome, salario);
  }

  public Double Imposto(){
    return this.getSalario() * 0.05;
  }
}
