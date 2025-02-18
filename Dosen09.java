public class Dosen09 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println(" ");
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
        // if (status == true){
        //     System.out.println("Aktif");
        // } else {
        //     System.out.println("Tidak Aktif");
        // }
    }

    int hitungMasaKerja(int thnSkrg){
        thnSkrg -= tahunBergabung;
        System.out.println("Masa Kerja Dosen = " + thnSkrg + " Tahun");
        System.out.println(" ");
        return thnSkrg;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen09(){ 
    }

    public Dosen09(String id, String nm, boolean status, int tahun, String bidang){
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }
}