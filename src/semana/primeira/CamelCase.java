package semana.primeira;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {

	public static List<String> converterCamelCase(String original){
		List<String> listaNova = new ArrayList();
		char[] originalCharArray = original.toCharArray();
		String originalAux = "";

		for(int i = 0; i <= originalCharArray.length-1; i++) {
			if(containsSpecialCharacter(original , i)) return isInvalid(listaNova);

			if (!Character.isDigit(originalCharArray[i])) {
				if(Character.isUpperCase(originalCharArray[i]))
					if(nextCharacterIsUpperCase(i, originalCharArray)) {
						if (!isFirst(i)) originalAux = breakWord(listaNova, originalAux);
						originalAux += Character.toLowerCase(originalCharArray[i]);
						continue;
					} else if (isFirstAndPreviousCharacterIsUpperCase(i, originalCharArray)) originalAux = breakWord(listaNova, originalAux);
			} else {
				if (isFirst(i)) return isInvalid(listaNova);
				if(nextCharacterIsUpperCase(i, originalCharArray)) originalAux = breakWord(listaNova, originalAux);
			}
			originalAux += originalCharArray[i];
		}

		listaNova.add(originalAux);
		return listaNova;
	}
	
	private static String breakWord(List<String> listaNova, String originalAux) {
		listaNova.add(originalAux);
		return "";
	}

	public static boolean isFirstAndPreviousCharacterIsUpperCase(int i, char... originalCharArray) {
		if(!isFirst(i) && !Character.isUpperCase(originalCharArray[i-1])) return true;
		return false;
	}
	
	public static boolean nextCharacterIsUpperCase(int i, char... originalCharArray) {
		if(i < originalCharArray.length-1 && !Character.isUpperCase(originalCharArray[i+1])) return true;
		return false;
	}
	
	public static boolean containsSpecialCharacter(String s, int i) {
		String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
		if (specialChars.contains(s.substring(i, i+1))) return true;
		return false;
	}
	
	public static List<String> isInvalid(List<String> listaNova) {
		listaNova.add("Inválido");
		return listaNova;
	}
	
	public static boolean isFirst(int posicao) {
		return posicao == 0;
	}

}
