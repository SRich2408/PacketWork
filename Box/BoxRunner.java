package Box;
public class BoxRunner {
    public static void main(String[] args){  
        Box Seb = new Box(2.0, 6.0);
        double area = Seb.getArea();
        System.out.println("The area is " + area);
        Seb.bigger(2.0);
        double perimeter = Seb.getPerimeter();
        System.out.println("The perimeter is " + perimeter);
        
        
    }
}
