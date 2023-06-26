class secret {
    static int secretexm(int num) {
        if (num == 0)
            return 1;
        else
            return (num * secretexm(num - 1));
    }

    public static void main(String args[]) {
        int fact = 1, i;
        int num = 8;
        fact = secretexm(num);
        System.out.println("secret of " + num + " is: " + fact);
    }
}