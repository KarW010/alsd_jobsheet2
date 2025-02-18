public class Mahasiswa09 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        } else 
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        Mahasiswa09 mhs = new Mahasiswa09();
        mhs.nama = "Kartiko";
        mhs.nim = "244107060010";
        mhs.kelas = "SIB 1G";
        mhs.ipk = 3.5;
        mhs.tampilkanInformasi();
        mhs.updateIpk(5.0);
    }
}