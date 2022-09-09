import 'dart:io';

import 'package:binary_search/binary_search.dart';
import 'package:binary_search/linear_search.dart';

void main() {
  List<int> array = [3, 5, 7, 11, 25, 28, 30, 40, 41, 50, 51, 52, 53, 60];

  print('Enter number to sort');

  int toSort = int.parse(stdin.readLineSync()!);
  print("I'm binary search");
  print("The number you are looking for is at index: ${binarySearch(toSort, array)}");
  print("I'm linear search");
  print("The number you are looking for is at index: ${linearSearch(toSort, array)}");
}
