new int[3];
int [] array = new int [3];
array[0] = 10;
array[1] = 20;
array[2] = 30;

public class ArrayTest{
    public static void main(String[] args){
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        for (int i = 0; i< 3; i++){
            int val = array[i];
            System.out.println(val);
        }
    }
}

public class MethodTest{
    public static void main(String[] args){
    }
    public static void sample() {

    }
}

public class MethodTest {
    public static void main(String[] args){
        System.out.println("A");
    }
    public static void sample() {
        System.out.println("B");
    }
}

public class NoEntryPointTest{
    public static void test() {
        System.out.println("test");
    }
    public static void sample() {
        System.out.println("sample");
    }
}

public class MethodTest{
    public static void sample() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        System.out.println("A");
        sample();
    }
}

public class MethodTest{
    public static void main(String[] args) {
        int a = 10;
        multiParameterMethod(a,20);
    }
    public static void multiParameterMethod(int a,int b) {
        System.out.println(a * b);
    }
}