package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<>();
        String dataROw;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((dataROw = br.readLine()) != null) {
                String[] dataRecord = dataROw.split(",");
                data.add(dataRecord);
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    return data;
    }
}
