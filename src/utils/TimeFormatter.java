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
        switch (this.month) {
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
            default:
                return "00";
        }
    }

    // Get the day of the week in Portuguese
    private String getDayOfWeekInPT() {
        switch (this.dayOfWeek) {
            case "Mon":
                return "Segunda-feira";
            case "Tue":
                return "Terça-feira";
            case "Wed":
                return "Quarta-feira";
            case "Thu":
                return "Quinta-feira";
            case "Fri":
                return "Sexta-feira";
            case "Sat":
                return "Sábado";
            case "Sun":
                return "Domingo";
            default:
                return "Dia da semana desconhecido";
        }
    }
}