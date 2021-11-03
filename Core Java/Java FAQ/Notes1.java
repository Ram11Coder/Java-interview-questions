package nareshit.notes;

/*Created 
 * 
 * This keyword to return current class Object
 * 
 * How many times we have written new keywords is not the factor to decide how many no of objects
 *  are going to created
 * 
 * Factor is how many times jvm encounter the new keyword 
 * 
 * Every time you call the method that supposed to return the current object then go for
 * return this keyword
 * */
class A extends Object {
	/*
	 * Duplicate objects are create.These duplicate obj is not at all suggestable in
	 * java application
	 */
	public A getRef() {
		A a = new A();
		return a;
	}

	public A getRef1() {
		return this;
	}
}

public class Notes1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println();

		System.out.println(a.getRef());
		System.out.println(a.getRef());
		System.out.println(a.getRef());
		System.out.println();
		System.out.println(a.getRef1());
		System.out.println(a.getRef1());
		System.out.println(a.getRef1());

	}
}
