package Ch05_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
		// ���� �� Ư�� ���ǿ� ���� ������ ����ϰ� ���� ��..	
//		String version = "";
//		if(args != null) {
//			version = args[0];	
//			if(version.equals("kor")) {
//				System.out.println("�ȳ��ϼ���~" + args[1]);
//		} else {
//		System.out.println("hello~" + args[1]);
//	}
//	}
		
		int var = add(7, 3);
		System.out.println(var);
		
		
		
		
		if(args.length !=2) {
			System.out.println("���� ���� �����մϴ�.");
		//	System.exit(0); // ���α׷� ���� ����
			return;
		}
		
				
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		
		int result = num1 + num2;
		System.out.println("��:" + result);
		
		
	}
		private static int add(int i, int j);
		return 
		
		
		
	}

