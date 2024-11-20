import java.util.*;
import java.io.*;


/*    /\_/\
 *   (= ._.)
 *   / >  \>
 */


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        String[] first = in.readLine().split(" ");
        long height = Long.parseLong(first[0]), n = Long.parseLong(first[1]), l = 1, r = (long) Math.pow(2, height), h = 0, ans = 0, dir = 0, tl = l, tr = r;

        while (h < height) {
            long m = (tl + tr) / 2;
            if (n > m) {
                if (dir == 0) {
                    ans += (long) Math.pow(2, (height - h)) - 1;
                }
                dir = 0;
                tl = m + 1;
            } else {
                if (dir == 1) {
                    ans += (long) Math.pow(2, (height - h)) - 1;
                }
                dir = 1;
                tr = m;
            }
            h++;
            ans++;
        }
        out.println(ans);
        out.flush();
    }

}
