public class Stereo implements IPlay, ITune{

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordPlayer recordPlayer;
    private int volume;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordPlayer recordPlayer, int volume) {
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordPlayer = recordPlayer;
        this.volume = volume;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public RecordPlayer getRecordPlayer() {
        return recordPlayer;
    }

    public void setRecordPlayer(RecordPlayer recordPlayer) {
        this.recordPlayer = recordPlayer;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String playStop(String command) {
        return null;
    }

    @Override
    public String tuneStation(double dial) {
        return null;
    }
}
