class substr {
    public static void main(String[] args) {
        skipstr("", "appleAPPLEbananaAPPLEapple");
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a')
            skip(p, up.substring(1));
        else
            skip(p + ch, up.substring(1));
    }

    static void skipstr(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            skipstr(p, up.substring(5));
        } else {
            skipstr(p + ch, up.substring(1));
        }
    }
}