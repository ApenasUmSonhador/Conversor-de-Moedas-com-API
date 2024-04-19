package classes;

public class Exchange {
    private String currency1;
    private String currency2;
    private String rate;
    private String result;
    private String last_update;

    public Exchange(String currency1, String currency2, String rate, String result, String last_update) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.rate = rate;
        this.result = result;
        this.last_update = last_update;
    }

    public void showExchange() {
        System.out.println("Resultado da conversão:");
        System.out.println("----------------------");
        System.out.println(currency1 + " => " + currency2 + ":");
        System.out.println("Taxa de conversão: " + rate);
        System.out.println("Resultado da conversão: " + result);
        System.out.println("----------------------");
        System.out.println("Última atualização do câmbio: " + last_update);
    }

    public String getCurrency1() {
        return currency1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public String getRate() {
        return rate;
    }

    public String getResult() {
        return result;
    }

    public String getLastUpdate() {
        return last_update;
    }
}
