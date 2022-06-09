import java.nio.charset.IllegalCharsetNameException;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte apples = 127;
        short oranges = 128;
        int pears = 130;
        long pineapples = 1200L;
        float watermelon = 1.5f;
        double melon = 2.5;

        //Задание 2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeight);
        float difference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов " + difference + " кг.");

        //Задание 3
        int bananas = 5;
        int weightBanana = 80;
        int milkMillilitres = 200;
        int totalWeightMilk = 105;
        int weightMillilitresMilk = 100;
        int iceCream = 2;
        int weightIceCream = 100;
        int egg = 4;
        int weightEgg = 70;
        int weightProducts = (bananas * weightBanana) + (milkMillilitres * totalWeightMilk / weightMillilitresMilk) + (iceCream * weightIceCream) + (egg * weightEgg);
        double kilogram = 1000;
        double weightInKilogram = weightProducts / kilogram;
        System.out.println("Вес спорт-завтрака " + weightProducts + " гр или " + weightInKilogram + " кг!");

        //Задание 4
        int purpose = 7;
        int gramsInKilo = 1000;
        int weightGram = purpose * gramsInKilo;
        int minLoseWeight = 250;
        int maxLoseWeight = 500;
        int minDay = weightGram / minLoseWeight;
        int maxDay = weightGram / maxLoseWeight;
        System.out.println("Если спортсмен будет худеть по 250 грамм в день понадобится " + minDay + " дней.");
        System.out.println("А если спортсмен будет худеть по 500 грамм в день то уйдет " + maxDay + " дней.");
        double averageDays = (minDay + maxDay) /(2 * 1.0);
        System.out.println("В среднем может потребоваться " + averageDays + " день для похудения.");

        //Задание 5
        int MashaYearSalary = 67760 * 12;
        int DenisYearSalary = 83690 * 12;
        int KristinaYearSalary = 76230 * 12;
        int MashaAugmentedPay = MashaYearSalary * 10 / 100;
        int DenisAugmentedPay = DenisYearSalary * 10 / 100;
        int KristinaAugmentedPay = KristinaYearSalary * 10 / 100;
        int MashaAugmentedSalary = MashaYearSalary + MashaAugmentedPay;
        int DenisAugmentedSalary = DenisYearSalary + DenisAugmentedPay;
        int KristinaAugmentedSalary = KristinaYearSalary + KristinaAugmentedPay;
        int MashaDivergence = MashaAugmentedSalary - MashaYearSalary;
        int DenisDivergence = DenisAugmentedSalary - DenisYearSalary;
        int KristinaDivergence = KristinaAugmentedSalary - KristinaYearSalary;
        System.out.println("Маша теперь получает " + MashaAugmentedSalary + " рублей. Годовой доход вырос на " + MashaDivergence + " рублей.");
        System.out.println("Денис теперь получает " + DenisAugmentedSalary + " рублей. Годовой доход вырос на " + DenisDivergence + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaAugmentedSalary + " рублей. Годовой доход вырос на " + KristinaDivergence + " рублей.");













    }
}