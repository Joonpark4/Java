import java.util.Scanner; //스캐너 클래스를 사용할 것이므로 스캐너 클래스 호출

public class Champ{ //챔피언 클래스
	String Q = "";
	String W = "";
	String E = "";
	String R = "";
	String Name = "";
	
	Champ(String q, String w, String e, String r, String name){ //챔피언을 찍어낼 생성자 틀
		Q = q;
		W = w;
		E = e;
		R = r;
		Name = name;
	}
	
	public static void main(String[] args) {
		Champ Garen = new Champ("결정타", "용기", "심판", "데마시아의 정의", "가렌"); // Champ 클래스를 이용해 Garen 오브젝트 생성
		Champ Amumu = new Champ("붕대 던지기", "절망", "짜증내기", "슬픈 미라의 저주", "아무무");
		Champ Kayle = new Champ("광휘의 일격", "천상의 축복", "화염주문검", "신성한 심판", "케일");
		
		System.out.println("알고 싶은 챔피언을 번호로 선택하세요. \n 1. 가렌 \n 2. 아무무 \n 3. 케일 ");
		Scanner scn = new Scanner(System.in); // 값을 입력받기 위해 Scanner 클래스를 이용해 scn 오브젝트 생성
		int Champion = scn.nextInt(); //nextInt메소드를 사용해 입력 받음
		
		if (Champion == 1) {
			System.out.println(Garen.Name + "의 Q스킬은 \"" + Garen.Q + "\" 입니다.");
			System.out.println(Garen.Name + "의 W스킬은 \"" + Garen.W + "\" 입니다.");
			System.out.println(Garen.Name + "의 E스킬은 \"" + Garen.E + "\" 입니다.");
			System.out.println(Garen.Name + "의 R스킬은 \"" + Garen.R + "\" 입니다.");
		}
		if (Champion == 2) {
			System.out.println(Amumu.Name + "의 Q스킬은 \"" + Amumu.Q + "\" 입니다.");
			System.out.println(Amumu.Name + "의 W스킬은 \"" + Amumu.W + "\" 입니다.");
			System.out.println(Amumu.Name + "의 E스킬은 \"" + Amumu.E + "\" 입니다.");
			System.out.println(Amumu.Name + "의 R스킬은 \"" + Amumu.R + "\" 입니다.");
		}
		if (Champion == 3) {
			System.out.println(Kayle.Name + "의 Q스킬은 \"" + Kayle.Q + "\" 입니다.");
			System.out.println(Kayle.Name + "의 W스킬은 \"" + Kayle.W + "\" 입니다.");
			System.out.println(Kayle.Name + "의 E스킬은 \"" + Kayle.E + "\" 입니다.");
			System.out.println(Kayle.Name + "의 R스킬은 \"" + Kayle.R + "\" 입니다.");
		}
		scn.close();
	}

}

// 해결 필요 사항
// 1. for문을 사용하여 반복되는 출력 내용물을 줄이고 "champ.name"의 "Q~R"스킬은 "champ.q~r" 입니다 와 같이 변경
// 2. 알고 싶은 챔피언을 번호로 선택하는 것이 아닌 문자열 String 변수와 printLine()메소드로 받아 글자로 선택