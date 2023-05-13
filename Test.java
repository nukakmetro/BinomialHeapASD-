import java.io.*;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        BinomialHeap heap = new BinomialHeap();
        try {

            BufferedReader reader = new BufferedReader(new FileReader("D:\\IDEA\\asd\\semestrovka2\\inputDate.txt"));
            String line;
            FileWriter writer = new FileWriter(new File("D:\\IDEA\\asd\\semestrovka2\\table.txt"));
            FileWriter writer2 = new FileWriter(new File("D:\\IDEA\\asd\\semestrovka2\\table2.txt"));
            FileWriter writer3 = new FileWriter(new File("D:\\IDEA\\asd\\semestrovka2\\table3.txt"));
            int i;
            while ((line = reader.readLine()) != null){
                long start = System.nanoTime();
                i = heap.insert(Integer.valueOf(line));
                long finish = System.nanoTime();
                long time = (finish - start )/1000;
                writer.write(line + "\t"+ i + "\t" + time + "\n");
            }
            Random r = new Random();
            int k, i2,i3;
            for(int j = 0; j < 100; j++){
                k = r.nextInt(1,10000);
                long start = System.nanoTime();
                i2 = heap.searchWithKey(k);
                long finish = System.nanoTime();
                long time = (finish - start )/1000;
                writer2.write(k + "\t"+ i2 + "\t" + time + "\n");
            }
            for(int p = 0; p < 1000; p++){
                k = r.nextInt(1,10000);
                long start = System.nanoTime();
                i3 = heap.delete(k);
                long finish = System.nanoTime();
                long time = (finish - start )/1000;
                writer3.write(k + "\t"+ i3 + "\t" + time + "\n");

            }


            writer.close();
            writer2.close();
            writer3.close();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}