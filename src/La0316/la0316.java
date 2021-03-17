/**1.인사하기 : 이름을 입력받아 이름을 이용하여 인사말을 출력하는 프로그램을 작성해보자*/

package La0316;

import java.util.Scanner;

public class la0316 {

	public static void main(String[] args) { 
		
		//입력부분
		System.out.println("--------------");
		System.out.println("성함을 입력해주세요:");
		
		//문자열연결부분
		Scanner name = new Scanner(System.in.);
		String nameeString;
		nameeString = name.nextLine();
		
		//출력부분
		System.out.println("Hello, "+ nameeString +" nice to meet you!");
		

	}

}


