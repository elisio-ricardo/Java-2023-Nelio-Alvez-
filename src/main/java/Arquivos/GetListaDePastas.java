package Arquivos;

import java.io.File;
import java.util.Scanner;

public class GetListaDePastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); //tanto caminho de um arquivo quanto o caminho de uma pasta


        //imprime as pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //imprime os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        //criando um diretorio caso não exista
        boolean success = new File(strPath + "\\subDir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + success);


        sc.close();
    }
}
