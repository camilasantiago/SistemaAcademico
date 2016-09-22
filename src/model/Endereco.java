package model;

public class Endereco {

	private int id; //OBRIGATORIO E INCREMENTAL
	private String logradouro;
	private String bairro; //OBRIGATORIO, LANÇA EXCEPTION
	private int numero; //OBRIGATORIO E LANÇA EXCEÇÃO
	private CidadesPernambuco cidade;
	private String uf;
}
