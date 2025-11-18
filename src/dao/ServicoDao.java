package dao;

import java.sql.PreparedStatement;

import model.Veiculo;
import model.Funcionario;
import model.Servico;

public class ServicoDao {
    
    public void adicionarServico(Veiculo veiculo, Funcionario funcionario) {
    
        PreparedStatement ps = null;

        String sql = "INSERT INTO Servico (veiculo_id, funcionario_id, data_servico, descricao, valor)";

        

    }

}
