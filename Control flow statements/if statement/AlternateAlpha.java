class AlternateAlpha
{
 public static void main(String[] args)
 { int i=1;
	
	for(char c='A';c<='Z';c++)
	{ System.out.print(c+" ");
	   if(i%2==0)
	   { c++
	   }
	 i++;
	}
 }
}