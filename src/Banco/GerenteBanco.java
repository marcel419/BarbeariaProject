package Banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexao.Conecta;
import Dominio.Gerente;

public class GerenteBanco extends Conecta {

	private  PreparedStatement ps;
	public void Cadastrarfuncionario(Gerente gerente) throws SQLException, Exception {
		String query = "INSERT INTO gerente(nome, cpf, email, endereco, telefone, dataNascimento";
				query += "VALUES(?,?,?,?,?,?,?)";
				
		 ps = super.conectar().prepareStatement(query);
		 ps.setString(1, gerente.getNome()); 
		 ps.setString(2, gerente.getCpf()); 
		 ps.setString(3, gerente.getEmail());
		 ps.setString(4, gerente.getEndereco());		 
		 ps.setString(5, gerente.getTelefone());
		 ps.setString(6, gerente.getdataNascimento().toString());
		  
	        ps.executeUpdate();
	        super.desconectar();		   	
	}
	
	public void Deletarfuncionario(Gerente gerente) throws SQLException, Exception {
		
		String query = "DELETE FROM funcionario WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
         	ps.setInt(1, gerente.getID()); 	        
         ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	public void Atualizarfuncionario(Gerente gerente) throws SQLException, Exception {
		
		String query = "UPDATE funcionario SET nome = ?, cpf = ?, email = ?, endereco = ?, telefone = ?, dataNascimento = ? WHERE id = ?";
		 ps = super.conectar().prepareStatement(query);
			 ps.setString(1, gerente.getNome()); 
			 ps.setString(2, gerente.getCpf()); 
			 ps.setString(3, gerente.getEmail());
			 ps.setString(4, gerente.getEndereco());		 
			 ps.setString(5, gerente.getTelefone());
			 ps.setString(6, gerente.getdataNascimento().toString());
	     ps.setInt(7, gerente.getID());
		 
        ps.executeUpdate();
        super.desconectar();		
		
	}
	
	
	  public ArrayList<Gerente> listar(Gerente gerente) throws Exception {
	        ArrayList<Gerente> retorno = new ArrayList();
	        String query = " select * ";
	        query = query + " from gerente  ";
	        query = query + " where id > 0 ";
	        if (gerente.getID() > 0) {
	        	query = query + " and id = ? ";
	        }

	        PreparedStatement preparedStatement = super.conectar().prepareStatement(query);
	        if (gerente.getID() > 0) {
	            preparedStatement.setInt(1, gerente.getID());
	        }

	        ResultSet leitor = preparedStatement.executeQuery();

	        while(leitor.next()) {
	        	Gerente f = new Gerente();
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
