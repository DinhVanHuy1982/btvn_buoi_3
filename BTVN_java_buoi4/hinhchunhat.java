import java.util.Scanner;

public class hinhchunhat {
    private float chieudai;
    private float chieurong;

    public void nhap(){
        Scanner input =new Scanner(System.in);System.out.print("Nhap chieu dai cua hinhf chu nhat: ");
        chieudai = input.nextFloat();System.out.print("Nhap chieu rong cua hinhf chu nhat: ");
        chieurong = input.nextFloat();
    }

    public float getChieudai() {
        return chieudai;
    }

    public float getChieurong() {
        return chieurong;
    }

    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(float chieurong) {
        this.chieurong = chieurong;
    }

    public float cv(){

        return chieudai*2+chieurong*2;
    }
    public float dt(){

        return chieudai*chieurong;
    }


}
