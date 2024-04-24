package chapter17.printable3;

//컬러 프린터 드라이버
public class Prn909Drv2 implements ColorPrintable{
	//흑백출력
	@Override
	public void print(String doc) {
		System.out.println("흑백출력~");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("컬러출력");
		System.out.println(doc);
	}

}
