public class Main {
    private static int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};
    
    public static void main(String[] args) {
    
        Thread sumThread = new Thread(new TinhTong());
        Thread maxThread = new Thread(new TimSoLonNhat());

        sumThread.start();
        maxThread.start();
    }

     static class TinhTong implements Runnable {
        @Override
        public void run() {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Tổng của các phần tử trong mảng: " + sum);
        }
    }

    static class TimSoLonNhat implements Runnable {
        @Override
        public void run() {
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Phần tử lớn nhất trong mảng: " + max);
        }
    }
}

