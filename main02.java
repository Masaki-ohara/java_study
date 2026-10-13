class main02 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 13;

        boolean isMultiple1 = (num2 + num1) % 7 == 0;
        boolean isMultiple2 = num1 > 10;
        boolean isMultiple3 = num2 < 100 && num2 % 6 != 0;
        if (isMultiple1 && isMultiple2 && isMultiple3) {
            System.out.println("すべての条件を満たしました");
        }
    }
}