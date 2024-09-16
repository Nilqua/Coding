import java.util.ArrayList;

// class cat{
//     int b = 1;
//     int c;
//     cat(int in, int in2){
//         b = in;
//         c = in2;
//     }

//     void print(){
//         System.out.println("meow");
//     }

//     static void print2(int a){
//         System.out.println("how");
//         int t = a*2;
//         System.out.println(t);
//     }

// }

public class CPII {
    // static void print(){
    //     System.out.println("Im in main");
    // }
    // static void help() throws Exception {
    //     int[] b = new int[5];
    //     System.out.println(b[1]);
    //     System.out.println(b[6]);
    // }
    static String hello(int in){
        if (in == 1){
            return "Hello world";
        }
        return "Hello world\n" + hello(in-1);
    }
    public static void main(String[] args){
        System.out.println(CPII.hello(5));
        // try {
        //     CPII.help();
        // } catch (Exception e) {
        //     System.out.println("Error!");
        // }


        // int[] a = new int[10];
        // String b = " ";

        // try {
        //     System.out.println(a[6]);
        //     System.out.println(a[11]);
        //     System.out.println(b.charAt(5));
        //     System.out.println(a[7]);
        // } catch (ArrayIndexOutOfBoundsException ex) {
        //     System.out.println("Error! No data");
        //     ex.printStackTrace();
        // } catch (Exception ex) {
        //     System.out.println("Error!");
        //     System.out.println(ex);
        // } finally {
        //     System.out.println("Good bye");
        // }

        // System.out.println(a[9]);
        // String a = "ILoveComProII";
        // System.out.println(a.length());
        // System.out.println(a.substring(1,5));
        // System.out.println(a.substring(4,5));
        // String b = "notReally";
        // System.out.println(a.concat(b));
        // System.out.println(a + b);

        // ArrayList<Integer> a = new ArrayList<Integer>(5);
        // a.add(1);
        // a.add(4);
        // a.add(5);
        // a.add(4);
        // System.out.println(a);
        // a.remove(0);
        // System.out.println(a.toString());
        // a.remove((Object)4);
        // System.out.println(a.toString());

        // catmaw.add(n);
        // catmaw.get(0).print();
        // cat.print2(4);

        // CPII cp = new CPII();
        // cp.print();
        // print();


    }
}
