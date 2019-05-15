public class Wrap1 {

    public static void main(String[] args) {


        int num=10;
        String name="sankir";
        System.out.println("num and name as is :");
        System.out.println(num);
        System.out.println(name);


        Integer rollno=100;
        String s = rollno.toString();
        System.out.println("Rollno in string format and its length: ");
        System.out.println(s + "\n" + s.length());

        System.out.println();

        String value = "500";
        System.out.println("Value in integer format: ");
        int k = Integer.parseInt(value);
        System.out.println(k);
        System.out.println("Adding 25 to converted value");
        System.out.println((k + 25));


    }

}
