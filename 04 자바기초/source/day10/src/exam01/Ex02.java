package exam01;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 60, 55, 78};
        IntStream stm = Arrays.stream(scores);
        IntSummaryStatistics stat = stm.summaryStatistics();
        long count = stat.getCount(); // 총 갯수
        long sum = stat.getSum(); // 합계
        int max = stat.getMax(); // 최대값 
        int min = stat.getMin(); // 최소값
        double avg = stat.getAverage(); // 평균

        System.out.printf("count=%d, sum=%d, max=%d, min=%d, avg=%f%n", count, sum, max, min, avg);
    }
}
