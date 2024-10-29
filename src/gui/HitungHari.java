/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author acer
 */
public class HitungHari {
    public String hitung(int year, String month){
        String res = "";
        int day = 0;
        if(month == "Februari"){
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                day = 29;
            }else{
                day = 28;
            }
        }else{
            if(month == "April" || month == "Juni" || month == "September" || month == "November"){
                day = 30;
            }else{
                day = 31;
            }
        }
        res = "Jumlah hari pada bulan " + month + " tahun " + year + " adalah " + day;
        return res;
    }
}
