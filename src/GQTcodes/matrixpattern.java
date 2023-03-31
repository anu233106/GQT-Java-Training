package GQTcodes;


	import java.util.Scanner;
	public class matrixpattern {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of n :");
			/* 1 1 1 1 1
			 * 2  2  2  2  2  
			   3  3  3  3  3  
			   4  4  4  4  4  
			   5  5  5  5  5  
			 */
			
			int n=sc.nextInt();
			int count=1;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n; j++)
				{
					System.out.print(i+"  ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			
			
			/*  1  6  11  16  21  
				2  7  12  17  22  
				3  8  13  18  23  
				4  9  14  19  24  
				5  10  15  20  25 
			*/
			
			
		for(int i=1;i<=n;i++)
		{
			count=i;
			for(int j=1;j<=n; j++)
			{
				System.out.print(count+"  ");
				count=count+n;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*  25  24  23  22  21  
			20  19  18  17  16  
			15  14  13  12  11  
			10  9  8  7  6  
			5  4  3  2  1 
			*/
		
		
		count=n*n;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n; j++)
			{
				System.out.print(count+"  ");
				count--;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
	/*
	  * 1  6  11  16  21  
		2  7  12  17  22  
		3  8  13  18  23  
		4  9  14  19  24  
		5  10  15  20  25 
	 */
		for(int i=1;i<=n;i++)
		{
			count =i;
			
			for(int j=1;j<=n; j++)
			{
				System.out.print(count+"  ");
				count=count+n;;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/* 1  1  1  1  1  
		2  2  2  2  2  
		3  3  3  3  3  
		4  4  4  4  4  
		5  5  5  5  5  
		*/
				count=1;
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n; j++)
					{
						System.out.print(i+"  ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
				
				/*  1  6  11  16  21  
					2  7  12  17  22  
					3  8  13  18  23  
					4  9  14  19  24  
					5  10  15  20  25  
					*/
			for(int i=1;i<=n;i++)
			{
				count=i;
				for(int j=1;j<=n; j++)
				{
					System.out.print(count+"  ");
					count=count+n;
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			/* 25 24 23 22 21
			 * 20 19 18 17 16
			 * 15 14 13 12 11
			 * 10 9   8  7  6
			 * 5  4   3  2  1  
			 */
			count=n*n;
			for(int i=1;i<=n;i++)
			{
				
				for(int j=1;j<=n; j++)
				{
					System.out.print(count+"  ");
					count--;
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			/*
			 * $$$$$ #####
			 * $$$$$ #####
			 * $$$$$ #####
			 * $$$$$ #####
			 * $$$$$ #####
			 */
			for(int i=1;i<=n;i++)
			{
				
				for(int j=1;j<=n; j++)
				{
					System.out.print("$ ");
				}
				for(int j=1;j<=n; j++)
				{
					System.out.print("# ");
				}
				System.out.println();
			}	
			System.out.println();
			System.out.println();
			/* @
			 * @ @
			 * @ @ @
			 * @ @ @ @
			 * @ @ @ @
			 */
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i; j++)
				{
					System.out.print("@ ");
				}
				System.out.println();
			}	
			System.out.println();
			System.out.println();
			/*    * * * * *
			 *    * * * *
			 *    * * *
			 *    * *
			 *    *
			 */
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i; j--)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
			System.out.println();
			System.out.println();
			
		
			/*
			 * 1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 

			 */
			for(int i=1;i<=n;i++)
			{

				for(int j=1;j<=i;j++)
				{
					
					System.out.print(i+" ");
				}
				System.out.println();
		}
			System.out.println();
			System.out.println();
			
			/* 1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	*/
			
			for(int i=1;i<=n;i++)
			{

				for(int j=1;j<=i;j++)
				{
					
					System.out.print(j+" ");
				}
				System.out.println();
		}
			System.out.println();
			System.out.println();
			
			/*
			 * 1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 
			 */
			
			count=1;
			for(int i=1;i<=n;i++)
			{
				
				for(int j=1;j<=i;j++)
				{
					
					System.out.print(count+" ");
					count++;
				}
				System.out.println();
		}
			System.out.println();
			System.out.println();
			
			/*
			 * 	&  #  #  #  #  #  
				&  &  #  #  #  #  #  
				&  &  &  #  #  #  #  #  
				&  &  &  &  #  #  #  #  #  
				&  &  &  &  &  #  #  #  #  #
			 */
			
			
			for(int i=1;i<=5;i++)
			{
				
				for(int j=1;j<=i;j++)
				{
					
					System.out.print("&  ");

				}
				for(int j=1;j<=n;j++)
				{
					
					System.out.print("#  ");

				}
				
				System.out.println();
		}
			System.out.println();
			System.out.println();
			
			/*
			 *  &  &  &  &  &  #  #  #  #  #  
				&  &  &  &  #  #  #  #  #  
				&  &  &  #  #  #  #  #  
				&  &  #  #  #  #  #  
				&  #  #  #  #  # 
			 */
			
			for(int i=1;i<=5;i++)
			{
				
				for(int j=5;j>=i;j--)
				{
					
					System.out.print("&  ");

				}
				for(int j=1;j<=n;j++)
				{
					
					System.out.print("#  ");

				}
				
				System.out.println();
		}
			
			System.out.println();
			System.out.println();
			
			/*
			 *  &  &  &  &  &  #  #  #  #  #  @  
				&  &  &  &  #  #  #  #  #  @  @  
				&  &  &  #  #  #  #  #  @  @  @  
				&  &  #  #  #  #  #  @  @  @  @  
				&  #  #  #  #  #  @  @  @  @  @ 
			 */
			for(int i=1;i<=5;i++)
			{
				
				for(int j=5;j>=i;j--)
				{
					
					System.out.print("&  ");

				}
				for(int j=1;j<=n;j++)
				{
					
					System.out.print("#  ");

				}
				for(int j=1;j<=i;j++)
				{
					
					System.out.print("@  ");

				}
				
				
				
				System.out.println();
			
			
			}	
		}
	}



