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

