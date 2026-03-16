class RefrigeratorExecuter {

    public static void main(String[] args) {

        Refrigerator.turnOn();
		
		System.out.println("Increasing Temparature");
        Refrigerator.increaseTemp();
        Refrigerator.increaseTemp();
		
		System.out.println("Decreasing Temparature");
        Refrigerator.decreaseTemp();

    }
}