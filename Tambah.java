import java.util.Scanner;

public class Tambah {
    public static void main(String[] args) {

        System.out.println("Selamat Datang di program saya");

        Scanner tambah_1 = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai_1 = Integer.valueOf(tambah_1.nextLine());

        Scanner tambah_2 = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai_2 = Integer.valueOf(tambah_2.nextLine());

        int tambah = nilai_1 + nilai_2;

        System.out.println("Hasil dari " + nilai_1 + " Ditambah " + nilai_2 + " adalah " + tambah);

        if (tambah == 60) {
            System.out.println("Wow nilainya enam puluh!!!!!");
        } else {

        }
    }

}
