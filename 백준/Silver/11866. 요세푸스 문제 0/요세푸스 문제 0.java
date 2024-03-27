import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringJoiner answer = new StringJoiner(", ", "<", ">");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        while (!q.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                q.add(q.poll());
            }
            answer.add(q.poll() + "");
        }
        System.out.println(answer);
    }
}
