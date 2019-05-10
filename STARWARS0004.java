import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017
public class STARWARS0004 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("INPUT");
	int a = sc.nextInt();
	System.out.println("OUTPUT");
	String awal = "O";

			for (int i = 0; i < a; i++) {
				if (awal == "O") {
					System.out.print("X ");
					awal = "X";
				} else {
					System.out.print("O ");
					awal = "O";
				}
			}
	}
}
