package factoryMethodPatternExample;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		while(true) {
			System.out.println("Enter the type pf document file you want to create (Word, PDF, Excel) or exit to exit");
			choice = sc.nextLine();	
			
			if(choice.equalsIgnoreCase("Word")) {
				DocFactory wordFactory = new WordDocFactory();
				Document wordDoc = wordFactory.createDocument();
				wordDoc.open();
				
			}
			
			else if(choice.equalsIgnoreCase("PDF")){
				DocFactory pdfFactory = new PdfDocFactory();
				Document pdfDoc = pdfFactory.createDocument();
				pdfDoc.open();
			}
			
			else if(choice.equalsIgnoreCase("Excel")){
				DocFactory excelFactory = new ExcelDocFactory();
				Document excelDoc = excelFactory.createDocument();
				excelDoc.open();
			}
			else if(choice.equalsIgnoreCase("exit")) {
				System.out.println("Exiting!");
				break;
			}
		}
	}
}
