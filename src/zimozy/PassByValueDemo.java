package zimozy;

public class PassByValueDemo {

	public static void main(String[] args) {

		temp t = new temp();
		t.name = "initial value";

		new PassByValueDemo().changeValue(t);

//		t.name = null;

		System.out.println(t.name);
	}

	public void changeValue(temp f) {
//		f.name = "changed value";
		f = null;
	}
}

class temp {
	String name;
}