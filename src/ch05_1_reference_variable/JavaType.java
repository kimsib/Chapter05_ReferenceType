package ch05_1_reference_variable;

public class JavaType {
public static void main(String[] args) {
	

						int iv = 10;
						double dv = 10.0;
		
						System.out.println(iv);
						System.out.println(dv);
							
						// int�� 1���� �迭 ����	
						int[] ar0 = new int[2];
						int[] ar1 = new int[3];
						int[] ar2 = new int[2];
						
						System.out.println(ar0);
						System.out.println(ar1);
						System.out.println(ar2);
							
						// int�� 1���� �迭�� ���� �迭3�� ¥�� 2���� �迭 ����
						int [][] arrs = new int[3][];
						
						
						
						
						for(int i = 0; i < arrs.length; i++) {
							for(int j = 0; j< arrs[i].length; j++) {
								System.out.println(arrs[i][j] + ", ");
							}
							
						}
						System.out.println();
							
}
}