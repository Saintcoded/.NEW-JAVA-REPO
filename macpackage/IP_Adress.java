package macpackage;

import java.util.Arrays;
import java.util.Scanner;

public class IP_Adress {
	Integer a, b, c, d;


	boolean checkip(String ip) {
		boolean choice = false;

		String address[] = ip.split("\\.");

		String addr = Arrays.toString(address).replaceAll(",",".").replaceAll(" ", "");

		System.out.println("SEARCHING FOR IP ADDRESS:" + addr);

		if (address.length != 4)
			System.err.println("INVALID IP ADDRESS!");

		else {
			System.out.println("IP ADDRESS " + addr + " FOUND");
			choice = true;
		}

		System.out.println(choice);

		return choice;
	}

	public static void main(String[] args) {
		IP_Adress call = new IP_Adress();
		call.checkip("31.24.24.23");

	}

}
