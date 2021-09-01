package br.com.nerdstore.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.nerdstore.core.setup.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)	
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "",
		plugin = {"html:src/test/resources/evidencias/relatorio/html/report.html"},
		tags = "@test2",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)	


public class CucumberRunner {
	
	@AfterClass
	public static void finalizarRunner() {
		DriverFactory.killDriver();
	}
}
