package week1.day1;

public class Car {
	public void applybreak()
	{
		System.out.println("The brake is applied");
	}
	public void soundhorn() {
		System.out.println("sound horn");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applybreak();
	    obj.soundhorn();
	}
}
