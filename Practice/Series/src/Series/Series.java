package Series;
import java.util.Scanner;
public class Series 
{
   public static void main(String args[]) {
	           Scanner sc = new Scanner (System.in);
	           int n =sc.nextInt();
	           NumberSeries.printSeries(n);
	           sc.close();
	   
	}
}