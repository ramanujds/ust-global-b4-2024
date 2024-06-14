package simplepattern;

public class SimplePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1 + "\t");
                else
                    System.out.print(0+"\t");
            }
            System.out.println();
        }
    }

}
