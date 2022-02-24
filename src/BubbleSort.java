public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] list) {
        // lặp đẩy phần tử to nhất xuống cuối nên ở lần lặp sau những phần tử cuối đã được sắp xếp
        // và số ptu cần lặp giảm đi k .

        for (int k = 1; k < list.length; k++) {
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSort1(int[] list) {
        // lặp đẩy phần tử nhỏ nhất lên đầu nên ở lần lặp sau những phần tử đầu đã được sắp xếp
        // và số ptu cần lặp giảm đi k .
        for (int k = 0; k < list.length-1; k++) {
            for (int i = list.length - 1 ; i > k; i--) {
                if (list[i] < list[i - 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i-1];
                    list[i-1] = list[i];
                    list[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
            bubbleSort1(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
