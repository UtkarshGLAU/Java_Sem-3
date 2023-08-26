class RevNo {
  public static void main(String[] args) {
    int num = 1234, reversed = 0;    
    System.out.println("Number = " + num);
    while(num != 0) {
      int a = num % 10;
      reversed = reversed * 10 + a;
      num /= 10;
    }
    System.out.println("Reversed Number = " + reversed);
  }
}

//Utkarsh Sharma    68
