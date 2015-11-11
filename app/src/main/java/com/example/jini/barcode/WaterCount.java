package com.example.jini.barcode;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jini on 2015-11-10.
 */
public class WaterCount {
    private int id;
    private String date;
    private int wateramount;
    public WaterCount(){
        GregorianCalendar g =(GregorianCalendar)GregorianCalendar.getInstance();
        date = g.get(Calendar.YEAR)+"/"+(g.get(Calendar.MONTH)+1)+"/"+g.get(Calendar.DATE);
        wateramount=0;
    }
    public WaterCount(int id, String date, int wateramount){
        this.id=id;
        this.date=date;
        this.wateramount = wateramount;
    }
    public WaterCount(String date, int wateramount){
        this.date=date;
        this.wateramount=wateramount;
    }
    public String toSring(){
        return date;
    }

    public void set_date(String date){this.date = date;}
    public String get_date(){return date;}
    public void set_amount(int amout){wateramount+=amout;}
    public int get_amount(){return wateramount;}
    public int get_id(){return id;}
    public void set_id(int id){this.id = id;}
}
