class NumberSquare9
{
 public static void main(String[] args)
 {
	int n=4,oddInc=7,evenInc=1;

	for(int i=1;i<=n;i++)
	{ int num=i;
	  for(int j=1;j<=n;j++)
	  {
		System.out.print(num+" ");

		if(j%2==1)
		num+=oddInc;
		else
		num+=evenInc;
	  }
	System.out.println();
	oddInc-=2;
	evenInc+=2;
	}
 }
}