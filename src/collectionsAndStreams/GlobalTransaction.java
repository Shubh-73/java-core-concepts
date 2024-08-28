package collectionsAndStreams;

public class GlobalTransaction {

    Currency currency;
    Integer value;
    public GlobalTransaction(Currency currency, Integer value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Integer getValue() {
        return value;
    }
}
