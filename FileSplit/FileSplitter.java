package FileSplit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class FileSplitter {
    private Queue<String> parts;

    public FileSplitter() {
        parts = new LinkedList<>();
    }

    public void splitFile(String filePath, int partSize) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder currentPart = new StringBuilder();
            String line;
            int currentSize = 0;

            while ((line = br.readLine()) != null) {
                currentPart.append(line).append("\n");
                currentSize += line.length() + 1;

                if (currentSize >= partSize) {
                    parts.add(currentPart.toString());
                    currentPart.setLength(0);
                    currentSize = 0;
                }
            }

            if (currentPart.length() > 0) {
                parts.add(currentPart.toString());
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

    public void displayParts() {
        if (parts.isEmpty()) {
            System.out.println("Tidak ada bagian yang tersedia.");
            return;
        }

        System.out.println("Bagian-bagian file:");
        while (!parts.isEmpty()) {
            System.out.println(parts.poll());
        }
    }
}