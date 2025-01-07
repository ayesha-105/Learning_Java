public class Arrays {
    public static void main(String[] args) {
        /*There are three ways of array declaration 
        1. declaration then memory allocation like:
        int [] marks;
        marks = new int[5];
        2. declaration + intiallization like:
        int [] marks = {1,2,3,4,5};*/

        int [] marks = new int[5];  //3 way of array declaration + memory allocation
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;
        System.out.println(marks[3]);
        System.out.println(marks.length);  //check a length of array
        
         }
    
}
