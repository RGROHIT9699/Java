package class2;

import java.util.*;

public class MyFile {
    static class D {
        long value = 0;
        int count = 0;
    }

    static class BinaryIndexedTree {
        private int size;
        private Map<Integer, D> table;

        public BinaryIndexedTree(int size) {
            this.size = size + 1;
            this.table = new HashMap<>();
        }

        public Pair<Long, Integer> getDist(int index) {
            long sum = 0;
            int count = 0;
            while (index > 0) {
                D d = table.getOrDefault(index, new D());
                sum += d.value;
                count += d.count;
                index -= (index & (-index));
            }
            return new Pair<>(sum, count);
        }

        public void updateDist(int index, long value) {
            while (index < size) {
                D d = table.getOrDefault(index, new D());
                d.value += value;
                d.count += 1;
                table.put(index, d);
                index += (index & (-index));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] pointsP = new long[n];
        long[] pointsV = new long[n];

        for (int i = 0; i < n; i++) {
            pointsP[i] = scanner.nextLong();
        }
        for (int i = 0; i < n; i++) {
            pointsV[i] = scanner.nextLong();
        }

        long[][] points = new long[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = pointsP[i];
            points[i][1] = pointsV[i];
        }

        Arrays.sort(points, Comparator.comparingLong(a -> a[0]));

        int negCount = 0;
        long negDist = 0, result = 0;
        BinaryIndexedTree B = new BinaryIndexedTree((int) 1e8 + 2);

        for (int i = 0; i < n; i++) {
            long curDist = 0;
            if (points[i][1] >= 0) {
                Pair<Long, Integer> cur = B.getDist((int) points[i][1]);
                curDist = (cur.getValue() * points[i][0]) - cur.getKey();
                curDist += (negCount * points[i][0]) - negDist;
            }
            if (points[i][1] <= 0) {
                negCount++;
                negDist += points[i][0];
            } else {
                B.updateDist((int) points[i][1], points[i][0]);
            }
            result += curDist;
        }

        B = new BinaryIndexedTree((int) 1e8 + 2); // reuse new BIT for negative part
        for (int i = 0; i < n; i++) {
            if (points[i][1] < 0) {
                Pair<Long, Integer> cur = B.getDist((int) Math.abs(points[i][1]) - 1);
                long curDist = (cur.getValue() * points[i][0]) - cur.getKey();
                result += curDist;
                B.updateDist((int) Math.abs(points[i][1]), points[i][0]);
            }
        }

        System.out.println(result);
        scanner.close();
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
