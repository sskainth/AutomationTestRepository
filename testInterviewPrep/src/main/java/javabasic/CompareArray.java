package javabasic;

public class CompareArray implements test{

    public static void main(String[] args) {
        CompareArray compareArray = new CompareArray();
        compareArray.abc();
       compareArray.compare();
    }
    @Override
    public void abc() {
        System.out.println("implemented interface");
    }

    public void compare(){
       int [] a = {1,2,3} ;
       int [] b = {3,4,1};
       int flag = 0;
      for(int i = 0; i < a.length; i++)
      {
          for(int j=0; j<b.length;j++) {
              if (a[i] == b[j])
                  flag++;
          }
      }
      if(a.length==flag)
        System.out.println("elements are same"+flag);

    }
}

