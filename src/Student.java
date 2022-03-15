class Student {
   private String name;
    int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class test {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1= new Student();
        st.name="john";
        st1.name="Sam";
        st.roll_no=2;
        st1.roll_no=3;
        System.out.println("Student1 Name= "+st.name);
        System.out.println("Student2 Name= "+st1.name);
        System.out.println("Student1 roll_num= "+st.roll_no);
        System.out.println("Student2 roll_num= "+st1.roll_no);

    }
}
