import java.io.*;
import java.util.StringTokenizer;

public class FastIO extends PrintWriter {
    private BufferedReader bufferedReader;
    private StringTokenizer stringTokenizer;

    public FastIO() {
        this(System.in, // new FileInputStream("src/input.txt")
                System.out); // new FileOutputStream("src/output.txt")
    }

    public FastIO(InputStream inputStream, OutputStream outputStream) {
        super(new BufferedOutputStream(outputStream));
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        stringTokenizer = new StringTokenizer("");
    }

    public String next(String delim) {
        while (!stringTokenizer.hasMoreTokens()) {
            try {
                String line = bufferedReader.readLine();
                stringTokenizer = new StringTokenizer(line); // str in stringTokenizer don't contain \t\n\r\f
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken(delim);
    }

    public String next() {
        return next(" ");
    }

    public String nextLine() {
        return next("");
    }

    public boolean hasNext() {
        while (!stringTokenizer.hasMoreTokens()) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return false;
                }
                stringTokenizer = new StringTokenizer(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int[] nextInts(int n) {
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = nextInt();
        }
        return ints;
    }

    public long[] nextLongs(int n) {
        long[] longs = new long[n];
        for (int i = 0; i < n; i++) {
            longs[i] = nextLong();
        }
        return longs;
    }

    public void printlnInts(int[] ints) {
        StringBuilder stringBuilder = new StringBuilder();
        if (ints.length > 0) {
            stringBuilder.append(ints[0]);
            for (int i = 1; i < ints.length; i++) {
                stringBuilder.append(' ').append(ints[i]);
            }
        }
        println(stringBuilder);
    }
}
