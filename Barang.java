public class Barang {
    private String nama;
    private int qty;
    private double berat;

    public Barang(String nama, int qty, double berat) {
        this.nama = nama;
        this.qty = qty;
        this.berat = berat;
    }

    public String getNama() {
        return nama;
    }

    public int getQty() {
        return qty;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + nama + "\nQuantity: " + qty + "\nBerat: "
                + berat + "kg";
    }
}