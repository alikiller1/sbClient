package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegTest {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(("a\\*{1,2}"));
		String s="aba**123a*";
		Matcher m= p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
