public class Student
{
    private String name;
    private int tests;
    private int points;


    public Student(String name, int tests, int points)
    {
        this.name = name;
        this.tests = tests;
        this.points = points;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + "\nTests: " + tests + "\nPoints: " + points;
    }
}
