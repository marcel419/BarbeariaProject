package Banco;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.Conecta;
import Dominio.Agendamento;

public class AgendamentoBanco extends Conecta {
	
private  PreparedStatement ps;
public void CadastrarServico(Agendamento agendamento) throws SQLException, Exception {
	String query = "INSERT INTO agendamento( idServico, idFuncionario, idCliente, dataAgendamento) ";
			query += "VALUES(?,?,?)";
			
	 ps = super.conectar().prepareStatement(query);
			 ps.setInt(1, agendamento.getServico().getID());
			 ps.setInt(2, agendamento.getFuncionario().getID());ps.setInt(2, agendamento.getFuncionario().getID()); 
			 ps.setInt(3, agendamento.getCliente().getID()); 
			 ps.setString(4,agendamento.getDataAgendamento().toString());
			  
			 
      super.desconectar();		   	
}

public void DeletarServico(Agendamento agendamento) throws SQLException, Exception {
	
	String query = "DELETE FROM agendamento WHERE id = ?";
	 ps = super.conectar().prepareStatement(query);
     ps.setInt(1, agendamento.getID()); 	
    
    ps.executeUpdate();
    super.desconectar();		
	
}


public void AtualizarServico(Agendamento agendamento) throws SQLException, Exception {
	
	String query = "UPDATE agendamento SET  idServico = ?, idFuncionario = ?, idCliente = ?, dataAgendamento = ? where id = ?";
	 ps = super.conectar().prepareStatement(query);
	 ps.setInt(1, agendamento.getServico().getID());
	 ps.setInt(2, agendamento.getFuncionario().getID());
	 ps.setInt(3, agendamento.getCliente().getID()); 
	 ps.setString(4,agendamento.getDataAgendamento().toString());
	 ps.setInt(5, agendamento.getID());
	 
    ps.executeUpdate();
    super.desconectar();		
	
}
}
