package api;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import classes.Exchange;

public class JsonTranslator {
    Gson gson = new Gson();

    public Exchange translateJson(JsonElement json) throws IOException {
        String currency1 = json.getAsJsonObject().get("base_code").toString();
        String currency2 = json.getAsJsonObject().get("target_code").toString();
        String rate = json.getAsJsonObject().get("conversion_rate").toString();
        String result = json.getAsJsonObject().get("conversion_result").toString();
        String last_update = json.getAsJsonObject().get("time_last_update_utc").toString();
        Exchange exchange = new Exchange(currency1, currency2, rate, result, last_update);
        return exchange;
    }
}
