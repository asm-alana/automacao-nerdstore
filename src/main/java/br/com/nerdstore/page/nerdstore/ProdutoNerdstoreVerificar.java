package br.com.nerdstore.page.nerdstore;

import org.junit.jupiter.api.Assertions;

import br.com.nerdstore.core.setup.DriverFactory;

public class ProdutoNerdstoreVerificar extends DriverFactory {

	ProdutoNerdstoreTela produtoNerdstoreTela = new ProdutoNerdstoreTela(getDriver());
	ProdutoNerdstoreAcao produtoNerdstoreAcao = new ProdutoNerdstoreAcao();

	public void validarPaginaDoProduto(String buscarCamiseta, String precoDaCamiseta) {
		Assertions.assertEquals(buscarCamiseta, produtoNerdstoreTela.txtCamiseta.getText());
		Assertions.assertEquals(precoDaCamiseta, produtoNerdstoreTela.txtPreco.getText());
	}

	public void validarPaginaDeCarrinho(String nomeCamiseta) {
		Assertions.assertEquals(nomeCamiseta, produtoNerdstoreTela.txtNomeCamiseta.getText());
		
	}
	
	public void validarMensagemForaDeEstoque(String msgForaDeEstoque) {
		Assertions.assertEquals(msgForaDeEstoque, produtoNerdstoreTela.txtForaDeEstoque.getText());
	}
}
