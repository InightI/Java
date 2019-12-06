public class StringDemo {
    public static void immutableDemo() {
        String s = "hello";
        String t = s.toUpperCase();
        String r = s.substring(1, 3);
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);
        System.out.println(s == t);
        System.out.println(s == r);
    }

    public static void constantDemo() {
        String s = "hello";
        String r = "hello";
        System.out.println(s.equals(r));
        System.out.println(s == r);
    }

    public static void main(String[] args) {

    }
}
