binarySearch(int target, List<int> array, int high, int low) {
  // Base case, in case the target is not in the array
  if (low > high) return -1;

  int middle = (low + (high - low) / 2).toInt();
  print(middle);

  if (target == array[middle]) return middle;
  if (target < array[middle]) return binarySearch(target, array, middle - 1, low);
  if (target > array[middle]) return binarySearch(target, array, high, middle + 1);
}
