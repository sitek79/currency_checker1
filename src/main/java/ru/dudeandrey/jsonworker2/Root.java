package ru.dudeandrey.jsonworker2;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "symbol",
        "slug",
        "num_market_pairs",
        "date_added",
        "tags",
        "max_supply",
        "circulating_supply",
        "total_supply",
        "is_active",
        "platform",
        "cmc_rank",
        "is_fiat",
        "self_reported_circulating_supply",
        "self_reported_market_cap",
        "last_updated",
        "quote"
})
@Generated("jsonschema2pojo")
public class Root {

    @JsonProperty("id")
    public long id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("symbol")
    public String symbol;
    @JsonProperty("slug")
    public String slug;
    @JsonProperty("num_market_pairs")
    public long numMarketPairs;
    @JsonProperty("date_added")
    public String dateAdded;
    @JsonProperty("tags")
    public List<Tag> tags = null;
    @JsonProperty("max_supply")
    public long maxSupply;
    @JsonProperty("circulating_supply")
    public double circulatingSupply;
    @JsonProperty("total_supply")
    public double totalSupply;
    @JsonProperty("is_active")
    public long isActive;
    @JsonProperty("platform")
    public Object platform;
    @JsonProperty("cmc_rank")
    public long cmcRank;
    @JsonProperty("is_fiat")
    public long isFiat;
    @JsonProperty("self_reported_circulating_supply")
    public Object selfReportedCirculatingSupply;
    @JsonProperty("self_reported_market_cap")
    public Object selfReportedMarketCap;
    @JsonProperty("last_updated")
    public String lastUpdated;
    @JsonProperty("quote")
    public Quote quote;

}