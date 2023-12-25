package solveproblem;

import static java.util.List.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

  public static void main(String[] args) {

    List<Integer> arrayList = new ArrayList<>(List.of(8, 2, 1, 4, 5));
    ListIterator<Integer> listIterator = arrayList.listIterator();
    ListIterator<Integer> listIterator2 = arrayList.listIterator();
//    while (listIterator.hasNext()) {
//      int index = listIterator.nextIndex();
//      int next = listIterator.next();
//     
//      int item= arrayList.indexOf(index2);
//      int c=10;
//    }

    while(listIterator.hasNext()) {
//      int index = listIterator.nextIndex();
      int current = listIterator.next();
      while (listIterator.hasNext()) {
        int next = listIterator.next();

        if (current > next) {
          listIterator.set(current);
          listIterator.previous();
        }
      }
    }
//        
//    }
//    while (listIterator.hasNext()) {
//      int current = listIterator.next();
//
//      if (listIterator.hasNext()) {
//        int next = listIterator.next();
//
//        if (current > next) {
//          // Swap elements
//          listIterator.set(next);
//          listIterator.previous(); // Move the iterator back to the correct position
//          listIterator.set(current);
//        } else {
//          // Move the iterator back to the correct position
//          listIterator.previous();
//        }
//      }
////      System.out.println(arrayList);
//
//    }
//    System.out.println(arrayList);

//    List<Integer> result = arrayList.stream()
//        .flatMap(element -> arrayList.stream().filter(e -> element > e)).toList();
//
//  }
//  
  }

}
