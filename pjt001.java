class Main {

    public static void main(String[] args) {
        int dd = 123456789;
        int rs;

        System.out.printf("%d", dd);
        System.out.println("");

        while (dd>0){
            rs = dd % 10;
            dd = dd / 10;
            System.out.println(rs);
        }
    }
}
