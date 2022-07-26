/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_buoi_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BTVN_BUOI_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("BAI1 \n Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Nhap phan tu arr[%d] = ",i);
            arr[i]=input.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0 && arr[i]%2==1)
            {
                sum = sum + arr[i];
                count = count + 1;
            }
        }
        float tbc = (float)sum/(float)count;
        System.out.println("Trung binh cong cac so le o vi tri chan la: " + tbc);
        
        //VI TRI NHO NHAT
        int min = arr[0];
        for(int i = 1;i<n;i++)
        {
            if(min>arr[i])
            {    
                min=arr[i];
            }
        }
        System.out.print("Vi tri co gia tri nho nhat la: ");
        for(int i=0;i<n;i++)
        {
            if(arr[i] == min)
            {    System.out.print(i+", ");
            
            }
        }
        
        // SO CHINH PHUONG
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            double sq = Math.sqrt(arr[i]);
            if(sq - Math.floor(sq)==0){
                System.out.println(arr[i]+" la so chinh phuong");
            }
        }
        
        //SO NGUYEN TO
        System.out.print("So nguyen to co trong mang la: ");
        for(int i=0;i<n;i++)
        {
            int snt=0;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j == 0) snt=1;
            }
            if(snt==0) System.out.print(arr[i]+", ");
        }
        System.out.println("");
        
        //xap xep
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int tg=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tg;
                }
            }
        }
        System.out.print("Mang sau khi sap xep la: ");
        for(int i=0;i<n; i++)
        {
            System.out.printf(arr[i]+", ");
        }
        System.out.println("");
        
        
        
      
    }
    
}
