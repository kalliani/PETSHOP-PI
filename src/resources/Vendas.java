package resources;

public class Vendas {
	private Double carrinho;
	private String endereco;
	
	public Vendas(Double carrinho, String endereco) {
		this.carrinho = carrinho;
		this.endereco = endereco;
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
	
	public String toString() {
		return "Valor total da compra: R$"
				+ carrinho
				+ "\nEndereço: "
				+ endereco;
	}
}
