
interface Multiplayer{
    void increaseVolume();
    void decreaseVolume();
    void playAudio();
    void playVideo();
    void editVideo();
    void editAudio();
}

class VideoPlayers implements Multiplayer{ // forcing to implement audio methods

    @Override
    public void increaseVolume() {

    }

    @Override
    public void decreaseVolume() {

    }

    @Override
    public void playAudio() {

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void editVideo() {

    }

    @Override
    public void editAudio() {

    }
}

//Interface segregation principal
interface VideoPlayerInter{

    void playVideo();
    void pauseVideo();
    void editVideo();
}

interface Player{
    void increaseVolume();
    void decreaseVolume();
}

class VideoPlayerService implements Player, VideoPlayerInter{

    @Override
    public void increaseVolume() {

    }

    @Override
    public void decreaseVolume() {

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void pauseVideo() {

    }

    @Override
    public void editVideo() {

    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {

    }
}

// Don't force child class to override methods which are not in use.