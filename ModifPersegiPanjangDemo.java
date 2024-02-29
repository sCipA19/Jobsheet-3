import java.util.Scanner;
public class ModifPersegiPanjangDemo {
   
private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjangDemo demo = new PersegiPanjangDemo();
    }

    private void run() {
        // Meminta user untuk memasukkan jumlah array
        System.out.print("Masukkan jumlah array: ");
        int jumlahArray = sc.nextInt();

        // Deklarasi array dengan panjang yang ditentukan user
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahArray];

        // Mengisi data array
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang();

            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }

        // Menampilkan data array
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}

class PersegiPanjang {

    public int panjang;
    public int lebar;

}

