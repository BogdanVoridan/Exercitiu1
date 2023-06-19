public class Main {
    public static void main(String[] args) {
        groceryStore hustonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        hustonStore.applesSoldYearly = 534;
        hustonStore.applesRetailPrice = 0.99;
        hustonStore.orangesSoldYearly = 429;
        hustonStore.orangesRetailPrice = 0.87;

        seattleStore.applesSoldYearly = 765;
        seattleStore.applesRetailPrice = 0.86;
        seattleStore.orangesSoldYearly = 842;
        seattleStore.orangesRetailPrice = 0.91;

        orlandoStore.applesSoldYearly = 402;
        orlandoStore.applesRetailPrice = 0.77;
        orlandoStore.orangesSoldYearly = 398;
        orlandoStore.orangesRetailPrice = 0.79;


        System.out.println("Huston Store");
        hustonStore.grossRevenue();
        System.out.println("\nSeattle Store");
        seattleStore.grossRevenue();
        System.out.println("\nOrlando Store");
        orlandoStore.grossRevenue();




    }
}