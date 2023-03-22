package chching.currency;

import java.util.HashMap;

public class Converter {
    protected HashMap<String, Double> currencyMap;

    public Converter() {
        currencyMap = new HashMap<>();
        currencyMap.put("HKD", 5.87);
        currencyMap.put("PHP", 40.72);
        currencyMap.put("IDR", 11437.80);
        currencyMap.put("MYR", 3.34);
        currencyMap.put("VND", 17618.54);
    }

    public double convert(String currency, double amount) {
        return amount * currencyMap.get(currency);
    }

    public String printConverter(double value, Selector selector) {
        String result = "";
        for (String currency : currencyMap.keySet()) {
            if (selector.isSelected(currency)) {
                double convertedValue = convert(currency, value);
                result += " | " + currency + " " + String.format("%.2f", convertedValue);

            }
        }
        return result;
    }

}
