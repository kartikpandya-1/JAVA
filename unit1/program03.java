import java.util.Scanner;
public class PersonalInfo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yuor name :");
		String name = sc.nextLine();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.print("Enter your gender :");
		String gender = sc.next();
		System.out.println("\n--- Personal Information ---");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender :" + gender);
	}
}
