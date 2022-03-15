public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getArea(){
        int area=length*breadth;

        return area;

    }
    public void display(){
        System.out.println("area= "+getArea());
    }
    public static void main(String[] args){
        Rectangle obj = new Rectangle(4,5);
        Rectangle obj1 = new Rectangle(5,8);


           obj.display();
           obj1.display();




    }
}
