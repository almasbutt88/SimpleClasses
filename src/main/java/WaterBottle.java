public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {

        this.volume = volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        if(this.volume >= 10){
            this.volume -= 10;
        }

    }

    public void empty() {
        this.setVolume(0);
    }

    public void refill() {
        this.setVolume(100);
    }
}
