package threads;

class MyDownloader implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<=100; i+=5){
            System.out.println("From "+Thread.currentThread().getName()+" downloaded "+i+"%");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}

public class DownloaderWithRunnable {

    public static void main(String[] args) {
        Runnable r1 = new MyDownloader();
        Runnable r2 = new MyDownloader();
        Thread downloader1 = new Thread(r1);
        Thread downloader2 = new Thread(r2);
        downloader1.setName("Downloader 1");
        downloader2.setName("Downloader 2");

        downloader1.start();
        downloader2.start();
    }

}
