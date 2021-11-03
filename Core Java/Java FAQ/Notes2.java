package nareshit.notes;

/*
 * this -> Predefined non static variablee
 * 
 * Every java app has static and non static context(Place)
 * static -> free access area
 * Non static -> restricted and we need access (Ex: Obj)
 * 
 * How to address non static area
 * For every obj one user def identity is important called user def obj ref variable
 * 
 * */
class Java {
	private String room;

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Java checkObj() {
		return this;
	}
}

class DotNet {
	private String room;

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

}

class Andriod {
	private String room;

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

}

public class Notes2 {

	public static void reception() {
//Here we can not use this keyword to access non static area, so through user def obj ref var to access the objects
	
	}

	public static void main(String[] args) {
		Java j = new Java();
		j.setRoom("java");
		DotNet d = new DotNet();
		d.setRoom("Dotnet");
		Andriod and = new Andriod();
		and.setRoom("Andriod");
	}
}
