package jul20;

public class Program1App 
{
	public void display1(int x)
	{ 
		System.out.print(" divisible by 2 is:\n");
		//To checking number is divisible by 2
		for(int i=1;i<=x;i++)
		{
		if(i%2==0)
		{
			System.out.print(i+" ");
			//System.out.print(i+" ");
		
		}
	}
	}
		public void display2(int y)
		{
			System.out.print("\n divisible by 3 is:\n");
			//To checking number is divisible by 3
			for(int i=1;i<=y;i++)
			{
			if(i%3==0)
			{
				System.out.print(i+" ");
			
			}
		
		}
		
}
		public void display3(int z)
		{
			System.out.print("\n divisible by 5 is:\n");
			//To checking number is divisible by 5
			for(int i=1;i<=z;i++)
			{
			if(i%5==0)
			{
				System.out.print(i+" ");
			
			}
		
		}
		
}
	public void display4(int p)
    {
		System.out.print("\n divisible by  2 and 5 is:\n");
		//To checking number is divisible by 2 and 5
	for(int i=1;i<=p;i++)
	{
	if(i%5==0 && i%2==0)
	{
		System.out.print(i+" ");
	
	}

}
    }
	public void display5(int q)
	{
		System.out.print("\n divisible by  3 and 5 is:\n");
		//To checking number is divisible by 3 and 5
		for(int i=1;i<=q;i++)
		{
		if(i%3==0 && i%5==0)
		{
			System.out.print(i+" ");
		
		}

	}
	}	
	public void display6(int r)
	{
		System.out.print("\n prime number is:\n");
		//To checking number is prime or not
		for(int i=1;i<=r;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
		      if(i%j==0)
		      {
		    	  count++;
		      }
			}
			if(count==1)
		       {
			System.out.print(i+" ");
		
		       }
			}

	    }
	
	public void display7(int s)
	{
		System.out.print("\n  Even and divisible by 3 is:\n");
		//To checking number is  even and divisible by 3
		for(int i=2;i<=s;i+=2)
		{
		if(i%3==0)
		{
			System.out.print(i+" ");
		
		}

	}
	}	
	public void display8(int t)
	{
		System.out.print("\n  odd and divisible by 5 is:\n");
		//To checking number is odd and divisible by 3
		for(int i=1;i<=t;i++)
		{
	     if(i%5==0 && i%2!=0)
		{
	    	 System.out.print(i+" ");
		}

	}
	}	
	public void display9(int u)
	{
		System.out.print("\n  Even and prime number is:\n");
		//To checking number is even prime 
		for(int i=1;i<=u;i++)
		{
			
			int count=0;
					for(int j=2;j<=i;j++)
					{
				      if(i%j==0 && i%2==0)
				      {
				    	  count++;
				      }
					}
					if(count==1)
				       {
					System.out.print(i+" ");
				
				       }
					}

			    }

	

	public void display10(int v)
	{
		System.out.print("\n  odd and prime number is:\n");
		//To checking number is odd prime 
		for(int i=1;i<=v;i+=2)
		{
				int count=0;
						for(int j=2;j<=i;j++)
						{
					      if(i%j==0 && i%2!=0)
					      {
					    	  count++;
					      }
						}
						if(count==1)
					       {
						System.out.print(i+" ");
					
					       }

	}
	}	

}

				


