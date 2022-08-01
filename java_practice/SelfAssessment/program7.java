package SelfAssessment;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
		StringBuffer sb3=new StringBuffer("My Name is Anthony and my salary is $10,000 and I am sr software tester");
		i=sb3.length();
		do {
			if(sb3.length()>35) {
				System.out.println(sb3.reverse());
			} else {
				System.out.println("muje nahi ata");
			}
			i--;
		} while(i>=0);
			
		
	}

}
