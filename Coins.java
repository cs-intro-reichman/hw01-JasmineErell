class Coins {
    public static void main(String[] args) {
    	int Cnum = Integer.parseInt(args[0]);
        System.out.println("use" + " " + Cnum/25 + " " + "quarters and" + " " + Cnum%25 + " " +"cent");
    }
}