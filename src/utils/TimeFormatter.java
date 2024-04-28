package utils;
/*
 * TimeFormatter class to format the time
 * @param dayOfWeek: The day of the week
 * @param day: The day of the month
 * @param month: The month
 * @param year: The year
 * @param time: The time
 * @param timezone: The timezone
 * @method TimeFormatter: Constructor with parameters
 * @method formatFullDate: Format the full date
 * @method getMonthNumber: Get the month number
 * @method getDayOfWeekInPT: Get the day of the week in Portuguese
 * @return The formatted date
 */

public class TimeFormatter {
    // Variables
    private String dayOfWeek, day, month, year, time, timezone = "GMT ";

    // Input model: "Fri, 27 Mar 2020 00:00:00 +0000"
    public TimeFormatter(String date) {
        this.dayOfWeek = date.substring(0, 3);
        this.day = date.substring(5, 7);
        this.month = date.substring(8, 11);
        this.year = date.substring(12, 16);
        this.time = date.substring(17, 25);
        this.timezone += date.substring(26, 31)
    }

    // Output model: "Sexta-feira, 27/03/2020, 00:00:00 - GMT +00000"
    public String formatFullDate() {
        return getDayOfWeekInPT(dayOfWeek) + ", " + day + "/" + getMonthNumber(month) + "/" + year + ", " + time + " - "+ timezone;
    }

    private String getMonthNumber(String month) {
        switch (month) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> "00";
        }
    }

    private String getDayOfWeekInPT() {
        switch (dayOfWeek) {
            case "Mon" -> return "Segunda-feira";
            case "Tue" -> return "Terça-feira";
            case "Wed" -> return "Quarta-feira";
            case "Thu" -> return "Quinta-feira";
            case "Fri" -> return "Sexta-feira";
            case "Sat" -> return "Sábado";
            case "Sun" -> return "Domingo";
            default -> return "Dia da semana desconhecido";
        }
    }
}