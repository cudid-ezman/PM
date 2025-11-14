package PenumpangPesawat;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        // Menambahkan penumpang
        flight.addPassenger("Ahmad");
        flight.addPassenger("Hadid");
        flight.addPassenger("Nailah");

        // Menampilkan semua penumpang
        System.out.println("Daftar Penumpang:");
        flight.displayPassengers();

        // Menghapus penumpang
        flight.removePassenger("Nailah");

        // Menampilkan semua penumpang setelah penghapusan
        System.out.println("Daftar Penumpang setelah penghapusan:");
        flight.displayPassengers();

        // Mencoba menghapus penumpang yang tidak ada
        flight.removePassenger("Bayu"); // Output: Penumpang dengan nama Samuel tidak ditemukan.jika kosong maka dia tidaK akan mencari.
    }
}