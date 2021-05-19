import java.util.Scanner;

public class M4_8constructor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.next();
        read.close();
        
        ScreenShot screenshot1 = new ScreenShot();
        ScreenShot screenshot2 = new ScreenShot(name);
        
        System.out.println("");
        System.out.println(screenshot1.getName());
        System.out.println(screenshot2.getName());
    }
}
 
class ScreenShot{
    private String name;
    
    ScreenShot(){
        name = "Screenshot";
    }
    
    ScreenShot(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;

    }
 }
 

