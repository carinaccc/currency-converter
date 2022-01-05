public class Currency {

    private String name; //instance variable
    private double rate; //instance variable
    private double amount; //instance variable


    //currency constructor that gets 3 parameters
    public Currency(String name, double rate, double amount) {
        this.name = name; //assigns name to instance variable name
        this.rate = rate;
        this.amount = amount;

    }

    public void setName(String name) {
        this.name = name; //store the currency name
    }

    public String getName() {
        return name; //retrieving currency name
    }

    public double getAmount() {
        return amount; //method returns currency amount
    }




}
