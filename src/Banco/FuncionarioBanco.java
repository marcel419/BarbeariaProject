package Banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexao.Conecta;
import Dominio.Funcionario;

public class FuncionarioBanco extends Conecta  {

	private  PreparedStatement ps;
	public void Cadastrarfuncionario(Funcionario funcionario) throws SQLException, Exception {
		String query = "INSERT INTO funcionario(nome, cpf, email, endereco, telefone, dataNascimento, idGerente";
				query += "VALUES(?,?,?,?,?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
		 ps.setString(1, funcionario.getNome()); 
		 ps.setString(2, funcionario.getCpf()); 
		 ps.setString(3, funcionario.getEmail());
		 ps.setString(4, funcionario.getEndereco());		 
		 ps.setString(5, funcionario.getTelefone());
		 ps.setString(6, funcionario.getdataNascimento().toString());
		 ps.setInt(7, funcionario.getGerente().getID());
		  
	        ps.executeUpdate();
	        super.desconectar();		   	
	}
	
	public void Deletarfuncionario(Funcionario funcionario) throws SQLException, Exception {
		
		String query = "DELETE FROM funcionario WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         	ps.setInt(1, funcionario.getID()); 	        
         ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void Atualizarfuncionario(Funcionario funcionario) throws SQLException, Exception {
		
		String query = "UPDATE funcionario SET nome = ?, cpf = ?, email = ?, endereco = ?, telefone = ?, dataNascimento = ? WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
			 ps.setString(1, funcionario.getNome()); 
			 ps.setString(2, funcionario.getCpf()); 
			 ps.setString(3, funcionario.getEmail());
			 ps.setString(4, funcionario.getEndereco());		 
			 ps.setString(5, funcionario.getTelefone());
			 ps.setString(6, funcionario.getdataNascimento().toString());
	     ps.setInt(7, funcionario.getID());
		 
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	  public ArrayList<Funcionario> listar(Funcionario funcionario) throws Exception {
	        ArrayList<Funcionario> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from funcionario  ";
	        query = query + " where id > 0 ";
	        if (funcionario.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (funcionario.getID() > 0) {
	            preparedStatement.setInt(1, funcionario.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	        	Funcionario f = new Funcionario();
	            f.setID(leitor.getInt("id"));
	            f.setNome(leitor.getString("nome"));
	            f.setCpf(leitor.getString("cpf"));
	            f.setTelefone(leitor.getString("telefone"));
	            f.setEmail(leitor.getString("email"));
	            f.setEndereco(leitor.getString("endereco"));
	            f.setdataNascimento(leitor.getDate("dataNascimento"));
	            retorno.add(f);
	        }

	        super.desconectar();
	        return retorno;
	    }
	
}
