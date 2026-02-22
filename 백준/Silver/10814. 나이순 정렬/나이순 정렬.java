import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Person[] p = new Person[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = new Person(i, Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(p, (p1, p2) -> {
            if (p1.age != p2.age) {
                return p1.age - p2.age;
            }
            return p1.time - p2.time;
        });

        for (Person n : p) {
            bw.write(n.age + " " + n.name + "\n");
        }
        bw.flush();
    }
}

class Person {
    int time;
    int age;
    String name;

    public Person(int time, int age, String name) {
        this.time = time;
        this.age = age;
        this.name = name;
    }
}
