public class UserTwoRobots{
    public static void main(String[]args){
        Robot a = new Robot();
        a.name = "A";

        Robot b = new Robot();
        b.name = "B";


        a.sayHello();
        b.sayHello();
    }
}

public class Robot{
    private String name;
    public void sayHello(){
        System.out.println("Hi, I'm" + name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class ConstructorOverloadSample{
    public ConstructorOverloadSample(){
        System.out.println("default");
    }
    public ConstructorOverloadSample(String val){
        System.out.println(val);
    }
}

public class UseConstructorOverloadSample{
    public static void main(String[]args){
        new ConstructorOverloadSample();
        new ConstructorOverloadSample("Hello");
    }
}

public class staticSample{
    private static int count = 0;
    public staticSample(){
        count++;
    }
    public void Hello(){
        System.out.println("We are" + count);
    }
}

public class UseStaticSample{
    public static void main(String[] args){
        StaticSample a = new StaticSample();
        StaticSample b = new StaticSample();
        StaticSample c = new StaticSample();

        a.hello();
        b.hello();
        C.hello();
    }
}

public class StaticSample{
    private static int count = 0;
    private int myNo = 0;
    public StaticSample(int no){
        count++;
        this.myNo = no;
    }
    public void hello(){
        System.out.println("I'm" + myNo + "/" + count);
    }
}

public class UseStaticSample{
    public static void main(String[] args){
        StaticSample a = new StaticSample(1);
        StaticSample b = new StaticSample(2);
        StaticSample c = new StaticSample(3);

        a.hello();
        b.hello();
        c.hello();
    }
}