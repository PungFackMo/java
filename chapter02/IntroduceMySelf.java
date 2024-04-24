package chapter02;

public class IntroduceMySelf {

	public static void main(String[] args) {
		//변수 ☆☆☆☆☆
		//자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해
		//콘솔에 출력하세요
		//목적 : 변수를 선언하고 사용
		//boolean, int, double, String
		
		//자기 소개
		String my="저의";
		String name="여정모";
		double tall=171.7;
		int footSize=265;
		String where="강의실";
		double pencilLead=0.5;
		String favorite01="영화보기";
		String favorite02="3D 모델 만들기";
		String favorite03="그림 그리기";
		String favorite04="여행";
		String favorite05="사진찍기";
		int salesProfit=50;
		double runDistance=9.3;
		String kiloMeter="km";
		String dogName="코코";
		boolean male = true;
		int hand=10;
		boolean isEven=(hand%2==0);
		
		
		
		
		
		
		
			
		System.out.print(my);
		System.out.print(" 이름은 ");
		System.out.print(name);
		System.out.println(" 입니다.");
		
		
		System.out.print(my);
		System.out.print(" 키는 ");
		System.out.print(tall);
		System.out.print("이고");
		System.out.print(" 신발 사이즈는 ");
		System.out.print(footSize);
		System.out.println("입니다.");
		
		
		System.out.print("저는 지금 ");
		System.out.print(where);
		System.out.println("에 있습니다.");
		
		
		System.out.print(my);
		System.out.print(" 샤프심은 ");
		System.out.print(pencilLead);
		System.out.print("mm");
		System.out.println( "입니다.");
		
		
		System.out.print("제가 좋아하는 것은 ");
		System.out.print(favorite01+", "+favorite02+", "+
		                 favorite03+", "+favorite04+", "+
		                 favorite05);
		System.out.println("입니다.");
		
		
		System.out.print(my);
		System.out.print(" 취미는 ");
		System.out.print(favorite02);
		System.out.println("로 온라인 판매를 하는 것입니다.");
		
		
		System.out.print("최근 판매이익은 ");
		System.out.print(salesProfit);
		System.out.println("만원입니다.");
		
		
		System.out.print("저는 어제 ");
		System.out.print(runDistance);
		System.out.print(kiloMeter);
		System.out.println(" 뛰었습니다.");
		
		
		System.out.print(favorite05);
		System.out.print("를 하다보면 ");
		System.out.print(favorite04);
		System.out.println("을 가고 싶어집니다.");
		
		
		System.out.print(favorite04);
		System.out.print("을 가면서 ");
		System.out.print(favorite03);
		System.out.print("를 하다 보면");
		System.out.println(" 기분이 좋아집니다.");
		
		
		System.out.print("제가 키우는 강아지의 이름은 ");
		System.out.print(dogName);
		System.out.print(" 이며");
		
		
		if (male) {
			System.out.println(" 수컷입니다.");
		} else {
			System.out.println(" 수컷이 아닙니다.");
		}
		
		
		String dogFavorite;
		if(male) {
			dogFavorite="암컷 강아지를 좋아합니다.";
		} else {
			dogFavorite="수컷 강아지를 좋아합니다.";
		}
		
		
		System.out.print("우리 ");
		System.out.print(dogName);
		System.out.print("는 ");
		System.out.println(dogFavorite);
		
		
		System.out.print("저의 손가락은 총 ");
		System.out.print(hand);
		System.out.print("개 이며 ");
		if(isEven) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		int jump=60;
		boolean touch;
		if(jump+tall>230) {
			touch=true;
		} else {
			touch=false;
		}
		if(touch) {
			System.out.println("저는 천장에 손터치가 가능합니다.");
		} else {
			System.out.println("저는 천장에 손터치가 불가능합니다.");
		}
		
		
		int attendance=85;
		int totalAttendance=86;
		boolean ComplStatus;
		if(attendance>totalAttendance*0.8) {
			ComplStatus=true;
		} else {
			ComplStatus=false;
		}
		System.out.print("저는 정처기 강의를 ");
		if(ComplStatus) {
			System.out.println("이수 완료하고 자격증 취득을 하였습니다");
		} else {
			System.out.println("이수하지 못해서 자격증 취득을 못하였습니다.");
		}
		
		String fishA, fishB, fishC, fishD, fishE, fishF, fishG;
		fishA="김상덕";
		fishB="이리";
		fishC="김민우";
		fishD="김진우";
		fishE="김세아";
		fishF="강만식";
		fishG="고아라";

		System.out.println("");
		System.out.println("이 강에는 물고기가족이 살고 있다.");
		System.out.println("각 물고기들은 이름이 있는데 아빠 물고기 이름은 "
				+fishA
				+"이며 엄마, 첫째아들, 둘째아들, 셋째딸, 삼촌, 고모 순으로 "
				+fishB+", "
				+fishC+", "
				+fishD+", "
				+fishE+", "
				+fishF+", "
				+fishG
				+"이다.");
		
	
		double fishASize=36.5;
		double fishBSize=29.3;
		double fishCSize=37.5;
		double fishDSize=37.2;
		double fishESize=29.6;
		double fishFSize=41.1;
		double fishGSize=28.3;
		
		boolean size;
		
		int large=40;
		int medium=35;
		int small=30;
		int xSmall=25;
		
		String sizeL="L사이즈 옷을 입어야한다.";
		String sizeM="M사이즈 옷을 입어야한다.";
		String sizeS="S사이즈 옷을 입어야한다.";
		String sizeXS="XS사이즈 옷을 입어야한다.";
		
		if (fishASize >= large) {
			System.out.println("아버지는 "+large+"보다 크므로 "+sizeL);
		} else if (fishASize >= medium) {
			System.out.println("아버지는 "+medium+"보다 크므로 "+sizeM);
		} else if (fishASize >= small) {
			System.out.println("아버지는 "+small+"보다 크므로 "+sizeS);
		} else if (fishASize >= xSmall) {
			System.out.println("아버지는 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		if (fishBSize >= large) {
			System.out.println("어머니는 "+large+"보다 크므로 "+sizeL);
		} else if (fishBSize >= medium) {
			System.out.println("어머니는 "+medium+"보다 크므로 "+sizeM);
		} else if (fishBSize >= small) {
			System.out.println("어머니는 "+small+"보다 크므로 "+sizeS);
		} else if (fishBSize >= xSmall) {
			System.out.println("어머니는 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		if (fishCSize >= large) {
			System.out.println("첫째아들은 "+large+"보다 크므로 "+sizeL);
		} else if (fishCSize >= medium) {
			System.out.println("첫째아들은 "+medium+"보다 크므로 "+sizeM);
		} else if (fishCSize >= small) {
			System.out.println("첫째아들은 "+small+"보다 크므로 "+sizeS);
		} else if (fishCSize >= xSmall) {
			System.out.println("첫째아들은 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		if (fishDSize >= large) {
			System.out.println("둘째아들은 "+large+"보다 크므로 "+sizeL);
		} else if (fishDSize >= medium) {
			System.out.println("둘째아들은 "+medium+"보다 크므로 "+sizeM);
		} else if (fishDSize >= small) {
			System.out.println("둘째아들은 "+small+"보다 크므로 "+sizeS);
		} else if (fishDSize >= xSmall) {
			System.out.println("둘째아들은 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		if (fishESize >= large) {
			System.out.println("셋째딸은 "+large+"보다 크므로 "+sizeL);
		} else if (fishESize >= medium) {
			System.out.println("셋째딸은 "+medium+"보다 크므로 "+sizeM);
		} else if (fishESize >= small) {
			System.out.println("셋째딸은 "+small+"보다 크므로 "+sizeS);
		} else if (fishESize >= xSmall) {
			System.out.println("셋째딸은 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		if (fishFSize >= large) {
			System.out.println("삼촌은 "+large+"보다 크므로 "+sizeL);
		} else if (fishFSize >= medium) {
			System.out.println("삼촌은 "+medium+"보다 크므로 "+sizeM);
		} else if (fishFSize >= small) {
			System.out.println("삼촌은 "+small+"보다 크므로 "+sizeS);
		} else if (fishFSize >= xSmall) {
			System.out.println("삼촌은 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		if (fishGSize >= large) {
			System.out.println("고모는 "+large+"보다 크므로 "+sizeL);
		} else if (fishGSize >= medium) {
			System.out.println("고모는 "+medium+"보다 크므로 "+sizeM);
		} else if (fishGSize >= small) {
			System.out.println("고모는 "+small+"보다 크므로 "+sizeS);
		} else if (fishGSize >= xSmall) {
			System.out.println("고모는 "+xSmall+"보다 크므로 "+sizeXS);
		}
		
		
		//System.out.println 개행(enter)
		//System.out.print   개행이 없음
		
		
	}

}
