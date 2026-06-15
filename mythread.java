class example extends Thread{
    public void run(){
        System.out.println("My Thread");
    }
    
}

public class mythread{
    public static void main(String[] args){
        example t = new example();
        t.start();
    }
}