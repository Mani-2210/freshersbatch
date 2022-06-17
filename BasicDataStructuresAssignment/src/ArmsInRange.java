
public class ArmsInRange {
public static void main(String[] args) {
	int l=100;
	int m=999;
	int limit=0;
	int rem=0;
	int res=0;
	int val=1;
	int temp=0;
	int com=0;
	for(int i=l;i<m;i++) {
	     temp=i;
		 com=i;
		while(temp!=0) {
			temp/=10;
		    limit++;
		}
		while(i!=0) {
			 rem=i%10;
			val=1;
			for(int k=0;k<limit;k++) {
				val*=rem;
			}
		  res+=val;
			i/=10;
		}
		if(res==com) {
			System.out.println(res);
		}
		
	}
}
}
