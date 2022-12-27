public class TwelveDaysOfChristmas {

        private static int day;

        private static String numberOfDays;
        private static String firstVerse;
        private static String secondVerse;
        private static String thirdVerse;
        private static String fourthVerse;
        private static String fifthVerse;
        private static String sixthVerse;
        private static String seventhVerse;
        private static String eightVerse;
        private static String ninthVerse;
        private static String tenthVerse;
        private static String eleventhVerse;
        private static String twelfthVerse;
    public static String getFirstVerse() {
            firstVerse = "A partridge in a pear tree";
            return firstVerse;
        }
        public static String getSecondVerse() {
            secondVerse = "Two turtledoves";
            return secondVerse;
        }
        public static String getThirdVerse() {
            thirdVerse = "Three French hens";
            return thirdVerse;
        }
        public static String getFourthVerse() {
            fourthVerse = "Four calling birds";
            return fourthVerse;
        }
        public static String getFifthVerse() {
            fifthVerse = "Five gold rings (five golden rings)";
            return fifthVerse;
        }
        public static String getSixthVerse() {
            sixthVerse = "Six geese a-laying";
            return sixthVerse;
        }
        public static String getSeventhVerse() {
            seventhVerse = "Seven swans a-swimming";
            return seventhVerse;
        }
        public static String getEightVerse() {
            eightVerse = "Eight maids a-milking";
            return eightVerse;
        }
        public static String getNinthVerse() {
            ninthVerse = "Nine ladies dancing";
            return ninthVerse;
        }
        public static String getTenthVerse() {
            tenthVerse = "Ten lords a-leaping";
            return tenthVerse;
        }
        public static String getEleventhVerse() {
            eleventhVerse = "Eleven Pipers Piping";
            return eleventhVerse;
        }
        public static String getTwelfthVerse() {
            twelfthVerse = "Twelve drummers drumming";
            return twelfthVerse;
        }
        public void DaysOfChristmas(){
            int day = 1;
            while (day <= 12) {

                switch (day) {
                    case 1 -> numberOfDays = "first";
                    case 2 -> numberOfDays = "second";
                    case 3 -> numberOfDays = "third";
                    case 4 -> numberOfDays = "fourth";
                    case 5 -> numberOfDays = "fifth";
                    case 6 -> numberOfDays = "sixth";
                    case 7 -> numberOfDays = "seventh";
                    case 8 -> numberOfDays = "eight";
                    case 9 -> numberOfDays = "ninth";
                    case 10 -> numberOfDays = "tenth";
                    case 11 -> numberOfDays = "eleventh";
                    case 12 -> numberOfDays = "twelfth";
                }
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

