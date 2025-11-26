public class Programddd {
    public static void main(String[] args) {
        Rectangleddd rectangle = new Rectangleddd();
        rectangle.setWidth(10);
        rectangle.setHeight(2);

        if (GeometricShapeddd.class.isAssignableFrom(Rectangleddd.class))
            System.out.println("Rectangle is a subclass of GeometricShape");
        else
            System.out.println("Rectangle is not a subclass of GeometricShape");

        System.out.printf("Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Height: %.2f\n", rectangle.getHeight());

        try {
            System.out.printf("Area: %f\n", rectangle.area());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
