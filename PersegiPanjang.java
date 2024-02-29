import java.util.Scanner;

public class PersegiPanjang {

    public int panjang;
    public int lebar;

    public void cetakInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    public PersegiPanjang() {
    }

    public PersegiPanjang(int panjang, int lebar) {
        panjang = panjang;
        lebar = lebar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Masukkan panjang persegi panjang ke-" + (i + 1));
            int panjang = scanner.nextInt();

            System.out.println("Masukkan lebar persegi panjang ke-" + (i + 1));
            int lebar = scanner.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}
