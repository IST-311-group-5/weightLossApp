/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author daltonream
 */
public class Logs {
    private String date = null;
    private static  ArrayList<String> content;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the content
     */
    public static ArrayList<String> getContent() {
        return content;
    }

    /**
     * @param aContent the content to set
     */
    public static void setContent(ArrayList<String> aContent) {
        content = aContent;
    }
}
