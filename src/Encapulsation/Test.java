package Encapulsation;

class Test{
    public static void main(String[] args){
//creating instance of the encapsulated class
        Student s=new Student();
//setting value in the name member
        s.setName("vijay");
        s.setAge(20);
//getting value of the name member
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}