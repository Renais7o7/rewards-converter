public class RewardValue {
    //constructors
    //miles based on given cash value / 0.0035 as stated in instructions
    private double cash;
    private double miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    //returns given cash value - no changes really needed
    public double getCashValue() {
        return this.cash;
    }

    //returns miles value
    public double getMilesValue() {
        return this.miles;
    }

    //note: This results in a very long decimal number
    //Could be fixed by importing a library and setting it to round to a specific value
}
