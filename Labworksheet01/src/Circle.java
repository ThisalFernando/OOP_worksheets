public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
