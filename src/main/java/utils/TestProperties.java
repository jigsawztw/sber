package utils;
import java.util.*;
import java.io.*;

/**
 * @author  Osipov Ivan, student
 */
public class TestProperties {
    private final java.util.Properties properties = new java.util.Properties();
    private static TestProperties INSTANCE = null;

    private TestProperties(){
        try {
            properties.load(new java.io.FileInputStream(new java.io.File("application.properties"))); //загружаем свойства из файла
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
    public static TestProperties getInstance(){
        if(INSTANCE==null){
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }
    public java.util.Properties getProperties(){
        return properties;
    }
}

