package model;

public class Pessoa {
	//CAMPO OBRIGATÓRIO
	private int id; 
	//CAMPO OBRIGATÓRIO
	private String nome;//limitar o tamanho para até 100 caracteres
	//CAMPO OBRIGATÓRIO
	private String cpf; //validação cpf
	//CAMPO OBRIGATÓRIO
	private TipoSexo tipoSexo;
	//CAMPO OBRIGATÓRIO
	private TipoPessoa categoria;
	private Endereco endereco;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoPessoa getCategoria() {
		return categoria;
	}
	public void setCategoria(TipoPessoa categoria) {
		this.categoria = categoria;
	}
	public TipoSexo getTipoSexo() {
		return tipoSexo;
	}
	public void setTipoSexo(TipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}
}
