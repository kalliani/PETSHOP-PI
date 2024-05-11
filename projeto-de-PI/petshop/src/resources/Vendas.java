package resources;

public class Vendas {
	private Double carrinho;
	private String endereco;
	private String cliente;
	private String data;
	
	public Vendas(Double carrinho, String endereco, String cliente, String data) {
		this.carrinho = carrinho;
		this.endereco = endereco;
		this.cliente = cliente;
		this.data = data;
	}

	public Double getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Double carrinho) {
		this.carrinho = carrinho;
	}

	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString() {
		return "Valor total da compra: R$"
				+ carrinho
				+ "\nEndereço: "
				+ endereco
				+ "\nQuem comprou: "
				+ cliente
				+ "\nData da compra: "
				+ data;
	}
}
