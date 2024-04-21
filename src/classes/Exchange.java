package classes;

/*
 * Exchange class to store the exchange information
 * @param currency1: The base currency
 * @param currency2: The target currency
 * @param rate: The conversion rate
 * @param result: The result of the conversion
 * @param last_update: The time of the last update
 * @param finalValue: The final value after conversion
 * @param response: The response from the API
 * @param finalValue: The final value after conversion
 * @method Exchange: Constructor with parameters
 * @method showExchange: Show the exchange information
 * @method getCurrency1: Get the base currency
 * @method getCurrency2: Get the target currency
 * @method getRate: Get the conversion rate
 * @method getResult: Get the result of the conversion
 * @method getLastUpdate: Get the time of the last update
 * @method getFinalValue: Get the final value after conversion
 */
import api.ApiResponse;

public class Exchange {
    // The base currency
    private String currency1, currency2, rate, result, last_update;
    // The final value after conversion
    private double finalValue;

    // Constructor with parameters
    public Exchange(String currency1, String currency2, String rate, String last_update, double finalValue) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.rate = rate;
        this.last_update = last_update;
        this.finalValue = finalValue;
    }

    // Constructor with ApiResponse
    public Exchange(ApiResponse response) {
        this.currency1 = response.baseCode();
        this.currency2 = response.targetCode();
        this.rate = String.valueOf(response.conversionRate());
        this.result = response.result();
        this.last_update = response.timeLastUpdateUtc();
        this.finalValue = response.finalValue();
    }

    // Show the exchange information
    public void showExchange() {
        System.out.println("Resultado da conversão:");
        System.out.println("----------------------");
        System.out.println(currency1 + " => " + currency2 + ":");
        System.out.println("Taxa de conversão: " + rate);
        System.out.println("Resultado da conversão: " + finalValue);
        System.out.println("----------------------");
        System.out.println("Última atualização do câmbio: " + last_update);
    }

    // Getters
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
