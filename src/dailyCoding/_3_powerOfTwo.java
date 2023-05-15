package dailyCoding;

/*
수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다.
 */
public class _3_powerOfTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean output1 = solution.powerOfTwo(16);
        System.out.println(output1); // true
        boolean output2 = solution.powerOfTwo(22);
        System.out.println(output2); // false
    }

    public static class Solution {
        public boolean powerOfTwo(long num) {
            // 금지된 문자열은 주석까지 확인합니다.
            // TODO:
            if (num == 1) return true;
            if (num % 2 != 0) return false;

            long powered = 2;
            while (powered < num) {
                powered = powered * 2;
            }
            return powered == num;
        }
    }
}
