package model;

public class Servico {

    private int id;
    private Veiculo veiculo;
    private Funcionario funcionario;
    private String dataServico;
    private String descricao;
    private double valor;

    public Servico(int id, Veiculo veiculo, Funcionario funcionario, String dataServico, String descricao, double valor) {
        this.id = id;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.dataServico = dataServico;
        this.descricao = descricao;
        this.valor = valor;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataservico() {
        return dataServico;
    }

    public void setDataservico(String dataServico) {
        this.dataServico = dataServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
