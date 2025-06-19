package factoryMethodPatternExample;

public class PdfDoc implements Document {
	public void open() {
		System.out.println("Opening Pdf file");
	}

}
