package guru.springframework;

public class Sum implements Expression {
    public Expression augment;
    public Expression addmend;

    public Sum(Expression augment, Expression addmend) {
        this.augment = augment;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int result = this.augment.reduce(bank, to).amount + this.addmend.reduce(bank, to).amount;
        return new Money(result, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
