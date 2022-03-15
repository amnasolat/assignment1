import java.util.Scanner;
public class Area {
    int length;
    int breadth;


    public void SetDim(int length, int breadth){
        System.out.println("length= "+length);
        System.out.println("breadth= "+breadth);

    }
    public int getArea(int length,int breadth){
        int area= length*breadth;
        System.out.println("area= "+area);
        return area;
    }


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("please Enter length: ");
        int length = myObj.nextInt();
        System.out.println("please Enter breadth: ");
        int breadth=myObj.nextInt();
        Area obj=new Area();
        obj.SetDim(length,breadth);
        obj.getArea(length,breadth);


    }
}
