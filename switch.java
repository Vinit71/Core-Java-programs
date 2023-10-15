class Day{
    public static void main(String st[]) {

        int dayNumber = 5;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
        }

        System.out.println("The day of the week is: " + dayName);

    }
}

/*
1. The switch statement helps the computer make decisions quickly, especially when there are lots of options.
2. It offers a clearer, more readable structure when a single variable or expression needs to be tested against multiple distinct values.
 */
