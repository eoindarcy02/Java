public class CurrencyConverter implements BaseCurrency {
    private double usd = 0.0;
    @Override
    public double getUSD() {
        return usd;
    }
    @Override
    public void setUSD(double value) {
        usd = value;
    }
    @Override
    public double usdToEuro() {
        return usd / 1.14;
    }
    @Override
    public double usdToGBP() {
        return usd / 1.36;
    }
    @Override
    public double usdToYuan() {
        return usd / 6.36;
    }
    @Override
    public void euroToUSD(double value) {
        usd = value * 1.11;
    }
    @Override
    public void gbpToUSD(double value) {
        usd = value * 1.33;
    }
    @Override
    public void yuanToUSD(double value) {
        usd = value * 6.36;
    }
    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        CurrencyConverter d = new CurrencyConverter();
        CurrencyConverter e = new CurrencyConverter();
        c.setUSD(50);
        d.setUSD(50);
        e.setUSD(50);
        c.euroToUSD(50);
        d.gbpToUSD(50);
        e.yuanToUSD(50);
        System.out.println("USD to Euro: " + c.usdToEuro());
        System.out.println("USD to GBP: " + d.usdToGBP());
        System.out.println("USD to Yuan: " + e.usdToYuan());
        System.out.println("Euro to USD: " + c.getUSD());
        System.out.println("GBP to USD: " + d.getUSD());
        System.out.println("Yuan to USD: " + e.getUSD());
    }
}