public class statickeyword {
   public static void main(String args[]){
      s1.schoolName= "JMV";

      student s2 = new Student();
      System.out.println(s2.schoolName);
   } 
}
class Student {
    String name;
    int roll;

    static String schoolName;

    void setnName(String name){
        this.name= name;
    }
    String getName(){
        return this.name;
    }
}
