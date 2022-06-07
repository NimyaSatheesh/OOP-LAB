import java.util.*;

public class Array_List{
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Anakha");
        arrayList.add("Aneena");
        arrayList.add("Mahima");
        arrayList.add("Shone");
        System.out.println("The elements of the arraylist is - "+arrayList);
        
        Collections.sort(arrayList);
        System.out.println("\nThe ArrayList Sort : "+arrayList); // ArrayList Sort
        Collections.addAll(arrayList,"Sreeraj","Hemanth","Amal","Shalvin","Athin");
        System.out.println("\nAdding new items in the arraylist is : "+arrayList); // ArrayList AddAll 
        Collections.sort(arrayList, Collections.reverseOrder()); //Arraylist in reverse order
        System.out.println("\nThe reverse order of the arraylist : "+arrayList);
        System.out.println("\nThe maximum element of the arraylist : "+Collections.max(arrayList)); //Max elements in the arraylist
    }
}