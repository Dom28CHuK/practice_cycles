public class GalToLitTable {
    public void GalToLit(double selectNum) {
        double gallons;
        double liters;
        int counter;

        counter = 0;
        if (selectNum > 0) {
            for (gallons = selectNum; gallons <= selectNum; gallons++) {
                liters = gallons * 3.7854;
                System.out.println(gallons + " corresponds to gallons " + liters + " liters.");
                counter++;
                if (counter == 10) {
                    System.out.println();
                    counter = 0;
                }
            }
        } else {
            System.out.println("Cannot be applied...");
        }
    }
}
