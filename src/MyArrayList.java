class MyArrayList<T extends Number> {

    T[] arr;
    int size;


    MyArrayList(T[] arr1) {
        this.arr = arr1;
        size = arr1.length;
    }

    void add(T a) {
         MyArrayList<Integer>[] arr1 = new MyArrayList[size + 1];
         Object [] arr;
         arr = arr1;

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]);
        }
    }
//
//    public static void main(String[] args) {
//        Integer[] arr = {4, 4, 5, 5};
//
//        MyArrayList<Integer> iob = new MyArrayList<>(arr);
//        iob.add(4);
//    }
}



