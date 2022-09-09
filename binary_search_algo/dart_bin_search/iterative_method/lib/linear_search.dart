linearSearch(int target, List<int> array) {

  int count = 0;
  for (var i = 0; i < array.length; i++) {
    if (array[i] == target) {
      print("Times the loop was iterated ${count = i+1}");
      return i;
    }
    else{
      count = i+1;
    }
  }
  print("Times the loop was iterated $count");
  return -1;
}
