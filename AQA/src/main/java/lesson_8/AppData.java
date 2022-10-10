package lesson_8;

import java.io.*;
import java.util.List;

public class AppData {
    private String[] headers;
    private String[][] data;

    public String[] getHeaders() {
        return headers;
    }

    public String[][] getData() {
        return data;
    }

    public AppData(String fileName, String delimiter) {
        ClassLoader classLoader = AppData.class.getClassLoader();
        String[][] dataArray = new String[0][0];
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        assert inputStream != null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            List<String> stringList = br.lines().toList();
            int rowCount = stringList.size() - 1;
            boolean isHeader = true;
            int j = 0;
            for (String line : stringList) {
                if (isHeader) {
                    headers = line.split(delimiter);
                    int columnCount = headers.length;
                    dataArray = new String[rowCount][columnCount];
                    isHeader = false;
                } else {
                    String[] StringTokens = line.split(delimiter);
                    dataArray[j] = StringTokens;
                    j++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        data = dataArray;
    }


}
