package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilitiesProp {

    public static Properties readconfigProperties(String filename) throws IOException {
        Properties returnProp = new Properties();
        returnProp.load(new FileInputStream(new File("C:/Users/Apurv/IdeaProjects/Selenium_28thDec/config/" + filename + ".properties")));
        return returnProp;
    }
}
