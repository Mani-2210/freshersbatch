import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	int count=3;
	String s;
	String s1;
	while(count!=0) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	 s=sc.next();
	System.out.println("Enter the password");
	 s1=sc.next();
	if(s.equals("mani")&&s1.equals("mani123")) {
		System.out.println("Welcome");break;
	}
	else {
		count --;
	}
}
	if(count<1) {
	System.out.println("contact the admin");
	}
}
}
