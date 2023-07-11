package Series;

public class NumberSeries {
	public static void printSeries (int n) {

		int j = 2;

		for (int i = 1; i <= n; i++) {

		if (i == 1) {

             System.out.print(j + " ");
             } 
		       else if (i % 2 != 0) {

                   j = 2*j-1;

		     System.out.print(j + " ");
  
		} else {
                   j = 2*j+1;
                   
              System.out.print(j+" ");
		}
		
		}
	}

}
