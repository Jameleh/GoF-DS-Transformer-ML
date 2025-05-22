package app;

import java.io.BufferedReader;
import java.io.FileReader;

import instructions.Interpreter;

public class Main {
	private static Interpreter interpreter=new Interpreter();
	public static void main(String[] args) throws Exception 
	{
		BufferedReader file = new BufferedReader(new FileReader("factorial.txt"));

		String line;
		while ((line = file.readLine()) != null)
			
				interpreter.loadSentence(line);
			
		file.close(); 

		interpreter.executeProgram();
	}
}
