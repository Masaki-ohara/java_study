class main03 {
    public static void main(String[] args) {
        int checkTarget = 5;

        switch (checkTarget) {
            case 5:
            case 7:
                System.out.println("条件にヒットしました");
                break;
            default:
                System.out.println("条件に合いませんでした");
        }
    }
}