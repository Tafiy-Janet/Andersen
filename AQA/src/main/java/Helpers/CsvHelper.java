package Helpers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CsvHelper {

    public static <T> List<T> readFromCsv(Class<T> clazz, String fileName) {
        return readFromCsv(clazz, fileName, ";");
    }


    public static <T, E> List<T> readFromCsv(Class<E> containerClazz, Class<T> clazz, String fileName) {
        return readFromCsv(containerClazz, clazz, fileName, ";");
    }

    public static <T> List<T> readFromCsv(Class<T> clazz, String fileName, String delimiter) {
        ClassLoader classLoader = CsvHelper.class.getClassLoader();
        List<T> instances = new ArrayList<>();
        try {
            T inst = clazz.getConstructor().newInstance();
            InputStream inputStream = classLoader.getResourceAsStream(fileName);
            assert inputStream != null;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                int lineCount = 0;
                String[] headers = new String[0];
                Field[] fields = clazz.getDeclaredFields();

                while ((line = br.readLine()) != null) {
                    if (lineCount == 0) {
                        headers = line.split(delimiter);
                    } else {
                        String[] tokens = line.split(delimiter);
                        for (Field field : fields) {
                            String fieldName = field.getName();
                            Type fieldType = field.getType();
                            String fieldTypeName = fieldType.getTypeName();
                            for (int i = 0; i < tokens.length; i++) {
                                String token = tokens[i];
                                String header = headers[i];
                                if (fieldName.equals(header)) {
                                    if (fieldTypeName.equals(int.class.getTypeName())) {
                                        int val = Integer.parseInt(token);
                                        field.set(inst, val);
                                    } else if (fieldTypeName.equals(String.class.getTypeName())) {
                                        field.set(inst, token);
                                    } else if (fieldTypeName.equals(long.class.getTypeName())) {
                                        long val = Long.parseLong(token);
                                        field.set(inst, val);
                                    } else if (fieldTypeName.equals(float.class.getTypeName())) {
                                        float val = Float.parseFloat(token);
                                        field.set(inst, val);
                                    } else if (fieldTypeName.equals(double.class.getTypeName())) {
                                        double val = Double.parseDouble(token);
                                        field.set(inst, val);
                                    } else {
                                        throw new Exception("Unsupported type for property " + fieldName);
                                    }
                                }
                            }
                        }
                        instances.add(inst);
                    }
                    lineCount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error trying to read file" + fileName + "\nError: " + e.getMessage());
        }
        return instances;
    }

    public static <T, E> List<T> readFromCsv(Class<E> containerClazz, Class<T> clazz, String fileName, String delimiter) {
        ClassLoader classLoader = CsvHelper.class.getClassLoader();
        List<T> instances = new ArrayList<>();
        try {
            E cont = containerClazz.getConstructor().newInstance();
            Class<?>[] innerClasses = containerClazz.getDeclaredClasses();
            for (Class<?> inClass : innerClasses) {
                if (inClass.getTypeName().equals(clazz.getTypeName())) {
                    InputStream inputStream = classLoader.getResourceAsStream(fileName);
                    assert inputStream != null;
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                        String line;
                        int lineCount = 0;
                        String[] headers = new String[0];
                        Field[] fields = clazz.getDeclaredFields();

                        while ((line = br.readLine()) != null) {
                            if (lineCount == 0) {
                                headers = line.split(delimiter);
                            } else {
                                T inst = (T) inClass.getDeclaredConstructor(containerClazz).newInstance(cont);
                                String[] tokens = line.split(delimiter);
                                for (Field field : fields) {
                                    String fieldName = field.getName();
                                    Type fieldType = field.getType();
                                    String fieldTypeName = fieldType.getTypeName();
                                    for (int i = 0; i < tokens.length; i++) {
                                        String token = tokens[i];
                                        String header = headers[i];
                                        if (fieldName.equals(header)) {
                                            if (fieldTypeName.equals(int.class.getTypeName())) {
                                                int val = Integer.parseInt(token);
                                                field.set(inst, val);
                                            } else if (fieldTypeName.equals(String.class.getTypeName())) {
                                                field.set(inst, token);
                                            } else if (fieldTypeName.equals(long.class.getTypeName())) {
                                                long val = Long.parseLong(token);
                                                field.set(inst, val);
                                            } else if (fieldTypeName.equals(float.class.getTypeName())) {
                                                float val = Float.parseFloat(token);
                                                field.set(inst, val);
                                            } else if (fieldTypeName.equals(double.class.getTypeName())) {
                                                double val = Double.parseDouble(token);
                                                field.set(inst, val);
                                            } else {
                                                throw new Exception("Unsupported type for property " + fieldName);
                                            }
                                        }
                                    }
                                }
                                instances.add(inst);
                            }
                            lineCount++;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error trying to read file" + fileName + "\nError: " + e.getMessage());
        }
        return instances;
    }
}
