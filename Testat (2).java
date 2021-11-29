public class Testat
{

        public static Fraction apply( Fraction[] arr, Fraction x )
        {
            Fraction middle;
            if (arr.length % 2 == 0 | arr.length <3){
                return x.divideBy(new Fraction(2));
            }else if(arr.length >= 3 & arr.length%2 != 0){
                middle = arr[arr.length/2];
                return middle.add(x);
            }
        return x;}
    }
        

