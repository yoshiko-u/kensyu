public class LedLight{
    private int status =0;
    public void lightUp(){
        if(status == 0){
            status = 1;
            System.out.println("light on !");
        }
    }
    public void lightDown(){
        if (status == 1){
            status = 0;
            System.out.println("light off !");
        }
    }
}

public class Robot{
    private String name;
    private LedLight light;
    public void sayHello(){
        System.out.println("Hi,I'm" + name);
        light.lightDown();
    }
    public void setLight(LedLight light){
        this.light =light;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
