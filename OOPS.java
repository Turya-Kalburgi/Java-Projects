
public class OOPS{

    public static void main(String args[]){
         pen p1 = new pen();// created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
       System.out.println(p1.gettip());


       
    }

}



class pen{
    String color;
    int tip;

    String getcolor(){
        return this.color;
    }


void setColor(String newColor){
    color = newColor;
}

void setTip(int newTip){
    tip = newTip;
}
}
class student{
    String name;
    int age;
    float percentage;//cgpa

    void CalPercentage( int phy, int chem, int math ){
        percentage = (phy + chem + math)/3;
    }
} 