package br.com.nerdstore.core.util;

import org.openqa.selenium.By;

import br.com.nerdstore.core.setup.DriverFactory;

public class Click extends DriverFactory{

	public static void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}
}
