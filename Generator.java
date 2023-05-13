import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Generator {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(new File("D:\\IDEA\\asd\\semestrovka2\\inputDate.txt"));

            int n = 10000;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++){
                list.add(i);
            }
            Collections.shuffle(list);
            list.forEach(i -> {
                        try {
                            writer.write(i + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
