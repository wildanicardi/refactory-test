public class MyClass {
  public static void main(String args[]) {
    int[] array = {4,9,7,5,8,9,3};
    
    sort(array);
  }
  
public static void sort(int[] a) {
  boolean sorted = false;
  int temp;
  int number = 1;
  while(!sorted) {
      sorted = true;
      for (int i = 0; i < a.length - 1; i++) {
          if (a[i] > a[i+1]) {
              String str = "["+a[i+1]+","+a[i]+"] -> ";
              temp = a[i];
              a[i] = a[i+1];
              a[i+1] = temp;
              str += printArray(a);
              System.out.println(number+". "+str);
              sorted = false;
              number++;
          }
      }
  }
  int swap = number - 1;
  System.out.println("Jumlah swap: " + swap);
}

public static String printArray(int[] a){
  String str = "";
  for (int i=0;i < a.length;i++){
      str += a[i] + " ";
  }
  return str;
}
}