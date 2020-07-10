package main.algorithmic;

import java.util.stream.IntStream;

public class TwoDArraySearch {

  public static void main(String[] args) {
    String[] word = {"FOAM", "ASS"};

    char[][] arr = {
      {'F', 'A', 'C', 'I'},
      {'O', 'B', 'Q', 'P'},
      {'A', 'N', 'O', 'B'},
      {'M', 'A', 'S', 'S'},
      {'R', 'A', 'Z', 'S'},
    };

    int numberOfColumns = arr[0].length;
    int numberOfRows = arr.length;

    System.out.println(
        arr[1][3] + "\n" + "Rows = " + numberOfRows + " " + "Columns = " + numberOfColumns);

    for (String searchSequence : word) {

      boolean foundFlag = searchWord(arr, searchSequence, numberOfRows, numberOfColumns);
      System.out.println(
          searchSequence + (foundFlag ? " -Search successful" : " -Search unsuccessful"));

    }
    IntStream stream = IntStream.range(0,arr.length);
    stream.forEach(System.out::println);
  }

  private static boolean searchWord(
      char[][] arr, String searchSequence, int numberOfRows, int numberOfColumns) {

    boolean isWordFound = false;
    for (char[] row : arr) {

      String rowString = String.valueOf(row);

      if (rowString.contains(searchSequence)) {

        isWordFound = true;
        break;
      }
    }
      if (!isWordFound) {

        String columnString = null;

        for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {

          int finalColumnIndex = columnIndex;
          columnString =
              IntStream.range(0, numberOfRows)
                  .mapToObj(i -> (char) arr[i][finalColumnIndex])             // each steam element fed to lambda func
                  .collect(
                      StringBuilder::new, StringBuilder::append, StringBuilder::append)
                  .toString();

          if (columnString.contains(searchSequence)) {

            isWordFound = true;
            break;
          }
        }
       }


    return isWordFound;
  }
}


