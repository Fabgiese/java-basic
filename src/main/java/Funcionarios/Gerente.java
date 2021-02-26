package Funcionarios;

public class Gerente extends Funcionarios{
  public Gerente(String nome, Double salario){
    super(nome, salario);
  }

  public Double Imposto(){
    return this.getSalario() * 0.1;
  }
}
