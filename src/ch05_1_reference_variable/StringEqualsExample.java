package ch05_1_reference_variable;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
			String strVar3 = new String("�Ź�ö");
			String strVar4 = new String("�Ź�ö");
		
			if(strVar3 == strVar4) {
				System.out.println("strVar3�� strVar4�� ������ ����");
			} else {
				System.out.println("strVar3�� strVar4�� ������ �ٸ�");
			}	
			
			if(strVar1.equals(strVar2)) {
				System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
			}
			
			
			
			
			
			
		
	}
}

//String str1 = "java" ;
//String str2 = "java" ;

//System.out.println(str1 == str2);
//System.out.println(str1.hashCode());
//System.out.println(str2.hashCode());

//String str3 = new String("java");
//String str4 = new String("java");
//System.out.println(str2 == str3);
//System.out.println(str2.equals(str4));

//System.out.println(System.identityHashCode(str1));
//System.out.println(System.identityHashCode(str2));
//System.out.println(System.identityHashCode(str3));
//System.out.println(System.identityHashCode(str4));


