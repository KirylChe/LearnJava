public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 50;
        int b = -135;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
           else {
            System.out.println("Сумма отрицательная");
        }
    }

