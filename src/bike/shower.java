package bike;

public class shower {
    public static void main(String[] args) {

        shower ss = new shower(); //creating object of shower class
        //ss.addition(2,6);
        System.out.println("addition first:-");
        System.out.println(ss.addition(2,6)); // ss.game is calling a game method and passing two argument
        System.out.println("subtracting now:-");
        System.out.println(ss.subtraction(8,4));
    }
    public int addition(int a,int b){ // a method/or function is to be created within the class itself but outside the mai

        int add;
        add=a+b;
        //System.out.println(add);
        return(add);
    }
    public int subtraction(int x,int y){
        int sub;
        sub=x-y;
        return(sub);
    }
}

