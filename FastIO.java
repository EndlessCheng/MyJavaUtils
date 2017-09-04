import java.io.*;
import java.util.StringTokenizer;

public class FastIO extends PrintWriter {
    private BufferedReader bufferedReader;
    private StringTokenizer stringTokenizer;

    public FastIO() {
        this(System.in);
    }

    public FastIO(InputStream inputStream) {
        super(new BufferedOutputStream(System.out));
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        stringTokenizer = new StringTokenizer("");
    }

    public String next() {
        while (!stringTokenizer.hasMoreTokens()) {
            try {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
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
}
