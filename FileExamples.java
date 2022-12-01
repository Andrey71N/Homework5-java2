package lesson5;

import java.io.File;
import java.io.IOException;

public class FileExamples {

    public static void main(String[] args) throws IOException {
        File file = new File("students");

        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.length());


        File filePatch = new File("12/1/2/3");
        filePatch.mkdirs();
        System.out.println(filePatch.length());

        File currentFolders = new File(".");
        for (File temp : currentFolders.listFiles()){

            System.out.println(temp.getName());
        }




    }
}
