import java.util.*;
public class Main{
  static int ways(int n){
  	if(n==1){
    	return 1;
    }
    if(n==2){
    	return 2;
    }
    return ways(n-1)+ways(n-2);
  }
	public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      System.out.println(ways(n));
    }
}