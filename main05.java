class main05 {
    public static void main(String[] args) {
        int age = 20;
        String gender = "female"; // female ：女性、 male ：男性
        String status = "成人です";

        if (gender.equals("female")) {
            System.out.println("女性です");
        } else if (gender.equals("male")) {
            System.out.println("男性です");
        } else {
            System.out.println("不明です");
        }
    }
}