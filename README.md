# ripe_concept_live_exam

A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
For example, in array A such that:
A[0] =9 A[1] =3 A[2] =9 A[3] =3 A[4] =9 A[5] =7 A[6] =9
o          the elements at indexes 0 and 2 have value 9,
o	the elements at indexes 1 and 3 have value 3,
o	the elements at indexes 4 and 6 have value 9,
o	the element at index 5 has value 7 and is unpaired.
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
For example, given array A such that:
A[0] =9 A[1] =3 A[2] =9 A[3] =3 A[4] =9 A[5] =7 A[6] =9
the function should return 7, as explained in the example above. Write an efficient algorithm for the following assumptions:
o	N is an odd integer within the range [1..1,000,000];
o	each element of array A is an integer within the range [1..1,000,000,000]; • all but one of the values in A occur an even number of times.

Sample Test Cases:
1. Array:A[0]=9A[1]=3A[2]=9A[3]=3A[4]=9A[5]=7A[6]=9
Return should be: 7
2. Array:A[0]=1A[1]=2A[3]=9A[4]=2A[5]=1
Return should be: 9
has context menu


has context menu
