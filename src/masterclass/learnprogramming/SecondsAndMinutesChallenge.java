package masterclass.learnprogramming;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(93030));
    }

    public static String getDurationString(long minutes, long seconds) {

        // Validation
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        String displayHours = hours + "h ";
        String displayMinutes = remainingMinutes + "m ";
        String displaySeconds = seconds + "s";
        if (hours < 10) {
            displayHours = "0" + hours + "h ";
        }
        if (remainingMinutes < 10) {
            displayMinutes = "0" + remainingMinutes + "m ";
        }
        if (seconds < 10) {
            displaySeconds = "0" + seconds + "s";
        }
        return displayHours + displayMinutes + displaySeconds;
    }

    public static String getDurationString(long seconds) {

        // Validation
        if (seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
