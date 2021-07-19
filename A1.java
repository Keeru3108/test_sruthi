/*1.Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1*/

class A1
{
	public static int start1(int []a1,int []a2)
	{
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==1)
			{
				count++;
			}
		}
		for(int j=0;j<a2.length;j++)
		{
			if(a2[j]==1)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int a1[]={1,2,3};
		int b1[]={1,3};
		int a2[]={7,2,3};
		int b2[]={1};
		int a3[]={1,2};
		int b3[]={};
		System.out.println(start1(a1,b1));
		System.out.println(start1(a2,b2));
		System.out.println(start1(a3,b3));
	}
}