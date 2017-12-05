package ttt;
import java.util.Arrays;
public class myfirst {
 public static void main(String args[]) {
	 int[] a= {9,4,6,7,2,8,1,3,5};
	 int[] b= {1};
	 int[] c=hebing(a,b);
	 int[] d=guibing(a);
	 System.out.println(Arrays.toString(d));
 }
 static int[] hebing(int a[] ,int b[] ) {
	 int length_a=a.length;
	 int length_b=b.length;
	 int i = 0,j=0;
	 int[] res=new int [length_a+length_b];
	 while(true) {
		 if(a[i]>=b[j])
		 {
			 res[i+j]=b[j++];
			 
		 }
		 else {
			 res[i+j]=a[i++];
			 
		 }
		 if(i==length_a) {System.out.print('i');break;}
		 if(j==length_b) {System.out.print('j');break;}
	 }
	 if(i<length_a) {
		 
		 for(;i<length_a;i++) {
			 res[i+j]=a[i];
		 }
	 }
	 if(j<length_b) {
		 
		 System.out.print(i);
		 for(;j<length_b;j++) {
			 res[i+j]=b[j];
		 }
	 }
	 return res;
	}
static int[] guibing(int n[]) {
	int length=n.length;
	if (length==1) {return n;}
	else {
		int[] a=Arrays.copyOfRange(n, 0, length/2);
		System.out.println(Arrays.toString(a));
		int [] b=Arrays.copyOfRange(n, length/2, length);
		System.out.println(Arrays.toString(b));
		return hebing(guibing(a),guibing(b));
	}
}
}
