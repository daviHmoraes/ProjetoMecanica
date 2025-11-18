package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Veiculo;
import model.Cliente;

public class VeiculoDao {

    public void adicionarVeiculo(Veiculo veiculo, Cliente cliente) {
        PreparedStatement ps = null;

        String sql = "INSERT INTO Veiculo (cliente_id, placa, marca, modelo) VALUES (?, ?, ?, ?)";

        try {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.setString(2, veiculo.getPlaca());
            ps.setString(3, veiculo.getMarca());
            ps.setString(4, veiculo.getModelo());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar veículo!", e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao fechar o PreparatedStateMent!", e);
            }
        }
    }
    
}
