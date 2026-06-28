package Shape;
public class Shape
{
    public static void main (String[] args)
    {
        double pi, radius, circlePerimeter, circleArea, ballArea, ballVolume;
        radius = 10.0;
        pi = 3.142;

        circlePerimeter = 2.0 * pi * radius;
        circleArea = pi * radius * radius;
        ballArea = 4.0 * pi * radius * radius;
        ballVolume = 4.0 * pi * radius * radius * radius / 3.0;

        System.out.printf("\nCircle Perimeter : %.2f", circlePerimeter);
        System.out.printf("\nCircle Area : %.2f", circleArea);
        System.out.printf("\nBall Area : %.2f", ballArea);
        System.out.printf("\nBall Volume : %.2f", ballVolume);
    }
}
