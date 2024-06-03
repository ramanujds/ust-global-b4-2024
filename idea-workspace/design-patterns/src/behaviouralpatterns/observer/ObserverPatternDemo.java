package behaviouralpatterns.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        YouTubeChannel youTubeChannel = new YouTubeChannel("Ramanuj Das");

        Subscriber gaurav = new Subscriber("Gaurav");

        Subscriber sunny= new Subscriber("Sunny");

        Subscriber rose = new Subscriber("Rose");

        youTubeChannel.subscribe(gaurav);
        youTubeChannel.subscribe(sunny);
        youTubeChannel.subscribe(rose);

        youTubeChannel.uploadVideo("Design Patterns in Java");

        youTubeChannel.unsubscribe(gaurav);

        youTubeChannel.uploadVideo("Collection Framework in Java");


    }

}
