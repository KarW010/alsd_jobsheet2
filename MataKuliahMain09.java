public class MataKuliahMain09 {
    public static void main(String[] args) {
        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMK = "SIB242004";
        mk1.nama = "Algoritma Dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.tambahJam(2);
        mk1.ubahSKS(3);
        mk1.tampilInformasi();

        MataKuliah09 mk2 = new MataKuliah09("SIB242005", "Praktikum Algoritma dan Struktur Data", 2, 6);
        mk2.tampilInformasi();
        mk2.kurangiJam(7);
        mk2.tampilInformasi();

    }
}