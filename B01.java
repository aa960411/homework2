import java.util.*;
class B01 {
	int age;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("INPUT YOUR BIRTH YEAR : ");
		int year = s.nextInt();
		this.age = 2016 - year + 1;
		
	}

	void print(){
		if (this.age >=20){
		System.out.println("ADULT");
		}
		else{
		System.out.println("NOT ADULT");
		}

	}

	public static void main (String[] s) {
		new B01().print();
		}




	   }
