package utis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ArquivosUtis {

    public static String getPropriedade(String propriedade) throws IOException {
        Properties propriedades = new Properties();
        propriedades.load(Files.newInputStream(Paths.get("src/main/resources/application.propreties")));

        return propriedades.getProperty(propriedade);
    }
}
