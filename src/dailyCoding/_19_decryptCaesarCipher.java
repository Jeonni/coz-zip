package dailyCoding;

public class _19_decryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor zruog", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }

    public static String decryptCaesarCipher(String str, int secret) {
        // TODO: 암호화된 문자열과 암호화 키를 입력받아 복호화된 문자열을 리턴해야 합니다.
        // 카이사르 암호(Caesar cipher)는 평문(plaintext)을 암호키 secret개만큼 (오른쪽으로) 평행이동시켜 암호화 합니다. 복호화는 암호화된 문자열을 원래의 평문으로 복원하는 것을 말합니다.
        if (str.length() == 0) return "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            if(word == ' '){
                sb.append(" ");
                continue;
            }
            int indexNum = alphabet.indexOf(word);
            int newIndexNum = (indexNum - secret + alphabet.length()) % alphabet.length();
            char newChar = alphabet.charAt(newIndexNum);
            sb.append(newChar);
        }

        return sb.toString();
    }
}