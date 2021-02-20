package POO;

public class Carro {
    private final Integer quantidadeLimite = 4;
    private Integer quantidadeAtualPessoas = 0;

    public String adicionarPessoas(int quantidade) {
        if (quantidade < 1) {
            return "Quantidade tem que ser maior que 0";
        } else {
            if ((this.quantidadeAtualPessoas + quantidade) > this.quantidadeLimite) {
                return String.format("Ultrapassa o limite de %d do carro", this.quantidadeLimite);
            }

            this.quantidadeAtualPessoas += quantidade;
            return String.format("%d pessoas entraram no carro, quantidade atual de pessoas agora é %d.",quantidade, this.quantidadeAtualPessoas);
        }
    }

    public String removerPessoas(int quantidade) {
        if (quantidade < 1) {
            return "Quantidade de pessoas tem que ser maior que 0.";
        } else if (this.quantidadeAtualPessoas - quantidade == 0) {
            this.quantidadeAtualPessoas -= quantidade;
            return "O carro agora está vazio.";
        } else if(this.quantidadeAtualPessoas - quantidade < 0) {
            return "Essa quantidade de pessoas é maior que a quantidade que contém no carro.";
        } else {
            this.quantidadeAtualPessoas -= quantidade;
            return String.format("Foram removidos %d pessoas no carro, agora o carro contém %d pessoa(s).",quantidade, quantidadeAtualPessoas);
        }
    }



}
