import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Tired of");
    list.add("Doing this");
    list.add("labs");
    list.add("Help mee");
    ArrayList<Integer> int_list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(13);
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(1);
    int count = 0;
    for(int i =0;i < int_list.size();i++){
      for(int j =0;j < int_list.size();j++){
        if(int_list.get(i).equals(int_list.get(j))){
          count++;
        }
      }
    }
    int_list.remove(count);
    

    
  }
}
