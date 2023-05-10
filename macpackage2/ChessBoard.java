package macpackage2;

public class ChessBoard {

	ChessBoard() {
		for (int i = 0; i < 4; i++) {
			for (int l = 1; l <= 8; l++) {
				if (l % 2 == 0) {
					System.out.print("#");
				} else
					System.out.print(" ");
				if (l == 8) {
					System.out.print("\n");
				}
			}
			for (int k = 1; k <= 8; k++) {

				if (k % 2 >= 1) {
					System.out.print("#");
				} else
					System.out.print(" ");
				if (k == 8) {
					System.out.print("\n");
				}
			}
		}

	}

	public static void main(String[] args) {
		ChessBoard call = new ChessBoard();

	}
}
