package Circle;

public class CircleRunner {
    public static void main(String[] args){
        Circle Seb = new Circle(3);
        double circumference = Seb.getC();
        System.out.println("The circumference is" + circumference);
        Seb.changeR(1);
        double area = Seb.getArea();
        System.out.println("The area is " + area);
    }
}
