package PenumpangPesawat;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();


        flight.addPassenger("Ahmad");
        flight.addPassenger("Hadid");
        flight.addPassenger("Nailah");

        System.out.println("Daftar Penumpang:");
        flight.displayPassengers();

        flight.removePassenger("Nailah");

        System.out.println("Daftar Penumpang setelah penghapusan:");
        flight.displayPassengers();

        flight.removePassenger("Bayu"); 
    }
}