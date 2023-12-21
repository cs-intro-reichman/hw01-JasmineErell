import java.util.Random;
class GenThree {
    public static void main(String[] args) {
        Random rand = new Random();
    	int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[1]);
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int ran1 = rand.nextInt(max - min + 1) + min;
        int ran2 = rand.nextInt(max - min + 1) + min;
        int ran3 = rand.nextInt(max - min + 1) + min;
        System.out.println(ran1);
        System.out.println(ran2);
        System.out.println(ran3);
        int min1 = Math.min(ran1, ran2);
        int miniest = Math.min(min1, ran3);
        System.out.println("The minimal generated number was " + miniest);
    }
}