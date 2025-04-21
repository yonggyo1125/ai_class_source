package exam02;

public class Ex10 {
    public static void main(String[] args) {
        /*
        int[][] nums = new int[][]{
                {10, 20, 30}, // 0행
                {40, 50, 60} // 1행
        };
        */
        int[][] nums = {
                {10, 20, 30}, // 0행
                {40, 50, 60} // 1행
        };

        System.out.println("nums.length:" + nums.length); // 행의 갯수
        System.out.println("nums[0].length:" + nums[0].length); // 0행의 열의 갯수

        for (int i = 0; i < nums.length; i++) { // 0행, 1행
            for (int j = 0; j < nums[i].length; j++) { // nums[i].length : 각 행마다의 열 갯수
                System.out.printf("nums[%d][%d]:%d%n", i, j, nums[i][j]);
            }
        }
    }
}
