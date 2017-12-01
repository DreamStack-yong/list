package itbegin;

public class Cat{
  public Cat(){
	  static int count = 0;
    count++;
    System.out.println(count);
  }
  
//  public void printCount(){
//  }
  public static void main(String[] args){
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();    
    
  }
}