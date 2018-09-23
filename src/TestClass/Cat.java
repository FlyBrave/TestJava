package TestClass;

public class Cat implements Animal {
	public void eat() {
		System.out.println("Ã¨ÔÚ³Ô");
	}
	public void travel() {
		System.out.println("Ã¨ÔÚÍæ");
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.eat();
		cat.travel();
	}

}
