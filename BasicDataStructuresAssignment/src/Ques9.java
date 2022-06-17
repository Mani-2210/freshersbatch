import java.util.Scanner;

public class Ques9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the scores of the first student");
    int a =sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("Enter the scores of the second student");
    int a1=sc.nextInt();
    int b1=sc.nextInt();
    int c1=sc.nextInt();
    System.out.println("Enter the score of the third student");
    int a2=sc.nextInt();
    int b2=sc.nextInt();
    int c2=sc.nextInt();
    int tot=a+b+c;
    System.out.println("the total score of first student "+tot+" avg is "+tot/3);
    int tot1=a1+b1+c1;
    System.out.println("the total score of second student "+tot1+" avg is "+tot1/3);
    int tot2=a2+b2+c2;
    System.out.println("the total score of third student "+tot2+" avg is "+tot2/3);
    System.out.println("*************************");
    int mar=a+a1+a2;
    System.out.println("the total marks in the first subject "+mar+" avg is "+mar/3);
    int mar1=b+b1+b2;
    System.out.println("the total marks in the second subject "+mar1+" avg is "+mar1/3);
    int mar2=c+c1+c2;
    System.out.println("the total marks in the third subject "+mar2+" avg is "+mar2/3);
}
}
