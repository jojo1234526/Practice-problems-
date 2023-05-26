public class StringCompress {
    public static void main(String[] args){
        String str = "heellooo";
        String compressedStr = compress(str);
        System.out.println("Compressed String: " + compressedStr);
    }

    public static String compress(String original){
        int n = original.length();
        StringBuilder compressed = new StringBuilder();
        int count =1;
        for(int i =1; i < n; i++){
            if (original.charAt(i) == original.charAt(i - 1)) {
                count++;
            } else{
                compressed.append(original.charAt(i-1)).append(count);
                count = 1;
            }
        }
        compressed.append(original.charAt(n-1)).append(count);
        return compressed.length() <= n ? compressed.toString() : original;
    }
}
