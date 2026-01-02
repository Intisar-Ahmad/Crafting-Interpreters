import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String subjects[] = {"Math", "Science", "History", "English", "Art"};
        // print all subjects

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }


        // also
        int[] marks = new int[3];
        System.out.println(marks[0]); // no garbage value, default is 0

        // sorting

        Arrays.sort(subjects); // sorts in ascending order
        System.out.println("After sorting:");
        for(int i = 0; i < subjects.length; i++){
            System.out.println(subjects[i]);
        }



    }
}
