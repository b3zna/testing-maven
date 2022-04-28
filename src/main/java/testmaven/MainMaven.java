package testmaven;

import org.apache.commons.lang3.StringUtils;

public class MainMaven {

	public static void main(String[] args) {
		
		System.out.println("Sunt in Maven, elp!");
		
		String a = "b";
		System.out.println(a);
		a = StringUtils.capitalize(a);
		System.out.println(a);
	}

}
