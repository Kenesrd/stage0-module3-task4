package school.mjc.stage0.module3.task4;

public class IntRepresentation {
    public static void main(String[] args) {
        int c = 99;
        int h = 104;
        int a = 97;
        int r = 114;

        String s = String.valueOf((char)c);
        s += String.valueOf((char)h);
        s += String.valueOf((char)a);
        s += String.valueOf((char)r);

        System.out.println(s);
    }
}
