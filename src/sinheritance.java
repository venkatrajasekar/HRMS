
class Animal{
    void eat()
    {System.out.println("eating...");
    }
}
class dog extends tiger {
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        tiger tiger = new tiger();
        Dog.bark();
        Dog.eat();
    }}