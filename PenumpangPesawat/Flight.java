package PenumpangPesawat;

public class Flight {
    private Passenger head; 

    public Flight() {
        this.head = null; 
    }

   
    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger; 
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = newPassenger; 
        }
    }

    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next; 
            return;
        }

        Passenger current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next; 
                return;
            }
            current = current.next; 
        }

        System.out.println("Penumpang dengan nama " + name + " tidak ditemukan.");
    }

    public void displayPassengers() {
        Passenger current = head;
        if (current == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }
        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}