package threads;



public class DownloaderWithLambda {

    static void download(){
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

    public static void main(String[] args) {

        Thread downloader1 = new Thread(()->download());
        Thread downloader2 = new Thread(()->download());
        downloader1.setName("Downloader 1");
        downloader2.setName("Downloader 2");

        downloader1.start();
        downloader2.start();
    }

}
