
class animal {
    void eat(){System.out.println("eating...");}
}
class Dog extends tiger {
    static void bark(){System.out.println("barking...");}

    public static void play() {
    }
}
class BabyDog extends dog {
    void weep(){System.out.println("weeping...");}
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        Dog.play();
        Dog.bark();
        Dog.eat();
    }}