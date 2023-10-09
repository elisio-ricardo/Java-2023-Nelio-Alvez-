package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferReader {
    //Maneira muito trabalhosa

    public static void main(String[] args) {

        //Maneira muito trabalhosa para fechar o buffer é complexo

        String path = "C:\\Users\\elisio.silva\\Downloads\\JavaCompleto2023UdemyNelioAlves\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Maneira melhor que fecha sozinho o buffer

        String path2 = "C:\\Users\\elisio.silva\\Downloads\\JavaCompleto2023UdemyNelioAlves\\in.txt";
        try (BufferedReader br2 = new BufferedReader(new FileReader(path2))) {
            String line2 = br2.readLine();

            while (line2 != null) {
                System.out.println(line2);
                line2 = br2.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
