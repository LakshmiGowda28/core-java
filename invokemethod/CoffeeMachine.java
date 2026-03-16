class CoffeeMachine {

    static int minLevel = 1;
    static int maxLevel = 5;
    static int currentLevel = 1;
    static boolean isCoffeeMachineOn;

    static void turnOn() {
        isCoffeeMachineOn = true;
        System.out.println("Coffee Machine is ON");
    }

    static void increaseLevel() {
        if(isCoffeeMachineOn) {
            if(currentLevel < maxLevel) {
                currentLevel++;
                System.out.println("Coffee Level : " + currentLevel);
            }
        } else {
            System.out.println("Turn ON the Coffee Machine first");
        }
    }

    static void decreaseLevel() {
        if(isCoffeeMachineOn) {
            if(currentLevel > minLevel) {
                currentLevel--;
                System.out.println("Coffee Level : " + currentLevel);
            }
        } else {
            System.out.println("Turn ON the Coffee Machine first");
        }
    }
}