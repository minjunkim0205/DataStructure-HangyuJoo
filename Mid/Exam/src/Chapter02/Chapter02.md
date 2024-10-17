# Chapter 02 - 알고리즘과 성능 분석  

## 순환(Recursion)  

- 종류  
  - 직접 순환  
    > 함수가 직접 자신을 호출  
  - 간접 순환  
    > 다른 함수를 호출하고 그 함수가 다시 자신을 호출  

- 활용 이론  
  - 분할 정복(divide and conquer)  

## 순환 함수의 예  

- 펙토리얼,n! (Factorial)  
  - 코드  
    > [Chapter02.Factorial.java](./Factorial.java)  
  - 팩토리얼 예시  
    > 5! (5 팩토리얼) : 5!=5×4×3×2×1=120  
    > 4! (4 팩토리얼) : 4!=4×3×2×1=24  
    > 1! (1 팩토리얼) : 1!=1  
    > 0! (0 팩토리얼) : 0!=1  

- 이진탐색,이원탐색 (Binary Search)  
  - 코드  
    > [Chapter02.BinarySearch.java](./BinarySearch.java)  
  - 원하는 key가 저장된 인덱스를 찾아내는 탐색 알고리즘  
    > 데이터가 정렬되어 있다는 가정 하에 가능한 알고리즘  
    > key = a[mid] : 탐색 성공, return mid  
    > key < a[mid] : a[mid]의 왼편에 대해 이진탐색  
    > key > a[mid] : a[mid]의 오른편에 대해 이진탐색  

- 피보나치 수열 (Fibonacci sequence)  
  - 코드  
    > [Chapter02.FibonacciSequence.java](./FibonacciSequence.java)  
  - 각 항은 바로 직전 두 항의 합으로 만들어짐  
    > n = 0 : f_0 = 0  
    > n = 1 : f_1 = 1  
    > n >= 2 : f_n = f_(n-1) + f_(n-2)  

## 여유가 있다면 -> 성능 분석 (2) 장도 정리 할것. 