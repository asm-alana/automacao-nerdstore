package br.com.nerdstore.core.setup;

import br.com.nerdstore.core.util.Navegacao;
import static br.com.nerdstore.core.util.Configuracoes.getProperties;

public class SiteNavegacao extends DriverFactory {

	public static void acessarSite() {
		Navegacao.irUrl(getProperties().getProperty("url"));		
	}

//	public static void siteNavegacao(String url) {
//		
//		getDriver().get(url);
//	}
}
