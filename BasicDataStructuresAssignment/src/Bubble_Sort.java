
public class Bubble_Sort {
public static void main(String[] args) {
	int [] a= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int temp;
	boolean fixed=false;
	while(fixed==false) {
		fixed=true;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]>a[i+1]) {
			temp=a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
      		fixed=false;
		}
	}
	}
	for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
	}
}
}
