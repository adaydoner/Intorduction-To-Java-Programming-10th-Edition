package chapter11.samples;

public class TestDynamicBinding {
	public static void main(String[] args) {
		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		if(fruit instanceof Fruit){
			System.out.println("First statement is true");
		}
		if(fruit instanceof Orange){
			System.out.println("Second statement is true");
		}
		if(fruit instanceof Apple){
			System.out.println("Third statement is true");
		}
		if(fruit instanceof GoldenDelicious){
			System.out.println("Fourth statement is true");
		}
		if(fruit instanceof McIntosh){
			System.out.println("Fifth statement is true");
		}
		if(orange instanceof Orange){
			System.out.println("Sixth statement is true");
		}
		if(orange instanceof Fruit){
			System.out.println("Seventh statement is true");
		}
	}
}

class McIntosh extends Apple{
	McIntosh(){
	}
}

class GoldenDelicious extends Apple{
	GoldenDelicious(){
	}
}

class Orange extends Fruit{
	Orange(){
	}
	public void makeOrangeJuice(){
		System.out.println("orange");
	}
}

class Apple extends Fruit{
	Apple(){
	}
	public void makeAppleCider(){
		System.out.println("ivoked.");
	}
}

class Fruit {
	Fruit(){
	}
}
