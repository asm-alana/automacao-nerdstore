package br.com.nerdstore.steps;

import br.com.nerdstore.core.setup.SiteNavegacao;
import br.com.nerdstore.page.nerdstore.ProdutoNerdstoreAcao;
import br.com.nerdstore.page.nerdstore.ProdutoNerdstoreVerificar;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class NerdstoreSteps {

	ProdutoNerdstoreAcao produtoNerdstoreAcao = new ProdutoNerdstoreAcao();
	ProdutoNerdstoreVerificar produtoNerdstoreVerificar = new ProdutoNerdstoreVerificar();

	@Dado("que estou no site Nerdstore")
	public void queEstouNoSiteNerdstore() {
		SiteNavegacao.acessarSite();
	}

	@Quando("busco por {string}")
	public void buscoPorCamiseta(String buscarCamiseta) {
		produtoNerdstoreAcao.consultoPorProduto(buscarCamiseta);
		produtoNerdstoreAcao.apertarTeclaEnter();

	}

	@Entao("sou redirecionado para a pagina com o titulo {string} e preco {string}")
	public void souRedirecionadoParaAPaginaComOTituloEPreco(String tituloCamiseta, String precoDaCamiseta) {
		produtoNerdstoreVerificar.validarPaginaDoProduto(tituloCamiseta, precoDaCamiseta);
	}

	@Quando("seleciono o tamanho {string}")
	public void selecionoOTamanho(String tamanhoCamiseta) {
		produtoNerdstoreAcao.selecionarOTamanho(tamanhoCamiseta);
		produtoNerdstoreAcao.clicarBotaoComprar();
	}
	
	@Entao("valido o nome {string} na pagina de Carrinho")
	public void validoONomeNaPaginaDeCarrinho(String nomeCamiseta) {
		produtoNerdstoreVerificar.validarPaginaDeCarrinho(nomeCamiseta);
	}
	
	@Quando("clico em Comprar")
	public void clicoEmComprar() {
		
	}
	
	@Entao("aparece a mensagem {string}")
	public void apareceAMensagem(String msgForaDeEstoque) {
		produtoNerdstoreVerificar.validarMensagemForaDeEstoque(msgForaDeEstoque);
	}
}