package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Utility {

    public static String readFile(final String day, final String fileName) throws IOException {
        final Path filePath = Path.of("src/" + day + "/" + fileName + ".txt");

        return Files.readString(filePath);
    }
}
