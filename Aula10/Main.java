package Aula10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    ControlArchive aCon = new ControlArchive();
    String path = "C:\\Users\\Lab03\\Documents";
    String nArc = "oudi.txt";

    try {
        aCon.createFile(path, nArc);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}