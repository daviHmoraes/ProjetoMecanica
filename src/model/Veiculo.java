package model;

public class Veiculo {

    private String id;
    private Cliente cliente;
    private String placa;
    private String marca;
    private String modelo;

    public Veiculo(String id, Cliente cliente, String placa, String marca, String modelo) {
        this.id = id;
        this.cliente = cliente;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
