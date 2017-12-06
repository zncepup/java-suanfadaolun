package ttt;

import java.util.Arrays;

public class Guibing {
	public static void main (String args[]) {
		int a[]= {1,2,3,7,5,4,6,9,8};
		guibing(a,0,a.length-1);
		System.out.print(Arrays.toString(a));
	}
	static void hebing(int a[],int left,int mid ,int right) {
		int[] linshi=new int[right-left+1];
//		for(int i=0;i<linshi.length;i++)
//			linshi[i]=11;
		int i=left;
		int j=mid+1;
		int index=0;
		while(i<=mid & j<=right) {
			if (a[i]<a[j])
				linshi[index++]=a[i++];
			else {
				linshi[index++]=a[j++];
			}
		}
		while(i<=mid) {linshi[index++]=a[i++];}
		while(j<=right) {linshi[index++]=a[j++];}
		for(int k=0;k<linshi.length;k++)
			a[left+k]=linshi[k];
	}
	static void guibing(int a[],int left,int right)
	{
		int mid=(left+right)/2;
		if (left>=right) {return;}
		else {guibing(a,left,mid);guibing(a,mid+1,right);hebing(a,left,mid,right);}
	}
}
