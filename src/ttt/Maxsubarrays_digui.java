package ttt;
class info{
	int left;
	int right;
	int sum;
}
public class Maxsubarrays_digui {
	public static void main(String args[]) {
		int a[]= {6,-5,1,2,3,4,-10,2};
		info res=max_sub_array(a,0,a.length-1);
		System.out.printf("%d%d%d",res.left,res.right,res.sum);
	}
	static info hebing(int a[],info left,info right,int left_index,int mid_index,int right_index) {
		int sum_left=0;
		int max_left=a[mid_index];
		int max_right=a[mid_index+1];
		int sum_right=0;
		int left_i=mid_index;
		int right_i=mid_index+1;
		for (int i=mid_index;i>=left_index;i--)
		{
			sum_left+=a[i];
			if (sum_left>max_left)
			{
				max_left=sum_left;
				left_i=i;
			}
		}
		for(int j=mid_index+1;j<=right_index;j++)
		{
			sum_right+=a[j];
			if(sum_right>max_right)
			{
				max_right=sum_right;
				right_i=j;
			}
		}
		int sum=max_left+max_right;
		info res=new info();
		if(sum>left.sum&sum>right.sum) {
			res.sum=sum;
			res.left=left_i;
			res.right=right_i;
		}
		else if(left.sum>=sum&left.sum>=right.sum) {
			res=left;
		}
		else {res=right;}
		return res;
		}
	static info max_sub_array(int a[],int begin,int end) {
		if(begin>=end) {
			info res=new info();
			res.left=end;
			res.right=end;
			res.sum=1;
			return res;
		}
		int mid=(begin+end)/2;
		return hebing(a,max_sub_array(a,begin,mid),max_sub_array(a,mid+1,end),begin,mid,end);
	}
}
