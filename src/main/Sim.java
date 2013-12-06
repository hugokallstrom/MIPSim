package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Sim {

	private ArrayList<String> instruction;
	
	public Sim(String file) {
		instruction = new ArrayList<String>();
		readFile(file);
		
	}
	/**
	 * readFile - reads the file specified as the input argument "file"
	 * and puts every line in a list containing strings.
	 */
	private void readFile(String file) {
		String line = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				instruction.add(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void mnemToConst() {
		String temp = "";
		String instructName = "";
		int i = 0;
		while((temp = instruction.get(i)) != null) {
			int index = temp.indexOf(" ");
			instructName = temp.substring(0, index);
			
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
