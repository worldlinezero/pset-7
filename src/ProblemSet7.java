public class ProblemSet7 {
    public static void main(String[] args) {
    }

    public String surroundMe(String in, String out) {
        if (in == null || out == null || out.length() != 4) {
            return in;
        }
        else {
            String start = out.substring(0, 2);
            String end = out.substring(2, 4);
            return start + in + end;
        }
    }

    public String endsMeet(String text, int n) {
        if (text == null || (text.length() < 1 || text.length() > 10) || (n < 1 || n > text.length())) {
            return text;
        }
        else {
            String start = text.substring(0, n);
            String end = text.substring(text.length() - n);
            return start + end;
        }
    }

    public String middleMan(String text) {
        if (text == null || text.length() < 3 || text.length() % 2 != 1) {
            return text;
        }
        else {
            int length = text.length();
            return text.substring((length / 2 - 1), (length / 2 + 2));
        }
    }

    public boolean isCentered(String text, String target) {
        if (text == null || text.length() < 3 || text.length() % 2 != 1 || target == null || target.length() != 3 || (!target.equals(text))) {
            return false;
        }
        else {
            String middle = text.substring((text.length() / 2) - 1, (text.length() / 2) + 2);
            return middle.equals(target);
        }
    }

    public int countMe(String text, char suffix) {
        int count;
        if (text == null || !Character.isLetter(suffix)) {
            return -1;
        }
        else {
            count = 0;
            StringBuilder last = new StringBuilder(" ");
            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    last.append(text.charAt(i - 1));
                }
            }
            last.append(text.charAt(text.length() - 1));
            for (int j = 0; j < last.length(); j++ ) {
                if (last.charAt(j) == suffix) {
                    count += 1;
                }
            }
            return count;
        }
    }

    public int triplets(String text) {
        int count;
        if (text == null) {
            return -1;
        }
        else {
            count = 0;
            for (int i = 1; i < text.length() - 1; i++) {
                if (text.charAt(i) == (text.charAt(i - 1)) && text.charAt(i) == text.charAt(i + 1)) {
                    count += 1;
                }
            }
            return count;
        }
    }

    public long addMe(String text) {
        long sum;
        if (text == null) {
            return -1;
        }
        else {
            sum = 0;
            for (int i = 0; i < text.length(); i++) {
                char digit = text.charAt(i);
                if (Character.isDigit(digit)) {
                    sum += Integer.parseInt(Character.toString(digit));
                }
            }
            return sum;
        }
    }

    public long sequence(String text) {
        if (text == null) {
            return -1;
        }
        else {
            char next;
            if (text.length() > 0) {
                next = text.charAt(0);
            }
            else {
                next = ' ';
            }
            long sequential = 0;
            long maximum = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == next) {
                    sequential += 1;
                    if (sequential > maximum) {
                        maximum = sequential;
                    }
                }
                else {
                    next = text.charAt(i);
                    sequential = 1;
                }
            } return maximum;
        }
    }

    public String intertwine(String a, String b) {
        if (a == null || b == null) {
            return null;
        }
        else {
            StringBuilder intertwined = new StringBuilder();
            String c;
            String d;
            if (a.length() < b.length()) {
                c = a;
                d = b;
            }
            else {
                c = b;
                d = a;
            }
            for (int i = 0; i < c.length(); i++) {
                intertwined.append(a.charAt(i)).append(b.charAt(i));
            }
            for (int j = 0; j < d.substring(c.length()).length(); j++) {
                intertwined.append(d.substring(c.length()).charAt(j));
            }
            return intertwined.toString();
        }
    }

    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        else {
            String reverse = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reverse += text.charAt(i);
            }
            return reverse.equals(text);
        }
    }
}
