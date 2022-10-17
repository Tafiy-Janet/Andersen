package lesson_7;

import java.io.*;
import java.util.List;

public class AppData {

    private String[] headers;
    private int[][] data;

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void load(String fileName, String delimiter) {
        ClassLoader classLoader = AppData.class.getClassLoader();
        int[][] dataArray = new int[0][0];
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
                    dataArray = new int[rowCount][columnCount];
                    isHeader = false;
                } else {
                    String[] tokens = line.split(delimiter);
                    int[] intTokens = strToIntArray(tokens);
                    dataArray[j] = intTokens;
                    j++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        data = dataArray;
    }

    public void save(String filePath, String delimiter) {
        try {
            File file = new File(filePath).getAbsoluteFile();
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < headers.length; i++) {
                    if (i > 0) {
                        csvWriter.write(delimiter + headers[i]);
                    } else {
                        csvWriter.write(headers[i]);
                    }
                }
                csvWriter.newLine();
                for (int[] inData : data) {
                    for (int i = 0; i < inData.length; i++) {
                        String stringVal = String.valueOf(inData[i]);
                        if (i > 0) {
                            csvWriter.write(delimiter + stringVal);
                        } else {
                            csvWriter.write(stringVal);
                        }
                    }
                    csvWriter.newLine();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int[] strToIntArray(String[] inputArr) {
        int[] result = new int[inputArr.length];
        int i = 0;
        for (String token : inputArr) {
            int val = Integer.parseInt(token);
            result[i] = val;
            i++;
        }
        return result;
    }
}

