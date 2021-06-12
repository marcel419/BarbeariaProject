package Dominio;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;




public class Gerente extends Pessoa {
	

	private  List<Funcionario> funcionario = new ArrayList<>();
	

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNome(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCpf(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTelefone(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEndereco(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmail(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getdataNascimento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setdataNascimento(Date value) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

}
