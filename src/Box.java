public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side)
    {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume()
    {
        return this.height * this.length * this.width;
    }

    public Box greaterVolume(Box otherBox)
    {
        if (this.volume() > otherBox.volume()) return this;
        else if (this.volume() < otherBox.volume()) return otherBox;
        else return null;
    }

    public String boxInfo()
    {
        return "Length: " + this.length + "\nWidth: " + this.width + "\nHeight: " + this.height;
    }

    public void addToShape(Shape s)
    {
        s.
    }
}
