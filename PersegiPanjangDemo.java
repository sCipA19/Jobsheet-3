import java.util.Scanner;

public class PersegiPanjangDemo {

    private Scanner sc = new Scanner(System.in);
    private PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

    public static void main(String[] args) {
        PersegiPanjangDemo demo = new PersegiPanjangDemo();
        demo.run();
    }

    private void run() {
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang();

            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}

class PersegiPanjang {

    public int panjang;
    public int lebar;

}