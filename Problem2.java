import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		for(int i=x;i<=1000 ;i=i+x){
		    System.out.println(i);
		}
	}
}
