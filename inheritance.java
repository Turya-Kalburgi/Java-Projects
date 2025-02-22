public class inheritance {
    public static void main(String args[]){
       //Fish shark = new Fish();
       //shark.eat();

       dog Mandalorian = new dog();
       Mandalorian.eat();
       Mandalorian.legs= 4;
       System.out.println(Mandalorian.legs);
    }
}
//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breate(){
        System.out.println("breathes");
    }

    class mammals extends Animal{
        int legs;
    }

    class dog extends mammals {
        String breed;
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims in water");
    }
}
