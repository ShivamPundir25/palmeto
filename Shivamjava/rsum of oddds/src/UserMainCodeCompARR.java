
public class UserMainCodeCompARR {
	public static int sumElem(int []array1,int []array2)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(array1[i]==(array2[j]))
					sum=sum + array1[i];
			}
		}
		return sum;
	}
	

}
