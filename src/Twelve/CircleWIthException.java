package Twelve;

public class CircleWIthException {
    private double radius;

    private static int numberOfObjects = 0;

    public CircleWIthException() {
        this(1.0);
    }

    public CircleWIthException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius)
            throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException(("Radius cannot be negative"));
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }

    public static void main(String[] args) {
        try {
            CircleWIthException c1 = new CircleWIthException(5);
            CircleWIthException c2 = new CircleWIthException(-5);
            CircleWIthException c3 = new CircleWIthException(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }

        System.out.println("Number os objects created: " + CircleWIthException.getNumberOfObjects());

    }
}


