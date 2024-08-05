import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pengiriman {
    private String kodePengiriman;
    private int jarakTempuh;
    private String alamatAsal;
    private String alamatTujuan;
    private LocalDate waktuPengiriman;
    private int durasiPengiriman;
    private double hargaOngkir;

    public Pengiriman(String kodePengiriman, int jarakTempuh, String alamatAsal, String alamatTujuan,
            String waktuPengiriman) {
        this.kodePengiriman = kodePengiriman;
        this.jarakTempuh = jarakTempuh;
        this.alamatAsal = alamatAsal;
        this.alamatTujuan = alamatTujuan;
        this.waktuPengiriman = LocalDate.parse(waktuPengiriman, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.durasiPengiriman = hitungDurasiPengiriman(jarakTempuh);
        this.hargaOngkir = hitungHargaOngkir(jarakTempuh);
    }

    public int hitungDurasiPengiriman(int jarakTempuh) {
        return (int) Math.ceil((double) jarakTempuh / 60);
    }

    public double hitungHargaOngkir(int jarakTempuh) {
        int harga = ((int) Math.ceil((double) jarakTempuh / 10)) * 1000;
        return Math.max(harga, 6000);
    }

    public String getKodePengiriman() {
        return kodePengiriman;
    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public LocalDate getWaktuPengiriman() {
        return waktuPengiriman;
    }

    public int getDurasiPengiriman() {
        return durasiPengiriman;
    }

    public double getHargaOngkir() {
        return hargaOngkir;
    }

    @Override
    public String toString() {
        return "Kode Pengiriman: " + kodePengiriman + "\nJarak Tempuh: " + jarakTempuh + " km" + "\nAlamat Asal: "
                + alamatAsal
                + "\nAlamat Tujuan: " + alamatTujuan + "\nWaktu Pengiriman: " + waktuPengiriman
                + "\nDurasi Pengiriman: " + durasiPengiriman + " hari" + "\nHarga Ongkir: Rp" + hargaOngkir;
    }
}
