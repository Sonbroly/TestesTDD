package semana.primeira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCase {

	public static List<String> converterCamelCase(String original){
		char[] originalCharArray = original.toCharArray();
		for(char charAuxiliar : originalCharArray) {
			if (Character.isDigit(charAuxiliar))
				if(Character.isUpperCase(charAuxiliar))
					
		}
		List<String> listaNova = Arrays.asList(original.toLowerCase());
		return listaNova;
	}

}
