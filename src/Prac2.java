import java.util.Scanner;

public class Prac2 {
	 public static void main(String[] args){
			Scanner scn = new Scanner(System.in); //스캐너 객체를 생성 : ( Scanner 객체_이름 = new Scanner(System.in); )
			System.out.println("\"입력한 숫자만큼 식권을 발급하는 자판기를 만들어주세요.\""); // 예문
			System.out.print("식권은 개당 천원입니다 몇 장 필요하신가요? : ");
			int tickets = scn.nextInt();
			int money = tickets * 1000;
			for (int i = 1; i <= tickets; i++) {
				System.out.print("[식권] ");
				if (i == tickets) {
					System.out.print("\n");
				}
			}
			System.out.print("가격은 " + money + "원 입니다.");
			scn.close();
	 }
}
