import java.util.Scanner; //스캐너 클래스를 사용할 것이므로 스캐너 클래스 호출
public class arrange{
	public static void main(String[] args){
		double 숫자[] = new double [3]; //소숫점을 허용할 것이므로 double 자료형으로 숫자를 받는다

		for(int N = 0; N < 3; N++){
			System.out.println(N + 1 + "번째 숫자를 입력해주세요"); // N+1을 하지 않으면 0~2번째 숫자를 입력하라 한다
			Scanner scn = new Scanner(System.in); // 값을 입력받기 위해 Scanner 클래스를 이용해 scn 오브젝트 생성
			숫자[N] = scn.nextDouble(); //nextDouble메소드를 사용해 소숫점까지 입력 받음
		}
		double 평균 = (숫자[0] + 숫자[1] + 숫자[2])/3;
		System.out.println("세 숫자의 평균은" + 평균 + " 입니다.");
  }
 }
