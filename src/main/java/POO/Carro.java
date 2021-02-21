package POO;

public class Carro {
    private final Integer quantidadeLimite = 4;
    private Integer quantidadeAtualPessoas = 0;
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro (String marca, String modelo, Integer ano, String variante){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }

    public Integer getQuantidadeLimite() {
        return quantidadeLimite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public Integer getQuantidadeAtualPessoas() {
        return quantidadeAtualPessoas;
    }

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
