package Funcionarios;

public class Funcionarios {
  private String nome;
  private Double salario;

  public Funcionarios(String nome, Double salario){
    this.nome = nome;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public Double getSalario() {
    return salario;
  }
}
