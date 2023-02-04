import java.util.Scanner; //스캐너 클래스를 사용할 것이므로 스캐너 클래스 호출

public class Prac1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //스캐너 객체를 생성 : ( Scanner 객체_이름 = new Scanner(System.in); )
		//객체 생성 방법 : 클래스_이름 객체_이름 = new 클래스_이름();
		System.out.println("2, 3, 4학년일 경우 햄버거, 그 외에는 김밥을 주세요."); // 예문

		System.out.print("몇 학년이신가요? : ");
		int grade = scn.nextInt(); //nextInt메소드를 사용해 입력 받음
		if ( (grade >=2) && (grade <=4) ) { //2~4에 해당하는 입력을 받으면 실행
			System.out.println(grade + "학년은 햄버거를 가져가세요.");
		}
		else { //2~4가 아닌 다른 입력을 받으면 실행
			System.out.println(grade + "학년은 김밥을 가져가세요.");
		}
		scn.close();
		
	}
}
// 한글 출력이 안될 경우엔 https://yeomboyeon.tistory.com/2 참조
// 1. window → preferences → 좌측 상단 검색 창 → spelling 입력 → Encoding : Default (UTF-8) 체크 →  Apply 클릭
// 2. window → preferences → 좌측 상단 검색 창 → Workspace 입력 → Text File encoding Encoding →  Other : UTF-8 체크 → Apply 클릭
// 3. 현재 진행중인 프로젝트의 mainclass 실행(키보드 F11 실행)
// 4. 현재 진행중인 프로젝트 마우스 오른쪽 클릭 → Properties → Run/Debug Settings 클릭
// 5. 목록에 나와있는 현재 진행중인 class 선택(마우스 더블 클릭)
// 6. Arguments  → VM arguments Arguments  → text 작성란 " -Dfile.encoding=MS949 " 입력  → Apply 클릭
// 7. Common  →  Encoding  → Other 란  " EUC-KR " 입력  → Apply 클릭 →  OK 클