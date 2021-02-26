package Funcionarios;

public class Atendente extends Funcionarios{
  public Atendente(String nome, Double salario){
    super(nome, salario);
  }

  public Double Imposto(){
    return this.getSalario() * 0.01;
  }
}
