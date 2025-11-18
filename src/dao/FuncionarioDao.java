package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Funcionario;

public class FuncionarioDao {
    
    public void adicionarFuncionario(Funcionario funcionario) {

        PreparedStatement ps = null;

        String sql = "INSERT INTO Funcionario (nome, cargo) VALUES (?, ?)";

        try  {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCargo());
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar Funcionario!", e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao fechar o Prepareted Statement!");
            }
        }

    }

}
