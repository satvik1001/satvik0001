public class ArrayExample{
    
    void sumOfElement(){
        System.out.println("The Sum Of Array");
        int [] arr={5,4,3,2,1};
        int sum=0;
       for(int i=0;i<arr.length;i++){
       sum=sum+arr[i];
       }
    
    System.out.println("The Sum IS:-" + sum);
}    

      void maxValue(){
        int ans =0;
        int[]arr={5,9,6,4,8};
        for(int i=0;i<arr.length;i++){  
        if (arr[i]>ans) {
            ans=arr[i];
        }
     }
     System.out.println("The Maximum Value Is:-" + ans);
}     

     void searchElement(){
        int x=5;
        int ans=0;
        int[]arr={1,5,3};
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x) {
                ans =i;    
            }
        }
    
     System.out.println("Element "+ x +" at index " + ans);
}    

    void fact(){
    int x=5;
   int fact=1;
    for(int i=1;i<=x;i++){
        fact=fact*i;
    }
    System.out.println("the factorial of number is " + fact );
}

}  



public class Array1{
    public static void main (String[]args){
                System.out.println("Array Basic Program");
        ArrayExample obj= new ArrayExample();
     obj.sumOfElement();
      obj. maxValue();
        obj.searchElement();
      obj.fact();
    }
}
 
    

