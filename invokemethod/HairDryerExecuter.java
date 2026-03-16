class HairDryerExecuter {

    public static void main(String[] args) {

        HairDryer.turnOn();
		
		System.out.println("Increasing Temparature");
        HairDryer.increaseTemp();
        HairDryer.increaseTemp();
		
		System.out.println("Decreasing Temparature");
        HairDryer.decreaseTemp();

    }
}