public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea=Cylinder.getArea(radius);
        double perimeter=getPerimeter(radius);
        return perimeter * height + 2 * baseArea;

    }
    public static double getArea(int radius){
        return Math.PI * radius * radius;
    }
    public static double getPerimeter(int radius){
        return (2 * Math.PI  * radius);
    }
}
