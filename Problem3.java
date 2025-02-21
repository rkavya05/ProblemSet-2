import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the FirstName");
		String FirstName = sc.next();
		System.out.println("enter the LastName");
		String LastName = sc.next();
		String FullName = FirstName + LastName;
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		for(int i=1;i<=n ;i++){
		    System.out.println(FullName);
		}
	}
}
