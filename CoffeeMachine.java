package machine;
import java.util.Scanner;

public class CoffeeMachine {
        static Scanner scanner = new Scanner(System.in);
        final static int waterForEspresso = 250;
        final static int coffeeForEspresso = 16;
        final static int costOfEspresso = 4;
        final static int waterForLatte = 350;
        final static int milkForLatte = 75;
        final static int coffeeForLatte = 20;
        final static int costOfLatte = 7;
        final static int waterForCappuccino = 200;
        final static int milkForCappuccino = 100;
        final static int coffeeForCappuccino = 12;
        final static int costOfCappuccino = 6;
        static int machineHasMoney = 550;
        static int machineHasWater = 400;
        static int machineHasMilk = 540;
        static int machineHasCoffee = 120;
        static int machineHasCups = 9;
        static void buy () {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            String choiceOfDrink = scanner.next();
            switch (choiceOfDrink) {
                case "1":
                    if (machineHasWater >= waterForEspresso && machineHasCoffee >= coffeeForEspresso &&
                    machineHasCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineHasWater -= waterForEspresso;
                        machineHasCoffee -= coffeeForEspresso;
                        machineHasCups --;
                        machineHasMoney += costOfEspresso;
                    } else if (machineHasWater < waterForEspresso) {
                        System.out.println("Sorry, not enough water!");
                    } else if (machineHasCoffee < coffeeForEspresso) {
                        System.out.println("Sorry, not enough coffee!");
                    } else if (machineHasCups == 0) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    break;
                case "2":
                    if (machineHasWater >= waterForLatte && machineHasMilk >= milkForLatte &&
                            machineHasCoffee >= coffeeForLatte && machineHasCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineHasWater -= waterForLatte;
                        machineHasMilk -= milkForLatte;
                        machineHasCoffee -= coffeeForLatte;
                        machineHasCups --;
                        machineHasMoney += costOfLatte;
                    } else if (machineHasWater < waterForLatte) {
                        System.out.println("Sorry, not enough water!");
                    } else if (machineHasMilk < milkForLatte) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (machineHasCoffee < coffeeForLatte) {
                        System.out.println("Sorry, not enough coffee!");
                    } else if (machineHasCups == 0) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    break;
                case "3":
                    if (machineHasWater >= waterForCappuccino && machineHasMilk >= milkForCappuccino &&
                            machineHasCoffee >= coffeeForCappuccino && machineHasCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineHasWater -= waterForCappuccino;
                        machineHasMilk -= milkForCappuccino;
                        machineHasCoffee -= coffeeForCappuccino;
                        machineHasCups --;
                        machineHasMoney += costOfCappuccino;
                    } else if (machineHasWater < waterForCappuccino) {
                        System.out.println("Sorry, not enough water!");
                    } else if (machineHasMilk < milkForCappuccino) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (machineHasCoffee < coffeeForCappuccino) {
                        System.out.println("Sorry, not enough coffee!");
                    } else if (machineHasCups == 0) {
                        System.out.println("Sorry, not enough cups!");
                    }
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
        static void fill () {
            System.out.println("Write how many ml of water you want to add:");
            int water = scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            int milk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            int coffee = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add:");
            int cups = scanner.nextInt();
            machineHasWater += water;
            machineHasMilk += milk;
            machineHasCoffee += coffee;
            machineHasCups += cups;
        }
        static void take () {
            System.out.println("I gave you $" + machineHasMoney);
            machineHasMoney = 0;
        }
        static void remaining () {
            System.out.println(machineHasWater + " ml of water");
            System.out.println(machineHasMilk + " ml of milk");
            System.out.println(machineHasCoffee + " g of coffee beans");
            System.out.println(machineHasCups + " disposable cups");
            System.out.println("$" + machineHasMoney + " of money");
        }
    public static void main(String[] args) {
       String action = "0";
       while (!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            switch (action) {
                case "buy": buy(); break;
                case "fill": fill(); break;
                case "take": take(); break;
                case "remaining": remaining(); break;
                case "exit": break;
                default:
                    System.out.println("Error!");
                    break;
            }
       }
    }
}

