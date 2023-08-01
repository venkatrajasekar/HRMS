class cell4{
    int price;
    String name;
    //creating a parameterized constructor
    cell4(int i,String n){
        price = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(price+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        cell4 s1= new cell4(111,"venkat");
        cell4 s2 = new cell4(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}