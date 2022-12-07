package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String pathFile = "C:\\Users\\Leonardo\\Desktop\\Ex\\sourceFile.txt";
		
		File file = new File(pathFile);
		List<String[]> dados = new ArrayList<>();
		List<Double> prices = new ArrayList<>();
		
		// lendo os dados do arquivo
		try (Scanner sc = new Scanner(file)) {
	    	while(sc.hasNextLine()) {
	    		dados.add(sc.nextLine().split(","));
	    	}
	    } catch(IOException err) {
	    	System.out.println("Error: " + err.getMessage());
	    }
		
		// lendo e somando o total
		for( String[] dado : dados ) {
//			for(int i=0; i<2; i++) {
				double total = Double.parseDouble(dado[1]) * Integer.parseInt(dado[2]);
//				System.out.println(total);
				prices.add(total);
//			}			
		}
		
		// criando doc e escrevendo nele
		int i=0;
		boolean sucess = new File("C:\\Users\\Leonardo\\Desktop\\Ex" + "\\out").mkdir(); // criando uma subpasta
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Leonardo\\Desktop\\Ex\\out\\summary.txt", true))) {
			for(Double data : prices) {
				bw.write(dados.get(i)[0] + "," + data);
				bw.newLine();
				i++;
			}				
		} catch(IOException err) {
			System.out.println("Error: " + err.getMessage());
		}
		
	}

}
