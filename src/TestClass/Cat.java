package TestClass;

public class Cat implements Animal {
	public void eat() {
		System.out.println("è�ڳ�");
	}
	public void travel() {
		System.out.println("è����");
	}
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.eat();
		cat.travel();
	}

}
