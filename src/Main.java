import javax.sound.midi.Soundbank;
import java.util.*;

public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.print("Size: ");
        int size = scanner.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(0, 2));
            arrayList.add(random.nextInt(0, 2));
            array[i] = random.nextInt(0, 2);
        }

        System.out.println("------------Before------------");
        System.out.println(sort(linkedList));
        System.out.println(sort(arrayList));
        System.out.println(Arrays.toString(sort(array)));
        System.out.println("------------------------------");


        System.out.println("------------After-------------");
        System.out.println(sort(linkedList));
        System.out.println(sort(arrayList));
        System.out.println(Arrays.toString(sort(array)));
        System.out.println("------------------------------");

    }

    public static LinkedList<Integer> sort (LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        return linkedList;
    }
    public static ArrayList<Integer> sort (ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        return arrayList;
    }
    public static int[] sort (int[] array){
        Arrays.sort(array);
        return array;
    }
}