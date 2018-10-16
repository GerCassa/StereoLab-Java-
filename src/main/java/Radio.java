public class Radio extends Component implements ITune {

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tuneStation(double dial) {
        return "You are listening to Radio " + dial;
    }
}
