package macpackage2;

import java.util.Arrays;

public class ipAdd {
	Integer a;

	boolean checkip(String ip) {
		boolean choice = true;

		String address[] = ip.split("\\.");

		String addr = Arrays.toString(address).replaceAll(",", ".").replaceAll(" ", "");

		System.out.println("SEARCHING FOR IP ADDRESS:" + addr);
		int i = 0;

		while (i <= address.length - 1) {
			a = Integer.parseInt(address[i]);
			if (a.toString().length() <= 3 && address.length == 4)
				choice = true;
			
			i++;
			if (a.toString().length() > 3 || address.length != 4||a>255||a.toString().length()==0) {
				choice = false;
				break;
			}

		}

		if (choice == false || ip.endsWith("."))
			System.err.println("INVALID IP ADDRESS!");

		else if (choice == true)
			System.out.println("IP ADDRESS " + addr + " FOUND");

		return choice;

	}

	public static void main(String[] args) {
		ipAdd call = new ipAdd();
		call.checkip("..243.455");
		call.checkip("117.13.41.158");
		call.checkip("317.243.455.758");
//		System.out.println("MR JIDE SAID \"MR UDOKA CANT HELP/\\ ASSIST HIMSELF\"");
	}
}
