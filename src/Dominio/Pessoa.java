package Dominio;

import java.util.Date;

public abstract class Pessoa {
	
	
	protected int ID;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String email;
	protected String nome;
	protected Date dataNascimento;
	
	public abstract int getID();
	public abstract void setID(int value);
	
	public abstract String getNome();
	public abstract void setNome(String value);
	
	public abstract String getCpf();
	public abstract void setCpf(String value);
	
	
	public abstract String getTelefone();
	public abstract void setTelefone(String value);
	
	public abstract String getEndereco();
	public abstract void setEndereco(String value);
	
	public abstract String getEmail();
	public abstract void setEmail(String value);
	
	public abstract Date getdataNascimento();
	public abstract void setdataNascimento(Date value);
}
