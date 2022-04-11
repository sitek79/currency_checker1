package ru.dudeandrey.jsonworker2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "price",
        "volume_24h",
        "volume_change_24h",
        "percent_change_1h",
        "percent_change_24h",
        "percent_change_7d",
        "percent_change_30d",
        "percent_change_60d",
        "percent_change_90d",
        "market_cap",
        "market_cap_dominance",
        "fully_diluted_market_cap",
        "last_updated"
})
@Generated("jsonschema2pojo")
public class Rub {

    @JsonProperty("price")
    public double price;
    @JsonProperty("volume_24h")
    public double volume24h;
    @JsonProperty("volume_change_24h")
    public double volumeChange24h;
    @JsonProperty("percent_change_1h")
    public double percentChange1h;
    @JsonProperty("percent_change_24h")
    public double percentChange24h;
    @JsonProperty("percent_change_7d")
    public double percentChange7d;
    @JsonProperty("percent_change_30d")
    public double percentChange30d;
    @JsonProperty("percent_change_60d")
    public double percentChange60d;
    @JsonProperty("percent_change_90d")
    public double percentChange90d;
    @JsonProperty("market_cap")
    public double marketCap;
    @JsonProperty("market_cap_dominance")
    public double marketCapDominance;
    @JsonProperty("fully_diluted_market_cap")
    public double fullyDilutedMarketCap;
    @JsonProperty("last_updated")
    public String lastUpdated;

}