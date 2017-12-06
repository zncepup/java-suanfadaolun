package ttt;

import java.util.Scanner;

class max_sub_array{
	int left;
	int right;
	int sum;
}
public class Maxsubarray {
public static void main(String args[]) 
	{
	
	
//		Scanner sc= new Scanner(System.in);
//		int tmp = sc.nextInt();
		int temp[] = new int[] {1,2,-5,3,4,-1};        //对相关数列进行录入
		int top = 0,max = 0,begin = 1,last = 1,rebegin = 1;
//		for(int i = 0;i<temp.length;i++)        //数据录入
//		{
//			temp[i] = sc.nextInt();
//		}
		for(int j = 0 ; j < temp.length; j++)     //求最大值操作
		{
			top+=temp[j];
			
			if(top>max)
			{
				begin = rebegin;          //记录起始点，并实现起始点的更新与替换
				max = top;                  //子序列的最大值
				last = j+1;               //记录末尾点，随着数据的累和，向后逐渐更新
			}
			if(top < 0)
			{
				rebegin = j+2;
				top = 0;
			}
		}
		System.out.println("最大值="+max);
		System.out.println("起始位置="+begin+","+"终点位置="+last);
	}
	
max_sub_array maxsubarray(int[] a) {
	return null;
	
//	思想：将要进行的检测的数据录入到数组中。然后依次将数组中的数据相加求和，定义max变量，begin变量，top变量以及last变量。begin变量用于记录最大值子串的起始位置，那么一开始就应该是1。last变量用于记录子串的末尾位置，相应的一开始也应该为1。之后利用循环进行累和，top变量用于记录每次累和后的结果。如果当前累和的结果大于上一次累和的结果（top>max）那么最大值需要更新，起始位置不变，末尾位置向后变化（last = j+1）。如果当前累和的结果小于上一次累和的结果，则起始位置与末尾位置均不改变，但继续进行求和。当求和的结果小于0时（top<0），则需要重新进行累和，用rebegin变量记录下重新累和的起始位置。因为前边的和为负数，任何数与负数相加都会比本身小，没有意义。如果重新累和后的结果大于了之前的max那么最大值更新，起始位置则为rebegin记录的位置（begin = rebegin），对于末尾位置，当max得到更新时，last也得到了更新。
//			具体情况大致分为4种：
//			1.前一部分为最大值。   例如：数据为：1 2 -4 1  该组数据中最大值为3，起始位置为1，末尾位置为2。
//			2.后一部分为最大值。   例如：数据为：1 2 -4 4  该组数据中最大值4，起始位置为4，末尾位置为4。
//			3.中间部分为最大值。   例如：数据为：1 1 -3 5 4 -4 3   该组数据中最大值为9，起始位置为4，末尾位置为5。
//			4.全串为最大值。           例如：数据为： 1 5 -1 6 该组数据中最大值为11，起始位置为1，末尾位置为4。
	
}

}
