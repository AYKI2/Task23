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
        System.out.println(linkedList);
        System.out.println(arrayList);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");

        Collections.sort(linkedList);
        Collections.sort(arrayList);
        Arrays.sort(array);
        System.out.println();

        System.out.println("------------After-------------");
        System.out.println(linkedList);
        System.out.println(arrayList);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");
    }
}