import java.util.Scanner;

public class TwelveDaysOfChristmas {
    private static String numberOfDays;

    public static String getFirstVerse() {
        return "A partridge in a pear tree";
        }
        public static String getSecondVerse() {
            return "Two turtledoves";
        }
        public static String getThirdVerse() {
            return "Three French hens";
        }
        public static String getFourthVerse() {
            return "Four calling birds";
        }
        public static String getFifthVerse() {
            return "Five gold rings (five golden rings)";
        }
        public static String getSixthVerse() {
            return "Six geese a-laying";
        }
        public static String getSeventhVerse() {
            return "Seven swans a-swimming";
        }
        public static String getEightVerse() {
            return "Eight maids a-milking";
        }
        public static String getNinthVerse() {
            return "Nine ladies dancing";
        }
        public static String getTenthVerse() {
            return "Ten lords a-leaping";
        }
        public static String getEleventhVerse() {
            return "Eleven Pipers Piping";
        }
        public static String getTwelfthVerse() {
            return "Twelve drummers drumming";
        }
        public void DaysOfChristmas(){

        int day = 1;
            while (day <= 12) {

                switch (day) {
                    case 1: numberOfDays = "first";
                    break;
                    case 2: numberOfDays = "second";
                    break;
                    case 3: numberOfDays = "third";
                    break;
                    case 4: numberOfDays = "fourth";
                    break;
                    case 5: numberOfDays = "fifth";
                    break;
                    case 6 : numberOfDays = "sixth";
                    break;
                    case 7: numberOfDays = "seventh";
                    break;
                    case 8 : numberOfDays = "eight";
                    break;
                    case 9 : numberOfDays = "ninth";
                    break;
                    case 10 : numberOfDays = "tenth";
                    break;
                    case 11: numberOfDays = "eleventh";
                    break;
                    case 12: numberOfDays = "twelfth";
                    break;
                }

                System.out.println("\n"+"Enter a day of Christmas between 1 - 12");

                Scanner scanner = new Scanner(System.in);

                day = scanner.nextInt();

                System.out.println("\n"+"On the " + numberOfDays + " day of Christmas my true love gave to me :");

                switch(day) {
                    case 12:
                        System.out.println(TwelveDaysOfChristmas.getTwelfthVerse());
                    case 11:
                        System.out.println(TwelveDaysOfChristmas.getEleventhVerse());
                    case 10:
                        System.out.println(TwelveDaysOfChristmas.getTenthVerse());
                    case 9:
                        System.out.println(TwelveDaysOfChristmas.getNinthVerse());
                    case 8:
                        System.out.println(TwelveDaysOfChristmas.getEightVerse());
                    case 7:
                        System.out.println(TwelveDaysOfChristmas.getSeventhVerse());
                    case 6:
                        System.out.println(TwelveDaysOfChristmas.getSixthVerse());
                    case 5:
                        System.out.println(TwelveDaysOfChristmas.getFifthVerse());
                    case 4:
                        System.out.println(TwelveDaysOfChristmas.getFourthVerse());
                    case 3:
                        System.out.println(TwelveDaysOfChristmas.getThirdVerse());
                    case 2:
                        System.out.println(TwelveDaysOfChristmas.getSecondVerse());
                    case 1:
                        System.out.println(TwelveDaysOfChristmas.getFirstVerse());
                }
                day++;
            }
        }

    }

