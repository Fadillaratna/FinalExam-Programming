import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class FadillaLogistik {
    private static int counter = 1;

    private static String getCurrentDate() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("yyyyMMdd");
        return now.format(myformat);
    }

    private static String generateCode() {
        String dateNow = getCurrentDate();

        return dateNow + String.format("%05d", counter++);
    }

    public static void main(String[] args) {
        ArrayList<Pengiriman> pengirimanList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String inputLagi;

        System.out.println("====================== Fadilla Logistik ======================");

        do {
            System.out.print("\nMasukkan jarak tempuh (km): ");
            int jarak = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan alamat asal: ");
            String asal = scanner.nextLine();
            System.out.print("Masukkan alamat tujuan: ");
            String tujuan = scanner.nextLine();
            System.out.print("Masukkan waktu pengiriman (dd-MM-yyyy): ");
            String waktu = scanner.nextLine();

            Pengiriman pengiriman = new Pengiriman(generateCode(), jarak, asal, tujuan, waktu);
            pengirimanList.add(pengiriman);

            System.out.println("Apakah Anda ingin menambahkan data pengiriman lain? (ya/tidak)");
            inputLagi = scanner.nextLine();
        } while (inputLagi.equalsIgnoreCase("ya"));

        System.out.println("========== List Data Pengiriman ========== ");
        for (int i = 1; i <= pengirimanList.size(); i++) {
            System.out.println("\nData Pengiriman#" + i);
            System.out.println(pengirimanList.get(i - 1));
        }

        scanner.close();
    }
}
