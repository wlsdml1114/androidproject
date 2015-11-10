package com.example.jini.barcode;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jini on 2015-11-10.
 */
public class WaterCount {
    private String date;
    private int wateramount;
    public WaterCount(){
        GregorianCalendar g =(GregorianCalendar)GregorianCalendar.getInstance();
        date = g.get(Calendar.YEAR)+"/"+(g.get(Calendar.MONTH)+1)+"/"+g.get(Calendar.DATE);
        wateramount=0;
    }
    public String toSring(){
        return date;
    }
    public void drinking(int amout){wateramount+=amout;}
    public int get_amout(){return wateramount;}
}
