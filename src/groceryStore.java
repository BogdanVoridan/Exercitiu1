public class groceryStore {
    int applesSoldYearly;
    double applesRetailPrice;

    int orangesSoldYearly;
    double orangesRetailPrice;

    void grossRevenue (){
        double revenue;

        revenue = (applesSoldYearly * applesRetailPrice)
                + (orangesSoldYearly * orangesRetailPrice);
        System.out.println("Annual gross revenue is: " + revenue + "$");

    }
}
