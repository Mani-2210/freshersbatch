import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int temp =n;
	int m=n;
    int rem=0;
    int res=1;
    int limit=0;
    while(temp!=0) {
    	temp/=10;
    	limit++;
    }
    System.out.println(limit);
    while(n!=0) {
    	int i=n%10;
    	res=1;
    	for(int h=0;h<limit;h++) {
    		res*=i;
    	}
    	rem+=res;
    	n/=10;
    }
    System.out.println(rem);
	if(rem==m) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
