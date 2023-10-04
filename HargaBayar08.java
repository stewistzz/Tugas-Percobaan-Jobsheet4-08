import java.util.Scanner;

public class HargaBayar08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merkBuku;
        int harga, jumlah,jmlHalBuku;
        double diskon, total, bayar, jmlDiskon;

        System.out.println("=====Selamat datang di toko Maju Mundur=====");

        System.out.print("Masukkan Merk Buku Anda = ");
        merkBuku = input.nextLine();
        System.out.print("jumlah halaman buku = ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan berapa banyak buku yang dibeli = ");
        jumlah = input.nextInt();
        System.out.print("Masukkan Harga Buku Anda = ");
        harga = input.nextInt();
        System.out.print("Diskon yang anda dapatkan adalah = ");
        diskon = input.nextDouble();

        total = harga * jumlah;
        jmlDiskon = total * diskon / 100;
        bayar = total - jmlDiskon;

        System.out.println("=====Tampilkan Barang Yang Anda Beli=====");

        System.out.println("Merk buku = " + merkBuku);
        System.out.println("Jumlah halaman buku = " + jmlHalBuku);
        System.out.println("Jumlah yang anda beli = " + jumlah);
        System.out.println("Harga total sebelum diskon = " + total);
        System.out.println("Jumlah diskon anda dapatkan adalah = " + jmlDiskon);
        System.out.println("Total yang dibayar setelah diskon = " + bayar + " rupiah ");
    }
}
