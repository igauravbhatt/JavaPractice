package string;

public class reversestring {
	public static void main(String[] args) {
		
	
		String s="I am StringBuffer";
		int len=s.length();	
		//System.out.println(s.charAt(1));
		int i;
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuilder sb2 = new StringBuilder("I am stringBuilder");
		System.out.println(sb2);
		//sb2.reverse();
		//System.out.println(sb2);
		sb2.append("will");
		System.out.println(sb2);
		sb2.replace(2, 4, "will");
		System.out.println(sb2);
		sb2.insert(2, "am");
		System.out.println(sb2);
//		for(i=len-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//			
//			
//		}
	
	}

}
