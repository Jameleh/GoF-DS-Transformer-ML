package interpreter.lab;

import java.util.regex.Pattern;

public class Context {
	
	public String eliminateManySpaces(String str){
		
		str = str.replaceAll(Pattern.compile("[ ]+").toString(), " ");
		str = str.replaceAll(Pattern.compile("^[ ]").toString(), "");
		
		return str;
	}
	
	public String replaceQuotes(String str) {
		
		str = str.replaceAll(Pattern.compile("(“)+").toString(), "«");
		str = str.replaceAll(Pattern.compile("( \\w+ )+").toString(), "");
		str = str.replaceAll(Pattern.compile("(”)+").toString(), "»");
		
		return str;
	}
	
	public String replaceHyphen(String str) {
		
		str = str.replaceAll(Pattern.compile("( - )+").toString(), " _");
		
		return str;
	}
	
	public String eliminateLineFeeds(String str) {
		
		str = str.replaceAll(Pattern.compile("(\n)+").toString(), "\n");
			
		return str;
	}
	
	public String eliminateAmissSpaces(String str) {
		
		str = str.replaceAll(Pattern.compile("([(] )+").toString(), "(");
		str = str.replaceAll(Pattern.compile("( [)])+").toString(), ")");
		str = str.replaceAll(Pattern.compile("( [,])+").toString(), ",");
		str = str.replaceAll(Pattern.compile("( [.])+").toString(), ".");
		str = str.replaceAll(Pattern.compile("([«] )+").toString(), "«");
		str = str.replaceAll(Pattern.compile("( [»])+").toString(), "»");
		str = str.replaceAll(Pattern.compile("( [;]+)").toString(), ";");
		
		return str;
	}
	
	public String eliminateAmissTabs(String str) {
		
		str = str.replaceAll(Pattern.compile("( [\t])+").toString(), "\t");
		str = str.replaceAll(Pattern.compile("([\t] )+").toString(), "\t");
		str = str.replaceAll(Pattern.compile("[\t]+").toString(), "\t");
		str = str.replaceAll(Pattern.compile("[\t]+\n+").toString(), "\t");
		
		return str;
	}
	


}
