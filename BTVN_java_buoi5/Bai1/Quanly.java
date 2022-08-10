/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phongmay;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Quanly {
    private String maql;
    private String hoten;
    Scanner input = new Scanner(System.in);

    public String getMaql() {
        return maql;
    }

    public String getHoten() {
        return hoten;
    }
    
    public void nhapx(){
        System.out.print("Nhap ma quan ly: ");
        maql = input.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = input.nextLine();
    }
    public void xuatx(){
        System.out.printf("%-10s%-10s",maql,hoten);
    }
}
