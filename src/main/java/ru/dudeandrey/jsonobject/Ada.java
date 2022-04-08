package ru.dudeandrey.jsonobject;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ada {

        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("num_market_pairs")
        @Expose
        private long numMarketPairs;
        @SerializedName("date_added")
        @Expose
        private String dateAdded;
        @SerializedName("tags")
        @Expose
        private List<Tag> tags = null;
        @SerializedName("max_supply")
        @Expose
        private long maxSupply;
        @SerializedName("circulating_supply")
        @Expose
        private double circulatingSupply;
        @SerializedName("total_supply")
        @Expose
        private double totalSupply;
        @SerializedName("is_active")
        @Expose
        private long isActive;
        @SerializedName("platform")
        @Expose
        private Object platform;
        @SerializedName("cmc_rank")
        @Expose
        private long cmcRank;
        @SerializedName("is_fiat")
        @Expose
        private long isFiat;
        @SerializedName("self_reported_circulating_supply")
        @Expose
        private Object selfReportedCirculatingSupply;
        @SerializedName("self_reported_market_cap")
        @Expose
        private Object selfReportedMarketCap;
        @SerializedName("last_updated")
        @Expose
        private String lastUpdated;
        @SerializedName("quote")
        @Expose
        private Quote quote;

        /**
         * No args constructor for use in serialization
         *
         */
        public Ada() {
        }

        /**
         *
         * @param symbol
         * @param isFiat
         * @param selfReportedCirculatingSupply
         * @param totalSupply
         * @param cmcRank
         * @param isActive
         * @param selfReportedMarketCap
         * @param dateAdded
         * @param circulatingSupply
         * @param platform
         * @param tags
         * @param lastUpdated
         * @param quote
         * @param numMarketPairs
         * @param name
         * @param id
         * @param maxSupply
         * @param slug
         */
        public Ada(long id, String name, String symbol, String slug, long numMarketPairs, String dateAdded, List<Tag> tags, long maxSupply, double circulatingSupply, double totalSupply, long isActive, Object platform, long cmcRank, long isFiat, Object selfReportedCirculatingSupply, Object selfReportedMarketCap, String lastUpdated, Quote quote) {
            super();
            this.id = id;
            this.name = name;
            this.symbol = symbol;
            this.slug = slug;
            this.numMarketPairs = numMarketPairs;
            this.dateAdded = dateAdded;
            this.tags = tags;
            this.maxSupply = maxSupply;
            this.circulatingSupply = circulatingSupply;
            this.totalSupply = totalSupply;
            this.isActive = isActive;
            this.platform = platform;
            this.cmcRank = cmcRank;
            this.isFiat = isFiat;
            this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
            this.selfReportedMarketCap = selfReportedMarketCap;
            this.lastUpdated = lastUpdated;
            this.quote = quote;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public long getNumMarketPairs() {
            return numMarketPairs;
        }

        public void setNumMarketPairs(long numMarketPairs) {
            this.numMarketPairs = numMarketPairs;
        }

        public String getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
        }

        public List<Tag> getTags() {
            return tags;
        }

        public void setTags(List<Tag> tags) {
            this.tags = tags;
        }

        public long getMaxSupply() {
            return maxSupply;
        }

        public void setMaxSupply(long maxSupply) {
            this.maxSupply = maxSupply;
        }

        public double getCirculatingSupply() {
            return circulatingSupply;
        }

        public void setCirculatingSupply(double circulatingSupply) {
            this.circulatingSupply = circulatingSupply;
        }

        public double getTotalSupply() {
            return totalSupply;
        }

        public void setTotalSupply(double totalSupply) {
            this.totalSupply = totalSupply;
        }

        public long getIsActive() {
            return isActive;
        }

        public void setIsActive(long isActive) {
            this.isActive = isActive;
        }

        public Object getPlatform() {
            return platform;
        }

        public void setPlatform(Object platform) {
            this.platform = platform;
        }

        public long getCmcRank() {
            return cmcRank;
        }

        public void setCmcRank(long cmcRank) {
            this.cmcRank = cmcRank;
        }

        public long getIsFiat() {
            return isFiat;
        }

        public void setIsFiat(long isFiat) {
            this.isFiat = isFiat;
        }

        public Object getSelfReportedCirculatingSupply() {
            return selfReportedCirculatingSupply;
        }

        public void setSelfReportedCirculatingSupply(Object selfReportedCirculatingSupply) {
            this.selfReportedCirculatingSupply = selfReportedCirculatingSupply;
        }

        public Object getSelfReportedMarketCap() {
            return selfReportedMarketCap;
        }

        public void setSelfReportedMarketCap(Object selfReportedMarketCap) {
            this.selfReportedMarketCap = selfReportedMarketCap;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public Quote getQuote() {
            return quote;
        }

        public void setQuote(Quote quote) {
            this.quote = quote;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Ada.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
            sb.append("id");
            sb.append('=');
            sb.append(this.id);
            sb.append(',');
            sb.append("name");
            sb.append('=');
            sb.append(((this.name == null)?"<null>":this.name));
            sb.append(',');
            sb.append("symbol");
            sb.append('=');
            sb.append(((this.symbol == null)?"<null>":this.symbol));
            sb.append(',');
            sb.append("slug");
            sb.append('=');
            sb.append(((this.slug == null)?"<null>":this.slug));
            sb.append(',');
            sb.append("numMarketPairs");
            sb.append('=');
            sb.append(this.numMarketPairs);
            sb.append(',');
            sb.append("dateAdded");
            sb.append('=');
            sb.append(((this.dateAdded == null)?"<null>":this.dateAdded));
            sb.append(',');
            sb.append("tags");
            sb.append('=');
            sb.append(((this.tags == null)?"<null>":this.tags));
            sb.append(',');
            sb.append("maxSupply");
            sb.append('=');
            sb.append(this.maxSupply);
            sb.append(',');
            sb.append("circulatingSupply");
            sb.append('=');
            sb.append(this.circulatingSupply);
            sb.append(',');
            sb.append("totalSupply");
            sb.append('=');
            sb.append(this.totalSupply);
            sb.append(',');
            sb.append("isActive");
            sb.append('=');
            sb.append(this.isActive);
            sb.append(',');
            sb.append("platform");
            sb.append('=');
            sb.append(((this.platform == null)?"<null>":this.platform));
            sb.append(',');
            sb.append("cmcRank");
            sb.append('=');
            sb.append(this.cmcRank);
            sb.append(',');
            sb.append("isFiat");
            sb.append('=');
            sb.append(this.isFiat);
            sb.append(',');
            sb.append("selfReportedCirculatingSupply");
            sb.append('=');
            sb.append(((this.selfReportedCirculatingSupply == null)?"<null>":this.selfReportedCirculatingSupply));
            sb.append(',');
            sb.append("selfReportedMarketCap");
            sb.append('=');
            sb.append(((this.selfReportedMarketCap == null)?"<null>":this.selfReportedMarketCap));
            sb.append(',');
            sb.append("lastUpdated");
            sb.append('=');
            sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
            sb.append(',');
            sb.append("quote");
            sb.append('=');
            sb.append(((this.quote == null)?"<null>":this.quote));
            sb.append(',');
            if (sb.charAt((sb.length()- 1)) == ',') {
                sb.setCharAt((sb.length()- 1), ']');
            } else {
                sb.append(']');
            }
            return sb.toString();
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
            result = ((result* 31)+((int)(this.isFiat^(this.isFiat >>> 32))));
            result = ((result* 31)+((this.selfReportedCirculatingSupply == null)? 0 :this.selfReportedCirculatingSupply.hashCode()));
            result = ((result* 31)+((int)(Double.doubleToLongBits(this.totalSupply)^(Double.doubleToLongBits(this.totalSupply)>>> 32))));
            result = ((result* 31)+((int)(this.cmcRank^(this.cmcRank >>> 32))));
            result = ((result* 31)+((int)(this.isActive^(this.isActive >>> 32))));
            result = ((result* 31)+((this.selfReportedMarketCap == null)? 0 :this.selfReportedMarketCap.hashCode()));
            result = ((result* 31)+((this.dateAdded == null)? 0 :this.dateAdded.hashCode()));
            result = ((result* 31)+((int)(Double.doubleToLongBits(this.circulatingSupply)^(Double.doubleToLongBits(this.circulatingSupply)>>> 32))));
            result = ((result* 31)+((this.platform == null)? 0 :this.platform.hashCode()));
            result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
            result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
            result = ((result* 31)+((this.quote == null)? 0 :this.quote.hashCode()));
            result = ((result* 31)+((int)(this.numMarketPairs^(this.numMarketPairs >>> 32))));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((int)(this.id^(this.id >>> 32))));
            result = ((result* 31)+((int)(this.maxSupply^(this.maxSupply >>> 32))));
            result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof Ada) == false) {
                return false;
            }
            Ada rhs = ((Ada) other);
            return (((((((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&(this.isFiat == rhs.isFiat))&&((this.selfReportedCirculatingSupply == rhs.selfReportedCirculatingSupply)||((this.selfReportedCirculatingSupply!= null)&&this.selfReportedCirculatingSupply.equals(rhs.selfReportedCirculatingSupply))))&&(Double.doubleToLongBits(this.totalSupply) == Double.doubleToLongBits(rhs.totalSupply)))&&(this.cmcRank == rhs.cmcRank))&&(this.isActive == rhs.isActive))&&((this.selfReportedMarketCap == rhs.selfReportedMarketCap)||((this.selfReportedMarketCap!= null)&&this.selfReportedMarketCap.equals(rhs.selfReportedMarketCap))))&&((this.dateAdded == rhs.dateAdded)||((this.dateAdded!= null)&&this.dateAdded.equals(rhs.dateAdded))))&&(Double.doubleToLongBits(this.circulatingSupply) == Double.doubleToLongBits(rhs.circulatingSupply)))&&((this.platform == rhs.platform)||((this.platform!= null)&&this.platform.equals(rhs.platform))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.quote == rhs.quote)||((this.quote!= null)&&this.quote.equals(rhs.quote))))&&(this.numMarketPairs == rhs.numMarketPairs))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&(this.id == rhs.id))&&(this.maxSupply == rhs.maxSupply))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))));
        }
}
