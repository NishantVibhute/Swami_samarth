/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swamisamarth.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUPRIYA
 */
public class CommonUtil {

    public static String language;
    static Properties propEnglish = new Properties();
    static Properties propMarathi = new Properties();

    static {
        try {
            InputStream inputEnglish = new FileInputStream("src\\com\\swamisamarth\\properties\\labelEnglish.properties");
            propEnglish.load(inputEnglish);
            InputStream inputMarathi = new FileInputStream("src\\com\\swamisamarth\\properties\\labelMarathi.properties");
            propMarathi.load(inputMarathi);
        } catch (Exception ex) {
            Logger.getLogger(CommonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getResourceProperty(String name) {
        String value = null;
        try {

            if (getLanguage().equals("Marathi")) {
                value = propMarathi.getProperty(name);
            } else {
                value = propEnglish.getProperty(name);
            }

        } catch (Exception ex) {
            Logger.getLogger(CommonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        CommonUtil.language = language;
    }

}
