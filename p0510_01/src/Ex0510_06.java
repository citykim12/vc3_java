import java.util.Scanner;

public class Ex0510_06 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    // 97���̻� A+
	    // 94-96�� A
	    // 90-93�� A-
	    // 87���̻� B+
	    // 84-86�� B
	    // 80-83�� B-
	    // 77���̻� C+
	    // 74-76�� C
	    // 70-73�� C-
	    // 67���̻� D+
	    // 64-66�� D
	    // 60-63�� D-
	    // 60������ F
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("������ �Է��ϼ���.>>");
	    int score = scan.nextInt();
	    //������ �Է¹޾�
	    // 90�̻��̸� A, 80->B, 70->C, 60->D, F
	    //97/10=(int)9.7=9
	    //81/10=(int)8.1=8
	    score = score / 10;
	    
	    switch (score) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	    
	    
//	    if(score>=90) {
//	    	System.out.println("A");
//	    }else if(score>=80) {
//	    	System.out.println("B");
//	    }else if(score>=70) {
//	    	System.out.println("C");
//	    }else if(score>=60) {
//	    	System.out.println("D");
//	    }else {
//	    	System.out.println("F");
//	    }
//	    
	    
	    
	    
//	    System.out.println("������ �Է��ϼ���.>>");
//	    int num = scan.nextInt();
//		
//		if(num==1 || num==7) {
//			System.out.println("SK");
//		}else if(num==6) {
//			System.out.println("KTF");
//		}else if(num==9) {
//			System.out.println("LG");
//		}else {
//			System.out.println("��Ż� ����");
//		}

	}

}
