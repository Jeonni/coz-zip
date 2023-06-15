package dailyCoding;

public class _24_isSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {
        int count = 0;
        int isSubset = sample.length;
        // TODO: 두 개의 배열(base, sample)을 입력받아 sample이 base의 부분집합인지 여부를 리턴해야 합니다.
        for (int i = 0; i < base.length; i++) {
            for (int j = 0; j < sample.length; j++) {
                if(base[i] == sample[j]) count++;
                else continue;
            }
        }

        if(count == isSubset) return true;
        else return false;
    }
}