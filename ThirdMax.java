package training;

public class ThirdMax {
        public static int findThirdMax(int[][] arr) {
            int firstMax = -1, secondMax = -1, thirdMax = -1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int current = arr[i][j];
                    if (current > firstMax) {
                        thirdMax = secondMax;
                        secondMax = firstMax;
                        firstMax = current;
                    } else if (current > secondMax && !(current >= firstMax)) {
                        thirdMax = secondMax;
                        secondMax = current;
                    } else if (current > thirdMax && !(current >= secondMax) && !(current >= firstMax)) {
                        thirdMax = current;
                    }
                }
            }
            if (thirdMax == -1) {
                return -1;
            }
            return thirdMax;
        }
        public static void main(String[] args) {
            int[][] array = {
                    {12, 5, 8},
                    {7, 1, 3},
                    {9, 4, 2}
            };

            int thirdMax = findThirdMax(array);
            if (thirdMax != -1) {
                System.out.println("The third largest element is: " + thirdMax);
            } else {
                System.out.println("There is no third largest element.");
            }
        }
    }







