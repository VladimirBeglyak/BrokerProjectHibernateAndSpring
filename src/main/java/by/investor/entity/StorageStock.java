package by.investor.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "storage_stocks")
public class StorageStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;

    private String name;

    private Long count;

    @Column(name = "cost_one_stock")
    private Double price;

    private String country;

    private Double dividend;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "currency_id")
    private Currency currency;

    public StorageStock() {
    }

    public StorageStock(String ticker, String name, Long count, Double price, String country, Double dividend) {
        this.ticker = ticker;
        this.name = name;
        this.count = count;
        this.price = price;
        this.country = country;
        this.dividend = dividend;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getDividend() {
        return dividend;
    }

    public void setDividend(Double dividend) {
        this.dividend = dividend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageStock that = (StorageStock) o;
        return Objects.equals(ticker, that.ticker) && Objects.equals(name, that.name) && Objects.equals(count, that.count) && Objects.equals(price, that.price) && Objects.equals(country, that.country) && Objects.equals(dividend, that.dividend) && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, name, count, price, country, dividend, currency);
    }

    @Override
    public String toString() {
        return "StorageStock{" +
                "id=" + id +
                ", ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", country='" + country + '\'' +
                ", dividend=" + dividend +
                ", currency=" + currency +
                '}';
    }
}
