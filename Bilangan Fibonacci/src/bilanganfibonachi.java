import java.util.Scanner;
public class bilanganfibonachi {

	public static void main(String[] args) throws Exception {
		int batas, nilai_kedua, nilai_awal, fibonacci;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan banyak bilangan yang akan di tampilkan : ");
		batas = input.nextInt();
		nilai_awal = 1;
		nilai_kedua = 0;
		fibonacci = 0;
		
		for (int i = 0; i<= batas; i++) {
			System.out.print(nilai_kedua + ", ");
			fibonacci = nilai_awal + nilai_kedua;
			nilai_awal = nilai_kedua;
			nilai_kedua = fibonacci;
		}
	}

}
