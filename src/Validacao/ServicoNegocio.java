/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import Banco.ServicoBanco;
import Dominio.Servico;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class ServicoNegocio {
    public void inserirServico(Servico s) throws Exception {

		if (s == null) {
			throw new Exception("Insira os dados do serviço");
		}

		if (s.getNome() == null) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().length() > 100) {
			throw new Exception("O nome do serviço tem ter menos de 100 caracteres");
		}
		if (s.getNome().trim().length() < 4) {
			throw new Exception("O Nome do serviço não pode ter menos de 4 caracteres");
		}

		if (s.getFuncionario() == null) {
			throw new Exception("O serviço deverá está atrelado a algum funcionário");
		}
		if (s.getPreco().signum() <= 0) {
			throw new Exception("Preço total inválido");
		}
		
		ServicoBanco dado = new ServicoBanco();
		dado.CadastrarServico(s);
		

	}
	public void utualizarServico(Servico s) throws Exception {
		
		if (s == null) {
			throw new Exception("Insira os dados do serviço");
		}

		if (s.getNome() == null) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().equals("") == true) {
			throw new Exception("Informar o nome do serviço");
		}
		if (s.getNome().trim().length() > 100) {
			throw new Exception("O nome do serviço tem ter menos de 100 caracteres");
		}
		if (s.getNome().trim().length() < 4) {
			throw new Exception("O Nome do serviço não pode ter menos de 4 caracteres");
		}

		if (s.getFuncionario() == null) {
			throw new Exception("O serviço deverá está atrelado a algum funcionário");
		}
		if (s.getPreco().signum() <= 0) {
			throw new Exception("Preço total inválido");
		}
		
		ServicoBanco dado = new ServicoBanco();
		dado.AtualizarServico(s);

	}
        
        public void removerServico(Servico s) throws Exception {
            if (s.getID() == 0 || s == null) {                
			throw new Exception("Selecione um serviço para remover");
            }
            
           ServicoBanco dado = new ServicoBanco();
		dado.DeletarServico(s);
        }
}
