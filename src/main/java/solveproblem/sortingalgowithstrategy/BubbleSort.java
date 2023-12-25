package solveproblem.sortingalgowithstrategy;



import java.util.List;
import java.util.stream.Collectors;

//concrete class
public class BubbleSort implements SortingStrategy {
  
  @Override
  public void sort(List<Integer> arrayList) {

    List<Integer> list = arrayList.stream().map(
        element -> element * 2
    ).toList();
  }
}
