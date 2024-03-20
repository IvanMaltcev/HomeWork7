public class Main {
    public static void main(String[] args) {

        // Задача 1

        int deposit = 15000;
        int total = 0;
        int amountMonth = 1;
        while (total < 2_459_000) {
            total += deposit;
            System.out.println("Месяц " + amountMonth + ", сумма накоплений равна "
                    + total + " рублей.");
            amountMonth++;
        }

        // Задача 2

        int number = 1;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Задача 3

        int populationY = 12_000_000;
        int birthRateY = populationY / 1000 * 17;
        int mortalityY = populationY / 1000 * 8;
        int year = 1;

        while (year <= 10) {
            populationY = populationY + birthRateY - mortalityY;
            System.out.println("Год " + year + ", численность населения составляет "
                    + populationY);
            year++;
        }

        // Задача 4

        int depositAmount = 15000;
        int depositPercent = 7;
        int totalSum = 0;
        int month = 1;

        while (totalSum < 12_000_000) {
            totalSum = totalSum + (totalSum * depositPercent / 100) + depositAmount;
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + totalSum + " рублей.");
            month++;
        }

        // Задача 5

        totalSum = 0;
        month = 1;
        for (; totalSum < 12_000_000; month++) {
            totalSum = totalSum + (totalSum * depositPercent / 100) + depositAmount;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна "
                        + totalSum + " рублей.");
            }
        }

        // Задача 6

        totalSum = 0;
        month = 1;
        int depositTermInYears = 9;
        int depositTermInMonths = depositTermInYears * 12;

        while (month <= depositTermInMonths) {
            totalSum = totalSum + (totalSum * depositPercent / 100) + depositAmount;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна "
                        + totalSum + " рублей.");
            }
            month++;
        }

        // Задача 7

        int dataFirstFriday = 1;

        for (int day = 1; day <= 31; day++) {
            if (day == dataFirstFriday || (day - dataFirstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, "
                        + day + "-е число. Необходимо подготовить отчет!");
            }
        }

        // Задача 8

        int startYear = 0;
        int currentYear = 2024;

        do {
            startYear = startYear + 79;
            if (startYear >= (currentYear - 200)) {
                System.out.println(startYear);
            }
        } while (startYear <= currentYear);
    }
}