package MethodOveriding;

class Vehicle{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}

class bike extends Vehicle {
    public static void main(String args[]){
        bike obj = new bike(){
            @Override
            void run() {

            }
        };
        obj.run();
    }
}