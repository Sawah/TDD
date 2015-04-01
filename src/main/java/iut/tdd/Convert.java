package iut.tdd;

import java.util.HashMap;

public class Convert {
	public String num2text(String input) {
		
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
		h.put("10", "dix");
		h.put("11", "onze");
		h.put("12", "douze");
		h.put("13", "treize");
		h.put("14", "quatorze");
		h.put("15", "quinze");
		h.put("16", "seize");
		h.put("20", "vingt");
		h.put("30", "trente");
		h.put("40", "quarante");
		h.put("50", "cinquante");
		h.put("60", "soixante");
		h.put("100","cent");
		h.put("1000", "mille");
		h.put("000000","million");
		h.put("000000000", "milliard");
		return h.get(input);
	}
	
	
	public static String text2num(String input) {
		
		return null;
	}
}