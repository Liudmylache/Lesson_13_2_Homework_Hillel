import java.util.Random;

public class Utils {
    final static String[] NAMES = {"Arsen", "Akim", "David", "Sten", "Joye", "Steven",
            "Alex", "Roman", "Stefan", "Christofer", "Olaf", "Oliver", "Ramy", "Oleg", "Michael"};
    final static String[] SURNAMES = {"Dvornytskiy", "Ostapenko", "Smith", "Barners", "Lee",
            "Usupov", "Usik", "Damydenko", "Bagdasarian", "Babuch", "Zelenskiy", "Svorydov", "Petrovskiy"};


    public static String generateName (String[] NAMES) {
        Random random = new Random();
        return (NAMES[random.nextInt(NAMES.length)]);
    }

    public static String generateSurname (String[] SURNAMES) {
        Random random = new Random();
        return (SURNAMES[random.nextInt(SURNAMES.length)]);
    }

    public static int generateAge() {
        // random for a range [5;40](years),
        // use formula Math.random()*(b-a))+a
        return (int) (Math.random() * 35 + 5);
    }

    public static String convertAgeToString(int age) {
        return String.valueOf(age);
    }

    public static int getHeight(int age) {
        if ((5 <= age) && (age <= 17)) {
            int a = age - 5;
            return (int) ((Math.random() * ((a) + 10)) + ((a) * 5 + 110));
        } else return (int) ((Math.random()*12)+168);
    }
    public static String convertHeightToString(int height) {
        return String.valueOf(height);
    }

    public static int getWeight(int age, int height) {
        if ((5 <= age) && (age <= 17)) {
            int a = age - 5;
            return (int) ((Math.random() * ((a) + 6)) + ((a) * 4 + 19));
        } else return (int) (((height-150) * 0.75 + (age-20)/4) + 50);
    }

    public static String convertWeightToString(int weight) {
        return String.valueOf(weight);
    }

}
