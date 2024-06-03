package behaviouralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> observers;

    private String channelName;
    private String videoTitle;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
        this.observers=new ArrayList<>();
    }

    public void uploadVideo(String videoTitle){
        this.videoTitle=videoTitle;
        System.out.println("Video uploaded : "+videoTitle);
        notifyObservers();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (var observer:observers){
            observer.update(videoTitle);
        }
    }
}
