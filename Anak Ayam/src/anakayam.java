public class anakayam {

	public static void main(String[] args) {
		int anak_ayam;
		int mati;

		System.out.println("Anak ayam turun 10");
		for (anak_ayam = 10; anak_ayam >= 2; anak_ayam--) {
			mati = anak_ayam - 1;
			System.out.println("Anak ayam turun " + anak_ayam + " mati 1 tinggal " + mati);
		}
		System.out.println("Anak ayam turun 1 mati satu tinggal induknya.");
	}

}