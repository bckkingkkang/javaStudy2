package sec01.exam08;

public class ClassExample {
	public static void main(String[] args) {
		
		// 객체없이 클래스 이름만 가지고 Class 객체를 얻는 첫번재 방법
		//Class clazz = Car.class;
		
		// 객체없이 클래스 이름만 가지고 Class 객체를 얻는 두번째 방법
		//Class clazz = Class.forName("sec0.exam08.Car");
		
		// 클래스로부터 객체가 이미 생성되어 있을 경우 Class 객체를 얻는 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		//System.out.println(clazz.getName());
		//System.out.println(clazz.getSimpleName());
		//System.out.println(clazz.getPackage().getName());
	}
}
