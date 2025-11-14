package Playlist;

class Playlist {
    private Song head;

   
    public Playlist() {
        this.head = null; 
    }

   
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = newSong;
        }
    }

   
    public void displayPlaylist() {
        Song current = head;
        if (current == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        while (current != null) {
            System.out.print(current.title + " -> ");
            current = current.next; 
        }
        System.out.println("Habis");
    }
}
