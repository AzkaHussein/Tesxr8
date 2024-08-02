import java.util.Scanner;;

public class Azka {
    public static void main(String[] args) {
        String nama = "Azka";
        String kota = "Malang";
        int umur = 100;
        double angka_desimal = 100.00;
        float angka_float = 50.1f;
        char huruf_azka = 'a';
        boolean status_azka = true;

        System.out.println("nama: " + nama);
        System.out.println("asal: " + kota);
        System.out.println("umur: " + umur);
        System.out.println("angka unik: " + angka_desimal);
        System.out.println("angka dengan varib unik: " + angka_float);
        System.out.println("inisial: " + huruf_azka);
        System.out.println("hidup apa kaga: " + status_azka);

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter nama ");

        String nama_2 = obj.nextLine();
        System.out.print("Nama anda adalah ");
        System.out.println(nama_2);

        if (nama_2.equalsIgnoreCase("Rizza")) {
            System.out.println("Aku Rizzz yah");
        } else if (nama_2.equalsIgnoreCase("Azka")) {
            System.out.println("Azka ganteng bangethhh");
        } else {
            System.out.println("Yaudah gajadi rizz");
        }

        System.out.println("Dah lagii yoookk eksperimennnn, mari kita coba switch dengan pilihan varib yang fleksibel");

        Scanner hari = new Scanner(System.in);
        System.out.println("Masukkan dong nomor apa:  ");

        int harinya = Integer.valueOf(hari.nextLine());
        System.out.println("Ini adalah nilainya " + harinya);

        switch (harinya) {
            case 1:
                System.out.println("Azka");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Joget");
                break;
            case 4:
                System.out.println("Asik");
                break;
            default:
                System.out.println("Yahhh gajadii");
                break;
        }

        System.out.println("sementaraaa marih");

    }
}
