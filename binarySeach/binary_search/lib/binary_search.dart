int binarySearch(int x, List<int> array) {
  int low = 0;
  int high = array.length - 1;
  int count = 0;

  while (low <= high) {
    int middle = (low + (high - low) / 2).toInt();

    count++;

    int midvalue = array[middle];

    if (midvalue == x) {
      print("Times the loop was iterated $count");
      return middle;
    }

    if (midvalue < x) {
      low = middle + 1;
    }

    if (midvalue > x) {
      high = middle - 1;
    }
  }

  print("Times the loop was iterated $count");

  

  return -1;
}
