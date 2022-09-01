package cct.java.com;

import java.util.HashMap;

public class CalendarCryptoUtils {
	
	public static HashMap<Integer, String> weekNameMap  = new HashMap<Integer, String>(){
		private static final long serialVersionUID = 1L;
	{  
	      put(1,"S2");
	      put(2,"M");
	      put(3,"T1");
	      put(4,"W");
	      put(5,"T2");
	      put(6,"F");
	      put(7,"S1");
	}};
	
	public static HashMap<Integer, Character> wordMap  = new HashMap<Integer, Character>();
	public static HashMap<Character, Integer> wordReMap  = new HashMap<Character, Integer>();
	
	public static void initwordMap() {
		for(int i=0;i<26;i++) {
			wordMap.put(i+1, (char) (97+i));
			wordReMap.put((char) (97+i), i+1);
		}
	}

}
