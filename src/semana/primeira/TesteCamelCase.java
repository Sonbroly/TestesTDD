package semana.primeira;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteCamelCase {

	@Test
	public void test() {
		List<String> listaOriginal;
		listaOriginal =  Arrays.asList("nome");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("nome"));
		assertEquals(listaOriginal, CamelCase.converterCamelCase("Nome"));
		listaOriginal =  Arrays.asList("nome", "composto");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("nomeComposto"));
		assertEquals(listaOriginal, CamelCase.converterCamelCase("NomeComposto"));
		listaOriginal =  Arrays.asList("CPF");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("CPF"));
		listaOriginal =  Arrays.asList("numero", "CPF");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("numeroCPF"));
		listaOriginal =  Arrays.asList("numero", "CPF", "contribuinte");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("numeroCPFContribuinte"));
		listaOriginal =  Arrays.asList("recupera", "10", "primeiros");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("recupera10Primeiros"));
		listaOriginal =  Arrays.asList("Inválido");
		assertEquals(listaOriginal, CamelCase.converterCamelCase("10Primeiros"));
		assertEquals(listaOriginal, CamelCase.converterCamelCase("nome#Composto"));
	}
}
