package my.day02;

import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("��ǻ�Ͱ� ������ ����: " + num);

		// 2�ܰ� �Է� �޾Ƽ� ���� ������ �ش�Ǵ��� Ȯ��
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("0�� 100������ ���ڸ� �Է��ϼ���(�� : 45) :");
			int inputNum = scan.nextInt();
			
			/* �Էµ� ���ڰ� ������ �´°�? */
			if (inputNum >= 0 && inputNum < 100) {
				count++;
				if (inputNum == num) {
					System.out.println(count + "���� ���߼̽��ϴ�.");
					break;
				} else if (inputNum < num) {
					/* �������� �۴ٸ� �Էµ� ���ڰ� ������ �۽��ϴ�. �� ����Ѵ�. */
					System.out.println(inputNum + "�� �������� �۽��ϴ�.");
				} else {
					/* �������� ũ�ٸ� �Էµ� ���ڰ� ������ Ů�ϴ�. �� ����Ѵ�. */
					System.out.println(inputNum + "�� �������� Ů�ϴ�.");
				}

			} else {
				/* �߸��� �Է��̶�� �ٽ� �Է��� �޴´�. */
				System.out.println("�߸��� �Է��Դϴ�.");
			}

		}
	}

}
