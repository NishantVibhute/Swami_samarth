/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swamisamarth.utils;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUPRIYA
 */
public class LoadFont {

    private static Font font;

    public LoadFont() {
        InputStream myStream = null;
        try {
            myStream = new BufferedInputStream(new FileInputStream("fonts\\Shivaji05.ttf"));
            Font f = Font.createFont(Font.TRUETYPE_FONT, myStream);
            this.setFont(f);
        } catch (Exception ex) {
            Logger.getLogger(LoadFont.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

}
