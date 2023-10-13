import java.util.*;
class JavaPangram{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
       boolean isPangram = isPangram(word);
       if(isPangram)
       {
         System.out.println("Yes, "+word+" is Pangram");
       }else{
        System.out.println("Sorry, "+word+" is not pangram");
       }
    }

    public static boolean isPangram(String word)
    {
       word = word.toLowerCase();
       boolean[] arr = new boolean[26];
       int totalChar = 0;

       for(char c:word.toCharArray())
       {
        if(Character.isLetter(c))
        {
            int index = c - 'a';
            if(!arr[index])
            {
                arr[index]= true;
                totalChar++;
            }
        }

        if(totalChar == 26)
       {
         return true;
       }
        
       }
       
       return false;
    }
}