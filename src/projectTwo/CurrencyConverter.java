package projectTwo;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EURO",0.95);
        exchangeRates.put("INR",86.58);
        exchangeRates.put("AED",3.67);
        exchangeRates.put("JPY",152.0);
        exchangeRates.put("SGD",1.34);
        exchangeRates.put("GBP",0.79);
        exchangeRates.put("AED",3.66);

    }

    public double convert(String fromCurrency, String toCurrency, double amount){

        if(!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code: ");
        }
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);

        double amountInUSD = amount / fromRate;
        return amountInUSD * toRate;
    }
}
