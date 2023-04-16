package macpackage;

import java.util.Arrays;

public class ipAdd {
	Integer a, b, c, d;

	boolean checkip(String ip) {
		boolean choice = false;

		String address[] = ip.split("\\.");
		a = Integer.parseInt(ip.split("\\.")[0]);
		b = Integer.parseInt(ip.split("\\.")[1]);
		c = Integer.parseInt(ip.split("\\.")[2]);
		d = Integer.parseInt(ip.split("\\.")[3]);

		System.out.println(Arrays.toString(address));

		if (a.toString().length() != 3 || b.toString().length() != 3 || c.toString().length() != 3
				|| d.toString().length() != 3 || address.length != 4)
			System.err.println("IP ADDRESS NOT FOUND!");

		else
			System.out.println("IP ADDRESS {" + ip + "} FOUND");
		choice = true;

		System.out.println(choice);

		return choice;
	}

	public static void main(String[] args) {
		IP_Adress call = new IP_Adress();
		call.checkip("31.24.24.14");

	}
}
