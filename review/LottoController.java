package review;

//4
import java.util.Random;
import java.util.ArrayList;

//랜덤으로 로또 번호 생성
public class LottoController {
	
	private LottoDto lottoDto=new LottoDto();
	
	public void getLottoNums() {
		Random random=new Random(45);
		ArrayList<Integer> lottoDtos=lottoDto.getLottoNums();
		for(int i=0;i<6;i++) {
			lottoDtos.add(random.nextInt(45));
		}
	}
	
	//로또 번호 한세트 출력
	public void printLottoNums() {
		for(int num:lottoDto.getLottoNums()) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
