public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            str.length();

        } catch (NullPointerException e) {
            System.out.println(e + "が発生しました。");
            System.out.println(e.getMessage());
        }

    }
}
