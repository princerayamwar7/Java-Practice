package Section4_Area_and_Parameter;

public class Example3_Circle {
    public static void main(String[] args)
    {
        int R = 30;                                 // radius

        double area = Math.PI * R * R;                // pi * r^2
        double parameter = 2 * Math.PI * R * R;      // 2 * pi * r^2

        System.out.println(area);
        System.out.println(parameter);


    }
}
