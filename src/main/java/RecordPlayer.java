public class RecordPlayer extends Component implements IPlay {

    private int speed;

    public RecordPlayer(String make, String model, int speed) {
        super(make, model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String playStop(String command) {
        if (command == "Play") return "Record is playing at "+ speed + ".";
        return "Record has stopped playing.";
    }
}
