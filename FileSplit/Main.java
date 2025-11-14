package FileSplit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileSplitter fileSplitter = new FileSplitter();

        System.out.print("Masukkan path file: ");
        String filePath = scanner.nextLine();
        System.out.print("Masukkan ukuran bagian (dalam karakter): ");
        int partSize = scanner.nextInt();

        fileSplitter.splitFile(filePath, partSize);

        fileSplitter.displayParts();

        scanner.close();
    }
}
