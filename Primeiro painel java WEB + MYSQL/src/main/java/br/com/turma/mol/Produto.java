package br.com.turma.mol;

public class Produto {
	
	public Produto() {}
	
	public Produto(int codigo, String nomeProduto, double valor, int quantidade) {
		
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	private int codigo;
	private String nomeProduto;
	private double valor;
	private int quantidade;
	
	public int getCodigo() {
		return codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
