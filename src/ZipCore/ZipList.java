package ZipCore;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public abstract class ZipList {
    public ArrayList<ZipCode> zips;

    public static ArrayList<ZipCode> readCsv() {
        ArrayList<ZipCode> output = new ArrayList<>();
        Scanner crawler;
        try {
            crawler = new Scanner(new File("Assets/uszips.csv"));
        } catch (java.io.FileNotFoundException e) {
            out.println("Cannot find zipcode database, check paths:" + e);
            return null;
        }
        while (crawler.hasNextLine()) {
            String line = crawler.nextLine();
            String[] splitLine = line.split(",");
            int[] corrSplit = new int[splitLine.length];
            for (int i = 0; i < splitLine.length; i++) {
                corrSplit[i] = Integer.parseInt(splitLine[i]);
            }
            ZipCode tempZip = new ZipCode(corrSplit[0],corrSplit[1],corrSplit[2]);
            output.add(tempZip);
        }
        return output;
    }

    public int searchLat() {

    }

    public int searchLong() {

    }
}
