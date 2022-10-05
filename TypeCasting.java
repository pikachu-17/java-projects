public class TypeCasting {
    public static void main(String[] args) {
//for typecasting some conditions are needed
// the two datatypes must be compatible e.g. float and num
// the datatype in which you are converting should be greater than former. exception is narrowing conversion

// narrowing conversion example
//        int num = (int)(67.56);
//        System.out.println(num);
//        int a =257;
//        byte b =(byte) (a); // 257 % 256 = 1
//
//        System.out.println(b);
//
//        byte a =40;
//        byte b =50;
//        byte c=100;
//        int d = a*b/c; //byte is automatically promoted to int here by jvm
//        System.out.println(d);

        // but we cannot do something like
        // byte b = 50;
        // b = b * 2;
//
//        int number = 'a';
//        System.out.println(number);

        //java works on unicode so we can literally put any language inside our code.
        System.out.println("मोहित! hola, yo soy un chico.");

        byte b =42;
        char c ='a';
        short e =123;
        long d=45234854L;
        float f =4582.15f;
        double g =45815.265484;

         double sum =b*c-d+e/f*g;
        System.out.println(sum);

    }

}

