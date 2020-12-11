public class Cancion {

    private String name;
    private String rute;
    private int duration;

    public Cancion(String name, String rute, int duration) {
        this.name = name;
        this.rute = rute;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
