package br.com.nerdstore.hooks;


import br.com.nerdstore.core.setup.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HookAfter {

	@After
	public void finalizar(Scenario cenario) {

		DriverFactory.killDriver();
	}

}
