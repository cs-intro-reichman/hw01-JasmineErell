class Triangle {
    public static void main(String[] args) {
    	int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[1]);
	    int c = Integer.parseInt(args[2]);
        boolean d = ((a+b>c) && (a+c>b) && (c+b>a));
        System.out.println(a + "," + " " + b + "," + " " + c + ":" + d);
    }
}