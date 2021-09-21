package by.investor.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;

    private String name;

//    @OneToOne(cascade = CascadeType.ALL,
//    mappedBy = "currency")
//    private StorageStock storageStock;

    public Currency() {
    }

    public Currency(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(ticker, currency.ticker) && Objects.equals(name, currency.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, name);
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
