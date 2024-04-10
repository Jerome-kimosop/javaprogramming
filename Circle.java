public class Circle {
    double radius;
    final static  double PI = 3.14;

    public Circle(double radius){
       this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius){
        newRadius = radius;
    }
    public double getArea(){
        double area= radius * radius * PI;
        return area;
    }
    public double getPerimeter(){
        double circum= 2 * radius * PI;
        return circum;
    }
    public static void main(String[]args){
        Circle circle1 = new Circle(7);

        System.out.println("The area of a circle 0f radius"+" "+circle1.getRadius()+" "+"is"+" "+circle1.getArea());
        System.out.println("The perimeter of a circle of radius "+" "+circle1.radius+" "+"is"+" "+circle1.getPerimeter());

        Circle circle2 = new Circle(35);

        System.out.println("The area of a circle of radius "+" "+circle2.radius+" "+"is"+" "+circle2.getArea());
        System.out.println("The perimeter of circle of radius "+" "+circle2.radius+" "+"is"+" "+circle2.getPerimeter());

    }
}
