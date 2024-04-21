package api;

import com.google.gson.annotations.SerializedName;

/*
 * ApiResponse class to store the response from the API
 * @param result: The result of the conversion
 * @param documentation: The documentation of the API
 * @param termsOfUse: The terms of use of the API
 * @param timeLastUpdateUnix: The time of the last update in Unix format
 * @param timeLastUpdateUtc: The time of the last update in UTC format
 * @param timeNextUpdateUnix: The time of the next update in Unix format
 * @param timeNextUpdateUtc: The time of the next update in UTC format
 * @param baseCode: The base currency code
 * @param targetCode: The target currency code
 * @param conversionRate: The conversion rate
 * @param finalValue: The final value after conversion
 */
public record ApiResponse(
                @SerializedName("result") String result,
                @SerializedName("documentation") String documentation,
                @SerializedName("terms_of_use") String termsOfUse,
                @SerializedName("time_last_update_unix") int timeLastUpdateUnix,
                @SerializedName("time_last_update_utc") String timeLastUpdateUtc,
                @SerializedName("time_next_update_unix") int timeNextUpdateUnix,
                @SerializedName("time_next_update_utc") String timeNextUpdateUtc,
                @SerializedName("base_code") String baseCode,
                @SerializedName("target_code") String targetCode,
                @SerializedName("conversion_rate") double conversionRate,
                @SerializedName("conversion_result") double finalValue) {
}