package nareshit.notes;

public class Notes3 {
	/**
	 * Implicit and explicit casting byte i(Destination data type) = 123(Source data
	 * type); if the Destination data type is greater than source data type then
	 * compiler cast it source to destination without any error Else throw compiler
	 * error
	 *
	 *
	 */
	public static void main(String[] args) {

		byte i = 123;
		int b = i;
		long a = 1000000l;
		int n = (int) a;
	}
}
