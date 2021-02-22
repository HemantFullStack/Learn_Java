package test;

public class Duplicate {

    int x;

    public static void main(String[] args) {     // args is a variable u can use anything else also

        System.out.println("new file ");
        Duplicate dd = new Duplicate(); // creating object of class duplicate

        for(String s : args){          // this is telling about how main function is taking argument
            System.out.println(s);
        }

        dd.play1(3);
        dd.play();
        Duplicate.play2(2,1);
        dd.x = 3;

    }


    private void play() {

    }

    private void play1(int x) {

    }

    private static void play2(int x,int y){

    }
}