/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import Banco.AgendamentoBanco;
import Dominio.Agendamento;

/**
 *
 * @author manoel.ribeiro.neto
 */
public class AgendamentoNegocio {
    public void inserirAtendimento(Agendamento a) throws Exception {

		if (a == null) {
			throw new Exception("Insira os dados do Agendamento");
		}

		if (a.getCliente() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum cliente");
		}
		if(a.getFuncionario() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum funcionario");
		}
		if (a.getDataAgendamento().toString() == "") {
			throw new Exception("Informe a data do atendimento");
		}
		if (a.getServico() == null) {
			throw new Exception("O atendimento deverá conter a algum serviço");
		}
		
		AgendamentoBanco dado = new AgendamentoBanco();
		dado.CadastrarServico(a);
	
	}
    
       public void atualzarAtendimento(Agendamento a) throws Exception {

		if (a == null) {
			throw new Exception("Insira os dados do atendimento");
		}

		if (a.getCliente() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum cliente");
		}
		if(a.getFuncionario() == null) {
			throw new Exception("O atendimento deverá está atrelado a algum funcionario");
		}
		if (a.getDataAgendamento().toString() == "") {
			throw new Exception("Informe a data do atendimento");
		}
		if (a.getServico() == null) {
			throw new Exception("O atendimento deverá conter a algum serviço");
		}
		
		
		AgendamentoBanco dado = new AgendamentoBanco();
		dado.AtualizarServico(a);
	
	}
         public void removerAtendimento(Agendamento a) throws Exception {
                if (a == null) {
                   throw new Exception("Selecione um atendimento para remover");
		}
		AgendamentoBanco dado = new AgendamentoBanco();
		dado.DeletarServico(a);
         }
}
