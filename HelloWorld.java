import java.util.Date;

class HelloWorld {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("Hello World");
		
		for(int i=0; i < args.length; i++)
		System.out.println(args[i]);
		
        System.out.println("Date: " + date);
    }
}
