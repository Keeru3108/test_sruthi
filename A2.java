/*2.Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false*/

class A2
{
	public static boolean no23(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==2 || a[i]==3)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int a1[]={4,5};
		int a2[]={4,2};
		int a3[]={3,5};
		
		System.out.println(no23(a1));
		System.out.println(no23(a2));
		System.out.println(no23(a3));
	}
}