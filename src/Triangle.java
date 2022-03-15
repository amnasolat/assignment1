import java.lang.Math;
public class Triangle {
     int side1=3;
     int side2=4;
     int side3=5;
    public Triangle() {

    }
    public static void main(String[] args) {
        Triangle tri=new Triangle();
        int s=(tri.side1+ tri.side2+ tri.side3)/3;
        double area=Math.sqrt(s*(s-tri.side1)*(s- tri.side2)*(s- tri.side3));
        System.out.println("area of triangle= "+area);
        int perimeter= tri.side1+ tri.side2+ tri.side3;
        System.out.println("perimeter of triangle= "+perimeter);



    }
}

