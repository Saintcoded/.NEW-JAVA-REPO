package macpackage;

import java.util.Arrays;
import java.util.Scanner;

public class IP_Adress {
	Integer a, b, c, d;

	boolean checkip(String ip) {
		boolean choice = false;

		String address[] = ip.split("\\.");
//		a = Integer.parseInt(ip.split("\\.")[0]);
//		b = Integer.parseInt(ip.split("\\.")[1]);
//		c = Integer.parseInt(ip.split("\\.")[2]);
//		d = Integer.parseInt(ip.split("\\.")[3]);
		
		System.out.println(Arrays.toString(address));

		if (address.length != 4)
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
