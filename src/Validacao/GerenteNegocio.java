/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import Banco.GerenteBanco;
import Dominio.Gerente;



/**
 *
 * @author manoel.ribeiro.neto
 */
public class GerenteNegocio {
     public void inserirGerente (Gerente f) throws Exception {
		    
	        if (f == null  ) {
	            throw new Exception("Insira os dados do funcionario");
	        }
	        
	        if (f.getNome() == null) {
	            throw new Exception("Informar o nome do funcionario");
	        }
	        if (f.getNome().trim().equals("") == true) {
	            throw new Exception("Informar o nome do funcionario");
	        }
	        if (f.getNome().trim().length() > 100) {
	            throw new Exception("O nome do funcinario tem ter menos de 100 caracteres");
	        }
	        if (f.getNome().trim().length() < 5) {
	            throw new Exception("O Nome do Funcionario não pode ter menos de 5 caracteres");
	        }
	       
	        if (f.getCpf() == null) {
	            throw new Exception("Insira o CPF do Funcionario");
	        }
	        String cpfNew = f.getCpf().trim();
	        cpfNew = cpfNew.replace(" ", "");
	        cpfNew = cpfNew.replace("-", "");
	        if (f.getCpf().trim().equals("-   -   -") == true) {
	            throw new Exception("Insira o CPF do Funcionario");
	        }
	        if (f.getEmail() == null) {
	            throw new Exception("Informar o  e-mail do funcionario");
	        }
	        if (f.getEmail().trim().length() < 5) {
	            throw new Exception("O e-mail do Funcionario não pode ter menos de 5 caracteres");
	        }
	        if (f.getEmail().trim().length() > 100) {
	            throw new Exception("O e-mail do funcinario tem ter menos de 100 caracteres");
	        }
	        
	        if (f.getTelefone().trim().equals("") == true) {
	            throw new Exception("Informar o Numero do funcionário");
	        }
	        if (f.getTelefone().trim().length() > 11) {
	            throw new Exception("O telefone do funcionário não pode ter mais de 11 digitos");
	        }
	        if (f.getTelefone().trim().length() < 9) {
	            throw new Exception("O telefone do funcionário não poder ter meno de 9 digitos");
	        }
	       
	       
	        GerenteBanco dado = new GerenteBanco();
	       dado.CadastrarGerente(f);
	  
	     }
	    
	    public void atualizarGerente(Gerente f) throws Exception {
	    	        if (f == null  ) {
		            throw new Exception("Insira os dados do funcionario");
		        }
		        
		        if (f.getNome() == null) {
		            throw new Exception("Informar o nome do funcionario");
		        }
		        if (f.getNome().trim().equals("") == true) {
		            throw new Exception("Informar o nome do funcionario");
		        }
		        if (f.getNome().trim().length() > 100) {
		            throw new Exception("O nome do funcinario tem ter menos de 100 caracteres");
		        }
		        if (f.getNome().trim().length() < 5) {
		            throw new Exception("O Nome do Funcionario não pode ter menos de 5 caracteres");
		        }
		       
		        if (f.getCpf() == null) {
		            throw new Exception("Insira o CPF do Funcionario");
		        }
		        String cpfNew = f.getCpf().trim();
		        cpfNew = cpfNew.replace(" ", "");
		        cpfNew = cpfNew.replace("-", "");
		        if (f.getCpf().trim().equals("-   -   -") == true) {
		            throw new Exception("Insira o CPF do Funcionario");
		        }
		        if (f.getEmail() == null) {
		            throw new Exception("Informar o  e-mail do funcionario");
		        }
		        if (f.getEmail().trim().length() < 5) {
		            throw new Exception("O e-mail do Funcionario não pode ter menos de 5 caracteres");
		        }
		        if (f.getEmail().trim().length() > 100) {
		            throw new Exception("O e-mail do funcinario tem ter menos de 100 caracteres");
		        }
		        
		        if (f.getTelefone().trim().equals("") == true) {
		            throw new Exception("Informar o Numero do funcionário");
		        }
		        if (f.getTelefone().trim().length() > 11) {
		            throw new Exception("O telefone do funcionário não pode ter mais de 11 digitos");
		        }
		        if (f.getTelefone().trim().length() < 9) {
		            throw new Exception("O telefone do funcionário não poder ter meno de 9 digitos");
		        }
		    	
		        GerenteBanco dado = new GerenteBanco();
	                dado.AtualizarGerente(f);
	     
	    }
            
             public void removerGerente(Gerente f) throws Exception {
            
            if (f.getID() == 0 || f == null){
			throw new Exception("Selecione um funcionário para remover");
		}
		
           GerenteBanco  dado = new GerenteBanco();
           dado.DeletarGerente(f);
        }
}
