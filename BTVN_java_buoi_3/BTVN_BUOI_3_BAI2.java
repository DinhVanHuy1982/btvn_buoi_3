/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_buoi_3_bai2;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BTVN_BUOI_3_BAI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //BAI 2
        Scanner input =new Scanner(System.in);
        System.out.println("BAI 2 \n Nhap chuoi can chuan hoa: ");
        String s = input.nextLine();
        s=s.toLowerCase();
        s=s.strip();
        s=s.replaceAll("\\s+"," ");
        
        String[] a=s.split(" ");
        s="";
        for(int i=0;i<a.length;i++)
        {
            s+=String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if(i<a.length-1) 
                s+=" ";   
        }
        s=s.replaceAll("[1234567890]", "");
        System.out.println(s);
    }
    
}
