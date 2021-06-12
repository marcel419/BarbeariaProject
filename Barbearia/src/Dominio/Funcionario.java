package Dominio;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	
	private Gerente gerente;
	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void setNome(String value) {
		this.nome = value;
	}

	@Override
	public String getCpf() {
		return this.cpf;
	}

	@Override
	public void setCpf(String value) {
		this.cpf = value;
	}

	@Override
	public String getTelefone() {
		return this.telefone;
	}

	@Override
	public void setTelefone(String value) {
		this.telefone = value;
	}

	@Override
	public String getEndereco() {
		return this.endereco;
	}

	@Override
	public void setEndereco(String value) {
		this.endereco = value;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setEmail(String value) {
		this.email = value;
	}
	
	@Override
	public Date getdataNascimento() {		
		return this.dataNascimento;
	}

	@Override
	public void setdataNascimento(Date value) {
		this.dataNascimento = value;		
	}
	
	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
}
