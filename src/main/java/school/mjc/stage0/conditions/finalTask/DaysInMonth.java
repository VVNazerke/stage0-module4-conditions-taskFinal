package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        String result;

        if ((month >= 1 && month <= 12) && year > 0) {
            switch (year % 4) {
                case 0:
                    if (year % 100 == 0 && year % 400 == 0) {
                        result = "leap";
                    } else if (year % 100 != 0) {
                        result = "leap";
                    } else {
                        result = "not leap";
                    }
                    break;


                default:
                    result = "not leap";
            }
            if (result == "leap") {
                switch (month) {
                    case (4):
                    case (6):
                    case (9):
                    case (11):
                        System.out.println(30);
                        break;

                    case (1):
                    case (3):
                    case (5):
                    case (7):
                    case (8):
                    case (10):
                    case (12):
                        System.out.println(31);
                        break;

                    case (2):
                        System.out.println(29);
                        break;
                }
            } else {
                switch (month) {
                    case (4):
                    case (6):
                    case (9):
                    case (11):
                        System.out.println(30);
                        break;

                    case (1):
                    case (3):
                    case (5):
                    case (7):
                    case (8):
                    case (10):
                    case (12):
                        System.out.println(31);
                        break;

                    case (2):
                        System.out.println(28);
                        break;
                }
            }


        } else
            System.out.println("invalid date");


    }
}
