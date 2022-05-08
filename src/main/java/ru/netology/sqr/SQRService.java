package ru.netology.sqr;

public class SQRService {
    public int calculateSqr(int min, int max) {
        int countSqr = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min && sqr <= max) {
                countSqr++;
            }
        }
        return countSqr;
    }
}
