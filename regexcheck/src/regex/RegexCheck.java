package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {
	public static void main(String[] args) {
		
		String st="[A-Z]{3}[0-9]{3}";
		String st2="DEV567KJH678SN";
		Pattern pattern=Pattern.compile(st);
		Matcher matcher=pattern.matcher(st2);
		while(matcher.find()){
			System.out.println("hi");
		}
		
	}

}
