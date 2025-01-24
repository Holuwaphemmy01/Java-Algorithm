package chapter15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePath {
    public static void main(String[] args) {
        String fileLocation = "a/b/c";

        Path filePath = Paths.get(fileLocation);
        System.out.println(filePath.getFileSystem());
    }
}
