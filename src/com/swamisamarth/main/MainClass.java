/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swamisamarth.main;

import com.swamisamarth.utils.LoadFont;

/**
 *
 * @author SUPRIYA
 */
public class MainClass {

    public static void main(String args[]) {
        LoadFont loadFont = new LoadFont();
        new FrmLogin().setVisible(true);
    }

}
