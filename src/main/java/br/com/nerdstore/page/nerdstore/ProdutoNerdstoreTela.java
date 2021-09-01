package br.com.nerdstore.page.nerdstore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.nerdstore.core.setup.PaginaBase;

public class ProdutoNerdstoreTela extends PaginaBase{

	public ProdutoNerdstoreTela(WebDriver driver) {
		super(driver);

	}
	

	@FindBy(id = "search")
	public WebElement txtBuscar;
	
	@FindBy(xpath = "//*[@class=\"header-desktop__main__search__submit\"]")
	public WebElement btnBuscar;
	
	@FindBy(xpath = "//h1[@class=\"product_title entry-title\"]")
	public WebElement txtCamiseta;
	
	@FindBy(xpath = "//*[@class=\"summary entry-summary\"]//span[contains (text(), 'R$')]/..")
	public WebElement txtPreco;
		
	@FindBy(xpath = "//*[@class=\"single_add_to_cart_button button alt\"]")
	public WebElement btnComprar;
	
	@FindBy(xpath = "//div/table/tbody/tr[1]/td[2]//a[contains(text(), \"Camiseta 42 - Don't Panic\")]")
	public WebElement txtNomeCamiseta;
	
	@FindBy(xpath = "//div[@class=\"single-product__stock-alert\"]//strong[.='Fora de estoque']")
	public WebElement txtForaDeEstoque;
}
