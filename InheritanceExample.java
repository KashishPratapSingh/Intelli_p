import java.util.*;
class HandlinDoubleException extends Exception{
    public String toString(){
        return "You must enter value in Integer not in float";
    }
}
class Rectangle {
    int length;
    int breadth;

    Rectangle(int a, int b){
        this.length=a;
        this.breadth=b;
    }
    Rectangle(){

    }

    public double area(){
        return length*breadth;
    }
    public void display(){
        double a=12;
        double b=23;
        System.out.println(STR."Area of rectangle is \{area()}");
    }
}
class Square extends Rectangle{
    int side;

    public Square(int a){
        this.side=a;
    }

    public void display(){
        double a=10;
        System.out.println(STR."Area of square is \{area()}");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        try {
            int a = scn.nextInt();
            int b = scn.nextInt();
            Rectangle r = new Rectangle(a, b);
            r.display();
            Square s = new Square(a);
            s.display();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
