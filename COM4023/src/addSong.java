public class addSong {
    //Declaring "final" variables, once declared they cannot be changed
    private final String name;
    private final String artistName;
    private final int playCount;


    public addSong(String name, String artistName, int playCount) {
        this.name = name;
        this.artistName = artistName;
        this.playCount = playCount;
    }

    public String returnName() {
        return name;
    }
    public String returnAName() {
        return artistName;
    }
    public int returnPlayCount() {
        return playCount;
    }
}