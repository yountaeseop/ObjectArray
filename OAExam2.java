package Java2021_11_04_Class;

public class OAExam2 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
	    c1.name = "김짱구";
	    c1.age = 35;
	    c1.address = "대전";

	    Customer c2 = new Customer();
	    c2.name = "손흥민";
	    c2.age = 29;
	    c2.address = "런던";

	    Customer c3 = new Customer();
	    c3.name = "홍길동";
	    c3.age = 26;
	    c3.address = "서울";

	    Customer c4 = new Customer();
	    c4.name = "김서방";
	    c4.age = 44;
	    c4.address = "대전";
	    
	    Customer[] 회원들 = {c1, c2, c3, c4};
	    
	    Customer.print(회원들);
	    //1. 전체 회원 나이와 이름 출력
	    //2. 나이가 30세 미만인 사람의 이름 출력
	    //3. 대전 사는 사람들의 이름과 나이 출력
	    //4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)

	}

}


