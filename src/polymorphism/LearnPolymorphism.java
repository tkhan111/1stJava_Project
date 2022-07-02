package polymorphism;
//plymorphism means many forms
//in Java its many forms of methods!

//everything inside a class are variables and methods!
// a class is an outline of an object!
//every object has properties and things it can do, so we represent the properties as
//variables and methods.
//properties as variables and things it can do as methods
class Bird {
	public void sing() {
		System.out.println("tweet, tweet tweet");
	}
}

//we are using inheritance to create another bird
//extends means it already know how to sing from bird
//robin knows what is inside the bird class ( because we wrote extends)
//robin class know brids class sing method and its own class sing too
class Robin extends Bird {
	//string has parameters
	public void sing(String song) {
		System.out.println("twiddlededdee");
	}
}

	
public class LearnPolymorphism {

	public static void main(String[] args) {
		Robin b = new Robin();
		b.sing();

	}

}
