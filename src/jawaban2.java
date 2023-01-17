public class jawaban2 {
    public static void main(String[] args) {
        System.out.println(ReverseString.Reverse("a b cd ef"));
        System.out.println(ReverseString.Reverse("contoh kalimat"));
    }
    private static jawaban2 ReverseString;

    public static String Reverse(String str) {
        char ra[] = str.toCharArray();
        String rev = "";
        for (int i = ra.length-1;
        i >= 0;
        i--){
            rev += ra[i];
        }
        return rev.replaceAll("(?)[aiueo]", "*");
    }
}
