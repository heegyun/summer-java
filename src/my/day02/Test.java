package my.day02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한줄 주석 표현입니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		int num1 = scan.nextInt();
		// 이름을 입력하세요.라는 문자열 출력하기
		// 스캐너 객체를 이용하여 이름을 입력 받아오기
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		
		System.out.println("학번:" + num1);
		System.out.println("이름:" + name);
		
		
		
		
		
		
		
	}

}
