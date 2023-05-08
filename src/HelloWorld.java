import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {




    }

    public static double circleArea(){
        final double PI = 3.14;
        int radius = 3;
        double area = PI*radius*radius;
        System.out.println("원의 면적은 "+area+"입니다.");
        return area;
    }

    public static void sample(){
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }

    public static void addthree(){
        int result = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {  // 3으로 나누어 떨어지는 수는 3의 배수
                result += i;
            }
            i += 1;
        }
        System.out.println(result);  // 166833 출력
    }
}
