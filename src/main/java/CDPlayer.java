public class CDPlayer extends Component implements IPlay {

    private int numberOfCDs;

    public CDPlayer(String make, String model, int numberOfCDs) {
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return numberOfCDs;
    }

    public void setNumberOfCDs(int numberOfCDs) {
        this.numberOfCDs = numberOfCDs;
    }

    @Override
    public String playStop(String command) {
        if (command == "Play") {
            return "Cd is now Playing.";
        }
        return "Cd has Stopped playing.";
    }
}
