import java.util.*;
class JavaRoman{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Roman Number :");
        String roman = input.nextLine();
        int numb = findNumber(roman);
        System.out.println(numb);
    }

    public static int findNumber(String roman)
    {
        int previous = 0;
        int result = 0;
        for(int i= roman.length()-1;i >=0;i--)
        {
            int current = romanToNumber(roman.charAt(i));
            if(current < previous)
            {
                result -= current;
            }else{
                result += current;
            }
            previous = current;
        }
        
        return result;

    }
    public static int romanToNumber(char c)
    {
        switch(c)
        {
            case 'I':
              return 1; 
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return 0;
           

        }
    }
}