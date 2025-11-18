package dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Cliente;

public class ClienteDao {
    
    public void adicionarCliente(Cliente cliente) {

        PreparedStatement ps = null;

        String sql = "INSERT INTO Cliente (nome, cpf, telefone) VALUES (?, ?, ?)";

        try {
            ps = Conexao.getConnection().prepareStatement(sql);

            ps.setString (1, cliente.getNome());
            ps.setString (2, cliente.getCpf());
            ps.setString (3, cliente.getTelefone());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar cliente! ", e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao fechar o PreparedStatement! ", e);
            }
        }

    }

}
