import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FadillaBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Barang> listBarang = new ArrayList<>();

        System.out.println("================= Data Barang Fadilla ================= ");

        System.out.print("Input jumlah data barang yang ingin dimasukkan: ");
        int countData = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < countData; i++) {
            System.out.print("\nInput nama barang: ");
            String namaBarang = scanner.nextLine();
            while (namaBarang.length() < 3 || namaBarang.length() > 20) {
                System.out.print("Nama barang harus antara 3-20 karakter, coba input lagi: ");
                namaBarang = scanner.nextLine();
            }

            System.out.print("Input quantity barang: ");
            int qtyBarang = scanner.nextInt();
            scanner.nextLine();
            while (qtyBarang < 1 || qtyBarang > 100) {
                System.out.print("Qty barang harus antara 1-100, coba input lagi: ");
                qtyBarang = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.print("Input berat barang (kg): ");
            double beratBarang = scanner.nextDouble();
            scanner.nextLine();
            while (beratBarang < 1 || beratBarang > 100) {
                System.out.print("Berat barang harus antara 1-100 (kg), coba input lagi: ");
                beratBarang = scanner.nextDouble();
                scanner.nextLine();
            }

            Barang newBarang = new Barang(namaBarang, qtyBarang, beratBarang);
            listBarang.add(newBarang);
        }

        System.out.println("\n========== List Data Barang ========== ");
        for (int i = 1; i <= listBarang.size(); i++) {
            System.out.println("\nBarang#" + i);
            System.out.println(listBarang.get(i - 1));
        }

        // lambda expression to calculate total weight of goods
        double totalBeratBarang = listBarang.stream().mapToDouble(b -> b.getQty() * b.getBerat()).sum();
        System.out.println("\nJumlah berat barang = " + totalBeratBarang + " kg");

    }
}
