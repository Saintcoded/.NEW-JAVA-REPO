package macpackages;

public class Gradin {

	public void grade(int score) {
		String grade;

		System.out.print("WHATS YOUR SCORE ? " + score + "\n");

		grade = score > 100 ? "YOU CANNOT BE TOO GREAT"
				: score == 100 ? "BOSS"
						: (score >= 70) ? "A1"
								: (score >= 65) ? "B2" 
										: (score >= 50) ? "C5" 
												: (score >= 30) ? "D4" 
														: "F9";

		System.out.println("YOUR GRADE IS " + grade);
	}

	public static void main(String[] args) {
		Gradin call = new Gradin();
		call.grade(123);

	}
}
