import java.util.ArrayList;

public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);

        arr.set(2, 4);
        arr.remove(0);

        int len = arr.size();
        for(int i=0; i<len; i++){
            System.out.print(arr.get(i)+", ");
        }
        System.err.println();

        for(Integer element : arr){
            System.out.print(element + ", ");
        }

    }
}
