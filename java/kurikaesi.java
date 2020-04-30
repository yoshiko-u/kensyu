public class WhileConvertToForTest{
       public static void main(String[] args) {
           for (int i = 0; i < 2; i++){
               System.out.println("i = " + i);
        
            } 
    }
}

public class doWhileTest{
    public static void main(String[]args) {
        do{
            System.out.println("hello");
        }while(true);
    }
}

public class BreakTest{
    public static void main(String[] args){
        for (int i = 1; i < 5; i++){
            System.out.println(i);
            if (i == 3){
                break;
            }
        }
    }
}

public class DoubleLoopBreakSample{
    public static void main (String[] args){
        for (int i = 0; i < 5; i++){
            System.out.prfintln();
        }
    }
}

public class ContinueTest{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (8 <i ){
                continue;
            }
            System.out.println(",");
        }
    }
}

public static void multiParameMethod(int a, int b){
    System.out.println(a*b)
}

public class MethodTest{
    public static void main(String[]args){
        int a = 10;
        mltiParameterMethod(a,20);
    }
    public static void multiParameterMethod(int a, int b){
        System.out.println(a*b);
    }
}

public classMethodTest{
    public static void main(String[]args){
        returnableValue();
    }
    public static void returnableValue(){
        int tmp = 100;
        return tmp;
    }
}

public static int returnableValue(){
    int tmp = 100;
    return tmp;
}

public class MethodTest{
    public static void main(String[] args){
        int val = returnableValue();
        System.out.println(val);
    }
    public static int returnableValue(){
        int tmp = 100;
        return tmp;
    }
}

