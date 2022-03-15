public class Triangle_Const {
    int side1;
    int side2;
    int side3;
    public Triangle_Const(int side1,int side2,int side3){
        this.side1=side1; //parameterized constructor
        this.side2=side2;
        this.side3=side3;
    }
    public static void main(String[] args){
        Triangle_Const tri= new Triangle_Const(3,4,5); // invoke parameterized constructor
        int s=(tri.side1+ tri.side2+ tri.side3)/3;
        double area=Math.sqrt(s*(s-tri.side1)*(s- tri.side2)*(s- tri.side3));
        System.out.println("area of triangle= "+area);
        int perimeter= tri.side1+ tri.side2+ tri.side3;
        System.out.println("perimeter of triangle= "+perimeter);
    }
}
