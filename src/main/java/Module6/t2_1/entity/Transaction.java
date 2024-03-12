package Module6.t2_1.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private double amount;
    @ManyToOne
    @JoinColumn(name="source_currency")
    private Currency sourceCurrency;
    @ManyToOne
    @JoinColumn(name="target_currency")
    private Currency targetCurrency;

    public Transaction(double amount, Currency sourceCurrency, Currency targetCurrency) {
        super();
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public Transaction() {
    }

    public double getAmount() {
        return amount;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }

    public int getId() {
        return id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Transaction: " + id + " amount: " + amount + " source currency: " + sourceCurrency + " target currency: " + targetCurrency;
    }


}
