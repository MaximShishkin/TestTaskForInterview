package ru.shishkin.testTasks.TaskForHonorCup;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class HonorCup {
    public static void main(String[] args) {
        char[][] matrix = {
                {'0', '0', 'X', '0', '0', 'X', '0', 'B'},
                {'0', '0', 'X', '0', '0', 'X', '0', '0'},
                {'0', '0', 'X', '0', '0', 'X', '0', '0'},
                {'0', '0', 'X', 'X', 'X', 'X', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'A', '0', '0', '0', '0', '0', '0', '0'}};

        System.out.println(findTheLenght(matrix));
    }

    private static int findTheLenght(char[][] matrix) {
        int s_row = 0, s_col = 0;
        boolean flag = false;
        for (s_row = 0; s_row < matrix.length; s_row++) {
            for (s_col = 0; s_col < matrix[0].length; s_col++) {
                if (matrix[s_row][s_col] == 'A') flag = true;
                if (flag) break;
            }
            if (flag) break;
        }
        return shortestPath(matrix, s_row, s_col);
    }

    private static int shortestPath(char[][] matrix, int s_row, int s_col) {
        int count = 0;
        Queue<int[]> nextToVisit = new LinkedList<>();
        nextToVisit.offer(new int[]{s_row, s_col});
        Set<int[]> visited = new HashSet<>();
        Queue<int[]> temp = new LinkedList<>();

        while (!nextToVisit.isEmpty()) {
            int[] position = nextToVisit.poll();
            int row = position[0];
            int col = position[1];

            if (matrix[row][col] == 'B') return count;
            if (row > 0 && !visited.contains(new int[]{row - 1, col}) && matrix[row - 1][col] != 'X')
                temp.offer(new int[]{row - 1, col});
            if (row < matrix.length - 1 && !visited.contains(new int[]{row + 1, col}) && matrix[row + 1][col] != 'X')
                temp.offer(new int[]{row + 1, col});
            if (col > 0 && !visited.contains(new int[]{row, col - 1}) && matrix[row][col - 1] != 'X')
                temp.offer(new int[]{row, col - 1});
            if (col < matrix[0].length - 1 && !visited.contains(new int[]{row, col + 1}) && matrix[row][col + 1] != 'X')
                temp.offer(new int[]{row, col + 1});

            if (nextToVisit.isEmpty() && !temp.isEmpty()) {
                nextToVisit = temp;
                temp = new LinkedList<>();
                count++;
            }
        }
        return count;
    }
}
