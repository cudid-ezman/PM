package Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Lagu Kun Anta");
        playlist.addSong("Lagu Ya Nabi Salam Alaika");

        playlist.displayPlaylist();
    }
}