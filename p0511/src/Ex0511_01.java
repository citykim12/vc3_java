import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� 2.031457 �Է¹޾� 5�ڸ� �ݿø��ؼ� ��� �Ͻÿ�.
		System.out.println("���ڸ� �Է��ϼ���.>>");
		double num = scan.nextDouble();
		double result = Math.round(num*10000)/10000.0;
		System.out.println("result : "+result);
		
		
		// ���� 1
		// ���ڸ� �Է¹޾� ¦������, Ȧ�� ���� ����Ͻÿ�. (if)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ���.>>");
//		int num = scan.nextInt(); //������
//		if(num%2==0) {
//			System.out.println("¦���Դϴ�.");
//		}else {
//			System.out.println("Ȧ���Դϴ�.");
//		}

	}

}
