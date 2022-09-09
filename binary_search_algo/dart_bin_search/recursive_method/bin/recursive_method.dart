import 'dart:io';

import 'package:recursive_method/recursive_method.dart';

void main() {
  List<int> array = [3, 5, 7, 11, 25, 28, 30, 40, 41, 50, 51, 52, 53, 60];

  print('Enter number to sort');

  int toSort = int.parse(stdin.readLineSync()!);
  int high = array.length -1;
  int low = 0;
  print("I'm binary search");
  print("The number you are looking for is at index: ${binarySearch(toSort, array, high, low)}");
  print("I'm linear search");
  print("The number you are looking for is at index: ${1}");
}
