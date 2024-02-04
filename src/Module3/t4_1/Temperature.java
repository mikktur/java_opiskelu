package Module3.t4_1;

import java.io.*;
import java.net.*;
import java.util.Arrays;

public class Temperature {
    public static void main(String[] args) {
        URL myUrl;
        boolean header = true;
        double summa = 0;
        int columnCount = 0;
        String[] columnNames;

        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;

        }
        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            int indexofcolumn = -1;
            String line;
            do {
                line = reader.readLine();
                if (line != null)
                    if (header) {
                        columnNames = line.split(";");
                        for (int i = 0; i < columnNames.length; i++) {
                            if (columnNames[i].equals("UlkoTalo")) {
                                indexofcolumn = i;
                            }

                        }
                        header = false;
                    } else {

                            String[] columns = line.split(";");
                            if (columns[0].contains("01.01.2023")) {

                                try {
                                String value = columns[indexofcolumn].replaceAll(",", ".");
                                System.out.println(value);
                                summa += Double.parseDouble(value);
                                columnCount++;
                                } catch (NumberFormatException e) {
                                    System.out.println("non numeric value: " +e);
                            }
                        }

                    }

            } while (line != null);

            reader.close();


        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.println("Keskiarvo: " +summa / columnCount);
    }

}
