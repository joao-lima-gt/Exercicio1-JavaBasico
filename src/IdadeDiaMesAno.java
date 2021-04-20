
import java.util.Scanner;
public class IdadeDiaMesAno {
	public static void main(String[] args) {
		int anos, meses, dias;
		int idadeDiaMesAno;
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos:");
		anos = leitor.nextInt();
		System.out.println("Digite a idade em meses:");
		meses = leitor.nextInt();
		System.out.println("Digite sua idade em dias:");
		dias = leitor.nextInt();
		
		idadeDiaMesAno = (anos * 365) + (meses * 30) + dias;
		System.out.println("Idade em dias: " + idadeDiaMesAno);
	}

}
