//연습문제1.인사하기
//once again
/**
 * 
 */
package La0316;

import java.util.Scanner;

/**
 * @author 82108
 *
 */
public class RandomOut5 {

	/**
	 * 
	 */
	public RandomOut5() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//입력부분
		System.out.println("--------------");
		System.out.println("성함을 입력해주세요:");
		String[] chatArray = { "Hello!", "Chao!", "Nihao!", "Hallo!", "Hola!", "Bonjur!", "Hi!", "GoodMorning!", "GoodAfternoon!", "GutenTag!"};
		
		
		for (int i = 1; i < 4; i++) {
			//문자열연결부분
			printYourName(i, chatArray);
		}

		
	
		// 배열을 선언하는 방법
//		int[] chatArray;
//		
//		//배열을 초기화하는 방법
//		chatArray = new int[10];

		// 배열 서언과 초기화 동시에 하는 방법
//		int[] chatArray = new int[10];

		// 원하는 값으로 배열 세팅하는 방법
		
		//printYourName(nameeString, chatArray);

	}
	private static void printYourName(int i, String[] chatArray) {
		//출력부분
		
		double d = Math.random();
		int dValue = (int) (d * 10);
		
		Scanner name = new Scanner(System.in);
		String nameeString;
		nameeString = name.nextLine();
		System.out.println("name : "+i+ "count ");
		System.out.println( "What is your name? " + nameeString + "\n"+ chatArray[dValue] + "," + nameeString+ ", nice to meet you! ");
	    
			
//			System.out.println(dValue);	
			
			
		}
	}
