public class DosenMain09 {
    public static void main(String[] args){
        Dosen09 ds1 = new Dosen09();
        ds1.idDosen = "PYS";
        ds1.nama = "Pramana Yoga Saputra";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2011;
        ds1.bidangKeahlian = "Informatika";

        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.ubahKeahlian("Desain Grafis");
        ds1.hitungMasaKerja(2025);
        ds1.tampilInformasi();

        Dosen09 ds2 = new Dosen09("YWS", "Yan Watequlis Syaifudin", true, 2005, "Database");
        ds2.tampilInformasi();
        ds2.hitungMasaKerja(2025);
    }
}