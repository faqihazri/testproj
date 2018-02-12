public class ForLoop {
	public static void main(String[] args) {
		// String myVar = "Nothing"
		StringBuilder sb = new StringBuilder(args[0]);
		String constant = "studying";
		System.out.println("Given String :" + sb + "with length" + sb.length());
		System.out.println("First Three:" + sb.substring(0, 3));
		System.out.println("Given String:" + sb.substring((sb.length() - 3)));
		int startofconstant = sb.indexOf(constant);
		int endofconstant = startofconstant + constant.length();
		System.out.println("Given String:" + sb.substring(startofconstant, endofconstant));

		// Insert < space your name> after "am"
		sb.insert((sb.indexOf("am") + 2), "faqih");
		System.out.println("After Insert:" + sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am") + 2);
		System.out.println("After Delete:" + sb);
		System.out.println("Reverse:" + sb.reverse());

		StringBuilder sb2 = new StringBuilder(args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert((sb.indexOf("am") + 2), "faqih"));
		System.out.println(sb == sb3);

		sb = null;
		sb2 = null;
		sb3 = null;
		System.out.println("sb:" + sb);
		System.out.println("sb3" + sb3);

		/*
		 * for (int i= 1; i <= 10; ++i) { System.out.println ("sb at line " + i +
		 * "with value" + sb); sb.append("-" + i); }
		 */
	}
}
