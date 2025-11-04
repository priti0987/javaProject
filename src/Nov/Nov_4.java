package Nov;

public class Nov_4 {

    public static void main(String[] args) {
        //swap 2 numbers
        int a=10,b=20;
        System.out.println("Before = " + a +" "+ b);
    //logic 1 : third var

//        int temp;
//        temp =a;
//        a=b;
//        b=temp;
//        System.out.println("after = "+a+" "+b);

        //Logic 2 : use + and +

//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("after "+a+" "+b);

   //Using logic 3 = * and /

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("after "+a+" "+b);

    }
}
