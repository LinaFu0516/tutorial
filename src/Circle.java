import java.util.Scanner;
public class Circle {
	private double radius;

    
    		public void Radius(double radius) {
        this.radius = radius;
    		}
    
    		public double getRadius() {
        return radius;
    		}
    		public Circle(){
    			this.radius=0;
    			}
    		public Circle(double r) {
    			this.radius=r;
    		}
    		public double getArea(){
    			double r=this.radius;
    			return 3.14*r*r;
    		}
    		public double getPerimeter(){
    	        return 3.14*radius*2;
    	    	}
    		public void show() {
    			System.out.println("Please input radius:");
    			Scanner sc = new Scanner(System.in);
    			this.Radius(sc.nextInt());
    			System.out.println("area: "+this.getArea());
    			System.out.println("perimeter: "+this.getPerimeter());
    		}
}
