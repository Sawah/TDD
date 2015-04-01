package iut.tdd;

import java.util.HashMap;

public class Convert {
	public static String num2text(String input) {
		HashMap <String,String> h=new HashMap<String, String>();
		
		h.put("0", "zéro");
		h.put("1", "un");
		h.put("2", "deux");
		h.put("3", "trois");
		h.put("4", "quatre");
		h.put("5", "cinq");
		h.put("6", "six");
		h.put("7", "sept");
		h.put("8", "huit");
		h.put("9", "neuf");
		return h.get(input);
	}
	public static String text2num(String input) {
		
		return null;
	}
}