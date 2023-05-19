package dailyCoding;

import java.util.HashMap;

public class _7_convertListToObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"make", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"}
        };

        HashMap<String, String> output = convertListToObject(arr);

        System.out.println(output);
/*
        {
            "make" = "Ford"
            "model" = "Mustang",
                    "year" = "1964"
        }
 */
    }

    private static HashMap<String, String> convertListToObject(String[][] arr) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (arr.length == 0) return hashMap;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length !=0){
                if(hashMap.containsKey(arr[i][0])){
                    continue;
                }
                hashMap.put(arr[i][0], arr[i][1]);
            }
        }
        return hashMap;
    }

}
