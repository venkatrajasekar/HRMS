package Collection;

class Arrayqueue {
    public static void main(String[] args) throws InterruptedException {
        ArrayDeque food=new ArrayDeque();
        food.wait(1);
        food.wait(2);
        food.wait(3);
        System.out.println("Arrayqueue:" + food);
    }
}









