package chapter17.printable3;

//컬러 프린터 드라이버
public class Prn909Drv implements ColorPrintable{
	//흑백출력
	@Override
	public void print(String doc) {
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("CMYK ver");
		System.out.println(doc);
	}

}
