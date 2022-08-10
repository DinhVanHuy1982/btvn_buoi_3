/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class address {
    String id;
    String huyen;
    String tinh;
    Scanner input=new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ID: ");
        id = input.nextLine();
        System.out.print("Nhap huyen: ");
        huyen= input.nextLine();
        System.out.print("Nhap tinh: ");
        tinh= input.nextLine();
    }
    public void xuat(){
        System.out.printf("%-10s%-10s%-10s\n",id,huyen,tinh);
    }
    
}
