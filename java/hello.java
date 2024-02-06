// class hello{
//     public static void main(String a[]){
//         System.out.print("hello worlasdd");
//     }
// }
public class hello{
    public static void main(String[] Args){
        // int myNum=5;
        // float myFloat=myNum;
        // System.out.println(myFloat + " "+"After implicit typecasting");
        greetMorning();
        greetMorning();
        greetHello("Shannu");
        add(88,99); 
        int num1=88;
        int num2=99;
        int sum=addition(88,99);
        System.out.println(sum);
    }   
    public static void greetMorning(){
        System.out.println("Good Morning!!!");
        // greetMorning(); --> infinite loop 
    }
    public static void greetHello(String name){
        System.out.println("Hello, "+name);
    }
    /*two parameter num1 and num2*/
    public static void add(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);
    }
    //return type int
    public static int addition(int num1,int num2){
        int result1=num1+num2;
        return result1;
    }
}