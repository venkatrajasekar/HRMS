class tiger {
    static void eat(){System.out.println("eating...");}
}
class Lion extends tiger {
}
class Cat extends tiger {
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
