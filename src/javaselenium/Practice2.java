package javaselenium;

public class Practice2 {

	public static void main(String[] args) {

		/*
		 * for(int i=0;i<100;i++) { if(i%2==0) { System.out.print("even no.: "+ i); }
		 * else System.out.println(" odd no.: "+ i);
		 * 
		 * }
		 */
		//prime no. between 1-100
		/*int num = 100;
		int count;
		for (int i = 2; i <= num; i++) {
			count = 0;

			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(i);
			}
		}
		*/
		//fibonacci series
		/*int n1=0,n2=1,n3,i,count=13;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }
		 */
		//factors
		for(int i=2; i <= 100; i++) 
		{
			System.out.print("Factors of " + i + ": "); 
			for(int j = 2; j < i; j++)
			if((i%j) == 0) 
				System.out.print(j + " ");
			System.out.println();
			}

	}

}
