import jeliot.io.*;

public class MyClass {
    public static void main() {
    // Seif A
    int a = 16;
    int b = 6;
    int c = 8;
    //Seif B
    int d = 20;
    
        if(a > b&& a >c&& a>d )
       System.out.println (a);
       
       if (b > c && b>a&& b>d)
       System.out.println (b);
       
       if (c > a &&b>c&& b>d)
       System.out.println (c);
       
       if (d >a &&d>b&&d>c)
       System.out.println (d);
       // Seif - C
       if(a < b&& a <c&& a<d )
       System.out.println (a);
       
       if (b < c && b<a&& b<d)
       System.out.println (b);
       
       if (c < a &&c<b&& c<d)
       System.out.println (c);
       
       if (d <a &&d<b&&d<c)
       System.out.println (d);

    }
}