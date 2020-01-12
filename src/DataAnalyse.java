import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-09 15:39
 */

public class DataAnalyse {

    /**
     * 根据文件读取数据
     *
     * @param filePath
     * @return
     */
    public static List<String> readDataFromFile(String filePath) {
        // 使用ArrayList来存储每行读取到的字符串
        List<String> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                list.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    /**
     * 往文件中写入内容(直接覆盖)
     * @param filePath 文件路径
     * @param content
     */
    public static void writeFile(String filePath, String content) {
        File file = new File(filePath);
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理数据
     *
     * @param list
     * @return
     */
    public static String handler(List<String> list) {
        int n = list.size() / 4 * 4;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();


        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < n; i++) {
                if (i % 4 == 1) {
                    list1.add(list.get(i));
                } else if (i % 4 == 2) {
                    list2.add(list.get(i));
                } else if (i % 4 == 3) {
                    list3.add(list.get(i));
                } else if (i % 4 == 0) {
                    list4.add(list.get(i));
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder
                    .append(list4.get(i)).append("\t")
                    .append(list2.get(i)).append("\t")
                    .append(list3.get(i)).append("\t")
                    .append(list1.get(i)).append("\t").append("\r\n");
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String fileOriginPath = "/Users/liuyanzhao/Desktop/data.txt";
        String fileTargetPath = "/Users/liuyanzhao/Desktop/result.txt";
        List<String> list = readDataFromFile(fileOriginPath);
        String result  = handler(list);
        writeFile(fileTargetPath, result);
    }

}
