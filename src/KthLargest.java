import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ThreadUtil implements Runnable {
    private List<Integer> input;
    private int k;

    public ThreadUtil(){};

    public ThreadUtil(List<Integer> _input, int _k){
        this.input = _input;
        this.k = _k;
    }
    @Override
    public void run() {
        System.out.println("Thread is running ...");
        Collections.sort(input);
        System.out.println("The Kth largest is - "+input.get(k-1));
    }
}

public class KthLargest {
    public static int findKthSmallest(List<Integer> input, int k){

        //sort//
        Collections.sort(input);

        return input.get(k-1);

    }
    public static void main(String[] args) {
            List<List<Integer>> arr = new ArrayList();
            List<Integer> k = new ArrayList<>();
//            int k = 3;
//            int n = 9;
            //System.out.println(findKthSmallest(arr, k));
        List<Integer> sample1 = new ArrayList<>(List.of(7,10,4,3,20,15));
        arr.add(sample1);
        List<Integer> sample2= new ArrayList<>(List.of(8,10,4,3,20,15));
        k.add(4);
            //creating thread objects//
            for(int i = 0; i < arr.size(); i++){
                ThreadUtil kl1 = new ThreadUtil(arr.get(i), k.get(i));
                Thread t1 = new Thread(kl1);
                t1.start();
            }

    }

//    @Override
//    public void run() {
//        System.out.println("Thread is running ...");
//    }
}




//7 10 4 3 20 15

