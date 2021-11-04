package Java2021_11_04_Class;

public class Customer {

	String name;
    int age;
    String address;
	public static void print(Customer[] 회원) {
		for(int i = 0; i < 4; i++) {
			System.out.println(회원[i].name);
			System.out.println(회원[i].age);
			
		}
		
	}
	
}
