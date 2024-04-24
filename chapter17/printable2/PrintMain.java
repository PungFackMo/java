package chapter17.printable2;

public class PrintMain {
	
	public static void main(String[] args) {
		String myDoc="This is a report about/..//";
		
		Printable prn=new SPrinterDriver();
		prn.print(myDoc);
		
		prn=new LPrinterDriver();
		prn.print(myDoc);
		
		Prn909Drv prn1=new Prn909Drv();
		prn1.print(myDoc);
		prn1.printCMYK(myDoc);
	}
}
