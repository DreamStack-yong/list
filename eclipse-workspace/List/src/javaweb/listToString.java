package javaweb;

public class listToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[][] list = new String[2][3];
//		int[] l1 = new int[4];
//		int[] l2 = { 1, 2, 4 };
//		listToString lts = new listToString();
//		 String s=lts.toString(l2);
//		 System.out.println(s);
//		String s2 = lts.toString(l1);
//		System.out.println(s2);
		
		String[] arr ={"0123","sb","12f"};
		StringBuffer sb = new StringBuffer();
		 
		for(int i = 0;i<arr.length;i++){
		sb.append(arr[i]+",");        //append String并不拥有该方法，所以借助StringBuffer
		}
		sb.delete(sb.length()-1, sb.length());
		String sb1 = sb.toString();
		System.out.println(sb1);  
	}

//	public String toString(int[] l) {
//		StringBuffer sf = new StringBuffer();
//			for (int i = 0; i <= l.length; i++) {
//				sf.append(l[i]);
//			}
//		return sf.toString();
//	}
}
