package Dominio;

import java.util.Date;

public class Cliente extends Pessoa {


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

	@Override
	public int getID() {
		return this.ID;
	}

	@Override
	public void setID(int value) {
		this.ID = value;
	}

	
}
