public class Main
{
    static void main()
    {
        Student student1 = new Student("George", 4, 280);
        System.out.println(student1 + "\n");

        Box b1 = new Box(10);
        Box b2 = new Box(20);
        Box b3 = new Box(10, 5, 20);

        Box greater = b1.greaterVolume(b2);
        System.out.println(greater == b2);
        greater = b2.greaterVolume(b1);
        System.out.println(greater == b2);
        greater = b1.greaterVolume(b3);
        System.out.println(greater == null);
        greater = b3.greaterVolume(b1);
        System.out.println((greater == null) + "\n");

        b1 = new Box(10);
        b2 = new Box(10, 5, 20);

        System.out.println(b1.boxInfo());
        System.out.println();
        System.out.println(b2.boxInfo() + "\n");

        Box b1 = new Box(10);
        Shape shape = new Shape();
        b1.addToShape(shape);
        Box shapeBox = shape.getBox();
        System.out.println(b1 == shapeBox);
        System.out.println(shapeBox.boxInfo());
        System.out.println();
        Box b2 = new Box(20, 30, 40);
        b2.addToShape(shape);
        shapeBox = shape.getBox();
        System.out.println(b2 == shapeBox);
        System.out.println(shapeBox.boxInfo());

    }
}
