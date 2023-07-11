package com.mert.utilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.reader");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("something happened in configuration reader class");
            e.printStackTrace();

        }
    }
  public static String getProperty(String keyword){
        return  properties.getProperty(keyword);
  }

}
