package Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterBufferWritter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good Afternoom", "Good night"};

        String path = "C:\\Users\\elisio.silva\\Downloads\\JavaCompleto2023UdemyNelioAlves\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //Se adicionar o true ele adiciona imformação, sem ele recria
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
