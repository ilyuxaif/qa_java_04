public class Main {
    public static void main(String[] args) {
        float x = 2, y = 3;
        float k = 4, l = 3, m = 2;
        float a = 4, b = 3, c = 2, d = y - x;

        float result21 = (float) Math.pow((x + 3), 2);
        float result22 = ((3 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c) / x) + 9 * ((4 / x) + ((9 + x) / y));
        float result23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y))) / (a + b + (c / d) + ((a + b) / (c + d)) + a * b);

        System.out.println(result21);
        System.out.println(result22);
        System.out.println(result23);

        String lineH = "_______________________";
        String lineV_ = "|  ";
        String line_V = "  |";
        String line_V_ = " | ";
        String tab = "\t\t";
        System.out.println(lineH);
        System.out.println(lineV_ + "task" + line_V_ + "result    " + line_V);
        System.out.println(lineH);
        System.out.println(lineV_ + "21  " + line_V_ + result21 + tab + line_V);
        System.out.println(lineH);
        System.out.println(lineV_ + "22  " + line_V_ + result22 + tab + line_V);
        System.out.println(lineH);
        System.out.println(lineV_ + "23  " + line_V_ + result23 + line_V_);
        System.out.println(lineH);
    }
}
