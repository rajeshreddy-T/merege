public class heapDatastructure {

    public static void main(String[] args) {
        int[] list1 = {1, 5, 16, 61};
        int[] list2 = {2, 4, 5, 6, 8, 9, 10, 15};
        int[] list3 = merge(list1, list2);
        System.out.println(Arrays.toString(list3));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                list3[k] = list1[i];
                i++;
            } else {
                list3[k] = list2[j];
                j++;
            }
            k++;
        }
        while (i < list1.length) {
            list3[k] = list1[i];
            i++;
            k++;
        }
        while (j < list2.length) {
            list3[k] = list2[j];
            j++;
            k++;
        }
        return list3;
    }

    
    
}
