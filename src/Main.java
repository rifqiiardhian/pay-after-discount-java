import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runHarga();
    }

    private static void runHarga() {
        // define input variables
        int inPembelian, inDisc;

        // start program and define scanner input
        System.out.println("Perhitungan Diskon dan Harga Akhir Barang");
        Scanner input = new Scanner(System.in);

        // input harga pembelian
        System.out.print("Masukkan harga pembelian: ");
        inPembelian = input.nextInt();

        // input diskon
        System.out.print("Masukkan diskon (dalam persen): ");
        inDisc = input.nextInt();

        // get result data = harga bayar
        getResult(inPembelian, inDisc);
    }

    private static void getResult(int pembelian, double disc) {
        // define calculation and result variables
        double bayar, discount;
        String outPembelian, outBayar;

        // calculate harga bayar
        discount = disc / 100;
        bayar = pembelian - (pembelian * discount);

        // formatting to rupiah
        outPembelian = formatRupiah(pembelian);
        outBayar = formatRupiah((int)bayar);

        // printout hasil
        System.out.println("Hasil");
        System.out.println("Pembelian = Rp" +outPembelian);
        System.out.println("Discount = " +(int)disc+ "%");
        System.out.println("Harga Bayar = Rp" +outBayar);
    }

    private static String formatRupiah(int value) {
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(value);
    }
}