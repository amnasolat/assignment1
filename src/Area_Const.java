import java.util.Scanner;

public class Area_Const {
    int length;
    int breadth;

    public Area_Const(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int returnedArea(int length, int breadth){
        int area= length*breadth;
        System.out.println("area= "+area);
        return area;
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("please Enter length: ");
        int length = myObj.nextInt();
        System.out.println("please Enter breadth: ");
        int breadth = myObj.nextInt();
        Area_Const obj=new Area_Const(length,breadth);
        obj.returnedArea(length,breadth);
    }
}
