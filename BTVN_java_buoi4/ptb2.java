import java.util.Scanner;

public class ptb2 {
    private float a,b,c;
    public void nhap(){
        Scanner input= new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = input.nextFloat();
        System.out.print("Nhap b = ");
        b = input.nextFloat();
        System.out.print("Nhap c = ");
        c = input.nextFloat();
    }
    public void tinh(){
        float denta = b*b -4*a*c;
        if(a==0){
            System.out.print("X = "+(-c/b));
        }
        else if(denta == 0){
            System.out.print("Phuong trinh co 1 nghiem duy nhat x =  "+(-b/(2*a)));

        }
        else if(denta >0){
            System.out.print("Phuong trinh co 2 nghiem \nx1 =  "+((-b+Math.sqrt(denta))/(2*a))+"\nx2 = "+((-b-Math.sqrt(denta))/(2*a)));
        }
        else{
            System.out.print("Phuong trinh vo nghiem");
        }
    }
    public static void main(String[] args){
        ptb2 pt2 = new ptb2();
        pt2.nhap();
        pt2.tinh();
    }

}
