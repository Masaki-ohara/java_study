class main01 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 13;

        boolean isMultiple = num2 % num1 == 0;
        if (isMultiple) {
            System.out.println(num2 + "は" + num1 + "の倍数です");
        } else {
            System.out.println(num2 + "は" + num1 + "の倍数ではありません");
        }
    }
}