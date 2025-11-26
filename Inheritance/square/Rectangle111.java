public class Rectangle111 extends GeometricShape111 {
    protected double width;
    protected double height;

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if(width <= 0) throw new IllegalArgumentException("Width must be greater than or equal to 0");
        else this.width = width;
    }
    public void setHeight(double height){
        if(height <= 0) throw new IllegalArgumentException("Height must be greater than or equal to 0");
        else this.height = height;
    }

    @Override
    public double area(){
        return getHeight() * getWidth();
    }

    @Override
    public String toString(){
        return String.format("[Rectangle] %.2f / %.2f", width, height);
    }
}
