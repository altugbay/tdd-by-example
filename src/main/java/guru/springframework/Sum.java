package guru.springframework;

public class Sum implements Expression {
    public Money augment;
    public Money addmend;

    public Sum(Money augment, Money addmend) {
        this.augment = augment;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(String to) {
        return new Money(this.augment.amount + this.addmend.amount, to);
    }
}
