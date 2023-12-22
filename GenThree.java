import java.util.Random;
class GenThree {
    public static void main(String[] args) {
        Random rand = new Random();
    	int min = Integer.parseInt(args[0]);
	int max = Integer.parseInt(args[1]);
        int ran1 = ((int)(Math.random()*max) + min);
        int ran2 = ((int)(Math.random()*max) + min);
        int ran3 = ((int)(Math.random()*max) + min);
        System.out.println(ran1);
        System.out.println(ran2);
        System.out.println(ran3);
        int min1 = Math.min(ran1, ran2);
        int miniest = Math.min(min1, ran3);
        System.out.println("The minimal generated number was " + miniest);
    }
}