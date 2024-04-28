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
        this.timezone += date.substring(26, 31);
    }

    // Output model: "Sexta-feira, 27/03/2020, 00:00:00 - GMT +00000"
    public String formatFullDate() {
        return getDayOfWeekInPT() + ", " + day + "/" + getMonthNumber() + "/" + year + ", " + time + " - "
                + timezone;
    }

    // Get the month number
    private String getMonthNumber() {
        String monthNumber;
        switch (this.month) {
            case "Jan" -> monthNumber = "01";
            case "Feb" -> monthNumber = "02";
            case "Mar" -> monthNumber = "03";
            case "Apr" -> monthNumber = "04";
            case "May" -> monthNumber = "05";
            case "Jun" -> monthNumber = "06";
            case "Jul" -> monthNumber = "07";
            case "Aug" -> monthNumber = "08";
            case "Sep" -> monthNumber = "09";
            case "Oct" -> monthNumber = "10";
            case "Nov" -> monthNumber = "11";
            case "Dec" -> monthNumber = "12";
            default -> monthNumber = "00";
        }
        return monthNumber;
    }

    // Get the day of the week in Portuguese
    private String getDayOfWeekInPT() {
        String dayOfWeekPt;
        switch (this.dayOfWeek) {
            case "Mon" -> dayOfWeekPt = "Segunda-feira";
            case "Tue" -> dayOfWeekPt = "Terça-feira";
            case "Wed" -> dayOfWeekPt = "Quarta-feira";
            case "Thu" -> dayOfWeekPt = "Quinta-feira";
            case "Fri" -> dayOfWeekPt = "Sexta-feira";
            case "Sat" -> dayOfWeekPt = "Sábado";
            case "Sun" -> dayOfWeekPt = "Domingo";
            default -> dayOfWeekPt = "Dia da semana desconhecido";
        }
        return dayOfWeekPt;
    }
}
