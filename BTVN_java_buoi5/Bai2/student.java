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
public class student {
    int id;
    String name;
    int age;
    address x = new address();
    Scanner input=new Scanner(System.in);
    
    public void nhap(){
        System.out.print("Nhap ID: ");
        id = input.nextInt();
        input.nextLine();
//        int check=1;
//        for(int i=0;i<n;i++){
//            if(id==a[i].id){
//                check=0;
//            }
//        }
//        while(check==0){
//            System.out.print("Nhap lai id: ");
//            for(int i=0;i<n;i++){
//                if(id==a[i].id){
//                    check=0;
//                }
//            }
//        }
        System.out.print("Nhap ten: ");
        name = input.nextLine();
        
        System.out.print("Nhap tuoi: ");
        age= input.nextInt();
        x.nhap();
    }
    public void xuat(){
        System.out.printf("%-10s%-10s%-10s",id,name,age);
        x.xuat();
    }
    public  void tim(student a[],int n){
        int search;
        System.out.print("Nhap ID can tim: ");
        search=input.nextInt();
        for(int i=0;i<n;i++){
            if(a[i].id==search){
                a[i].xuat();
            }
        }
    }
    public void update(student a[],int n){
        for(int i=0;i<n;i++){
            if(a[i].x.tinh == "Thanh Hoa"){
                a[i].x.tinh="Hai Phong";
            }
        }
    }
    public void xoa(student a[],int n,int k){
        for(int i=k;i<n-1;i++){
            a[i]=a[i+1];
        }
    }
    public void delete(student a[],int n){
        int xoaid;
        System.out.print("Nhap ID can xoa: ");
        xoaid=input.nextInt();
        for(int i=0;i<n;i++){
            if(a[i].id==xoaid){
                xoa(a,n,i);
                
            }
            i--;
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=2;
        student a[]=new student[n];
        for(int i=0;i<n;i++){
            a[i]=new student();
            a[i].nhap();
        }
        System.out.print("\t\tDANH SACH SINH VIEN VUA NHAP\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n","ID","Ten","Tuoi","ID","Huyen","Tinh");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
        //tim
        int search;
        System.out.print("Nhap ID can tim: ");
        search = input.nextInt();
        
        System.out.print("\t\tDANH SACH SINH VIEN CAN TIM\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n","ID","Ten","Tuoi","ID","Huyen","Tinh");
        for(int i=0;i<n;i++){
            if(a[i].id==search){
                a[i].xuat();
            }
        }
        
        //update
        for(int i=0;i<n;i++){
            if(a[i].x.tinh == "Thanh Hoa"){
                a[i].x.tinh = "Hai Phong";
            }
        }
        //xoa
        int xoaid;
        System.out.print("Nhap ID can xoa: ");
        xoaid=input.nextInt();
        for(int i=0;i<n;i++){
            if(a[i].id==xoaid){
                for(int j=i;j<n-1;j++){
                    a[j]=a[j+1];
                }
                i--;
                n--;   
            }
            
        }
        System.out.print("\t\tDANH SACH SINH VIEN SAU KHI XOA VA SUA\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n","ID","Ten","Tuoi","ID","Huyen","Tinh");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
        
    }
}
