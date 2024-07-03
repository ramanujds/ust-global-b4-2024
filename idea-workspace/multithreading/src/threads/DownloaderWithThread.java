package threads;

class Downloader extends Thread{
    @Override
    public void run() {
        for (int i=0; i<=100; i+=5){
            System.out.println("From "+getName()+" downloaded "+i+"%");
            try {
                sleep(100);
            }
            catch (InterruptedException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}

public class DownloaderWithThread {

    public static void main(String[] args) {
        Thread downloader1 = new Downloader();
        Thread downloader2 = new Downloader();
        downloader1.setName("Downloader 1");
        downloader2.setName("Downloader 2");

        downloader1.start();
        downloader2.start();


    }

}
