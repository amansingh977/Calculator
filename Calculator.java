class Calculator 
{
public static void main(String[] args)
{
     System.out.println("This is calculator");
     add(123, 45);
     subtract(15, 5);
     multiply(11, 33);
}
public static void add(int a, int b) {
     System.out.println(a+b);
}
public static void subtract(int a, int b) {
          System.out.println(a-b);
}
public static void multiply(int a, int b) {
          System.out.println(a*b);
}
}