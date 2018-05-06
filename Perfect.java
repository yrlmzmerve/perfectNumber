public class Perfect {

	public void nPerfect (int val)
	{

		int arrAsal[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89};

		while(val!=-1)
		{
			double k=Math.pow (2.0 , (double) (arrAsal[val-1]-1) * Math.pow(2.0, (double)arrAsal[val-1]) -1);
			System.out.println(k);
			val--;
		}
	}

	public boolean isPerfect (int val)
	{
		int res = 0;
		for (int i = 0; i <val; i++)
		{
			if (val%i == 0 && i != val){
				res = res + i;
			}
		}
		if(res==val)
			return true;
		return false;
	}

}