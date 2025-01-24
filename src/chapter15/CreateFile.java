package chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateFile {
    public static void main(String[] args) {
        Path path = Path.of("/home/holuwaphemmy/Desktop/java Algorithm/Java Algorithm/src/chapter15/Account.pdf");
        try{
//            path = Files.createFile(path);
             boolean result = Files.deleteIfExists(path);

//            System.out.println(path);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}


// using nio java streams for files

