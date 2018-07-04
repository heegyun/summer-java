package my.day02;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("컴퓨터가 생성한 난수: " + num);

		// 2단계 입력 받아서 숫자 범위에 해당되는지 확인
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("0과 100사이의 숫자를 입력하세요(예 : 45) :");
			int inputNum = scan.nextInt();
			
			/* 입력된 숫자가 범위에 맞는가? */
			if (inputNum >= 0 && inputNum < 100) {
				count++;
				if (inputNum == num) {
					System.out.println(count + "번에 맞추셨습니다.");
					break;
				} else if (inputNum < num) {
					/* 난수보다 작다면 입력된 숫자가 난보다 작습니다. 를 출력한다. */
					System.out.println(inputNum + "은 난수보다 작습니다.");
				} else {
					/* 난수보다 크다면 입력된 숫자가 난보다 큽니다. 를 출력한다. */
					System.out.println(inputNum + "은 난수보다 큽니다.");
				}

			} else {
				/* 잘못된 입력이라면 다시 입력을 받는다. */
				System.out.println("잘못된 입력입니다.");
			}

		}
	}

}
