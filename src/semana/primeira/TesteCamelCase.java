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
	}
}
