package ch04;

public class Ch0409Ex9 {
    public static void main(String[] args) {
        Point3D pt = new Point3D();
        pt.x = 10;
        pt.y = 20;
        pt.z = 30;
        System.out.println("(" + pt.x + ", " + pt.y + ", " + pt.z + ")");
        pt.showPoint3D();
        pt.showPoint();
    }
}