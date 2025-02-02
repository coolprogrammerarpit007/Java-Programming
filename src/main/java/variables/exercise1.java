package variables;

public class exercise1 {
    public static void main(String[] args) {

        int a = 256;
        int b = 784;
//        System.out.println(a);
//        System.out.println(b);

        float c = 25;
        float d = 75;
        float sum = c + d;
//        System.out.println(sum);

        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2 + " !";
//        System.out.println(result);
        boolean bool = str1.equals(str2);
//        System.out.println(bool);
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.substring(1,4));
//        System.out.println(str1.startsWith("h".toUpperCase()));
//        System.out.println(str1.length());
//        System.out.println(str1.charAt(1));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for(int number : numbers)
//        {
//            System.out.println(number);
//        }

        long l = 123;
        int num = (int) l;
//        System.out.println(num);

        byte num2 = 23;
        char ch = (char) num2;
//        System.out.println(ch);
//        int num4 = ch;
//        System.out.println(num4);

        String[] fruits = {"apple","banana","orange","papaya"};
        System.out.println("Fruite: " + fruits[0]);
        System.out.println("Fruite: " + fruits[1]);
        System.out.println("Fruite: " + fruits[2]);
        System.out.println("Fruite: " + fruits[3]);
    }

}
