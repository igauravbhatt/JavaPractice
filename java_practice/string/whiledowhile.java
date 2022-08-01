package string;

public class whiledowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i=1;
int count=1;
int ans=5;
while(i<=10) {
	System.out.println("5 x "+count+" = "+ans);
	count++;
	ans=ans+5;
	i++;
		
}
	
/*do {System.out.println("hi");

} while(i<=10) ;
	
}*/

String s="9876543210";
int ite;
int len=s.length();
for(ite=len-2;ite>=0;ite=ite-2) {
	System.out.print(s.charAt(ite));
}
	}}//for(ite=10;10>=0;10-2)
//charat(8)



