package macpackage2;

import java.util.Arrays;

public class ipAdd {
	Integer a;
//	String[] valid = { "1,2,3,4,5,6,7,8,9,0,." };

	boolean checkip(String ip) {
		boolean choice = true;

		String address[] = ip.split("\\.");

		String addr = Arrays.toString(address).replaceAll(",", ".").replaceAll(" ", "");

		System.out.println("SEARCHING FOR IP ADDRESS:" + addr);
		int i = 0;
//		String val[] = Arrays.toString(valid).split(",");

//		System.out.println(Arrays.toString(val));

		while (i <= address.length - 1) {
//			for (int t = 0; t < val.length; t++)
//				if (address[t] != val[t]) {
//					choice = false;
//					break;
//				}

			if (address[i].toString().equals("")) {
				choice = false;
				break;
			}
			a = Integer.parseInt(address[i]);
			if (a.toString().length() <= 3 && address.length == 4)
				choice = true;
			i++;
			if (a.toString().length() > 3 || address.length != 4 || a > 255 || a.toString().length() == 0||ip.endsWith(".")) {
				choice = false;
				break;
			}

		}

		if (choice == false || ip.endsWith("."))

		{
			System.err.println(choice);
			System.err.println("INVALID IP ADDRESS!\n");

		}

		else if (choice == true) {
			System.out.println(choice);
			System.out.println("IP ADDRESS " + addr + " FOUND\n");
		}

		return choice;

	}

	public static void main(String[] args) {
		ipAdd call = new ipAdd();
		call.checkip("k.l.243.455");// FALSE
		call.checkip("117.13.41.158");// TRUE
		call.checkip("317.243.455.758");// FALSE
//		System.out.println("MR JIDE SAID \"MR UDOKA CANT HELP/\\ ASSIST HIMSELF\"");
	}
}
