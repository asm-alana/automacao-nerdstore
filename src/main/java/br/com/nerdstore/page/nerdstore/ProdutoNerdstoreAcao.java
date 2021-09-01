package br.com.nerdstore.page.nerdstore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.nerdstore.core.setup.DriverFactory;

public class ProdutoNerdstoreAcao extends DriverFactory {

	ProdutoNerdstoreTela produtoNerdstoreTela = new ProdutoNerdstoreTela(getDriver());

	public void consultoPorProduto(String nomeCamiseta) {
		produtoNerdstoreTela.txtBuscar.sendKeys(nomeCamiseta);
	}

	public void apertarTeclaEnter() {
		produtoNerdstoreTela.btnBuscar.sendKeys(Keys.ENTER);
	}

	public void selecionarOTamanho(String tamanhoCamiseta) {
		By btnTamanhoCamiseta = By.xpath("//span[@data-value= '"+tamanhoCamiseta+"']");
		getDriver().findElement(btnTamanhoCamiseta).click();
	}
	
	public void clicarBotaoComprar() {
		try {
			produtoNerdstoreTela.btnComprar.click();
			if (produtoNerdstoreTela.txtForaDeEstoque.isDisplayed()) {
				System.out.println("fora de estoque");
			}
		} catch (Exception e) {
			
		}
		
		
	}
}
