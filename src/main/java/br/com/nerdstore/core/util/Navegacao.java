package br.com.nerdstore.core.util;

import br.com.nerdstore.core.setup.*;

public class Navegacao extends DriverFactory{

	public static void irUrl(String url) {
		getDriver().get(url);
	}
}
