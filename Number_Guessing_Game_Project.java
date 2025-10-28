   package Number_Guessing_Game_Project;
   import java.util.*;
public class Number_Guessing_Game_Project {
    public static boolean isPrimeNumber(int n){
        if(n==1){
            System.out.println("ONE IS NOT A PRIME NUMBER ");
            System.out.println();// FOR SPACE
            return false;
        }// NOTE THIS IF ELSE STATEMENT SHOULDE BE BEFORE THE BELOW STATEMENT ELSE BELOW STATEMENT WILL RETURN FALSE EVEN IT IS 1 AND NEXT PAR JAAYEGA HI NAHI
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isTwinPrime(int n,int m){
       if(isPrimeNumber(n)&&isPrimeNumber(m)&&((n-m==2)||(m-n==2))){
           return true;
       }

        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int random=(int)(100*(Math.random()));
        int n=0;
        int m=0;
        while(n!=random&&m!=random) {
            System.out.println("ENTER THE FIRST GUESSED NUMBER");
            n = sc.nextInt();
            System.out.println();// FOR SPACE
            System.out.println("ENTER THE SECOND GUESSED NUMBER");
            m = sc.nextInt();
            System.out.println();// FOR SPACE
            if (n < 0) {
                System.out.println(" FIRST NUMBER IS LESS THAN ZERO SO PROGRAM STOPS");
                System.out.println();// FOR SPACE
                break;// NOTE DONT WRITE RETURN ELSE IT WILL EXIT THE MAIN FUNCTION // super se bhi uper important
            }
            if (m < 0) {
                System.out.println(" SECOND NUMBER IS LESS THAN ZERO SO PROGRAM STOPS");
                System.out.println();// FOR SPACE
                break;
            }
            if (n > random) {
                System.out.println("FIRST NUMBER IS GREATER THAN THE RANDOM GENERATED NUMBER");
                System.out.println();// FOR SPACE
            } else if (n < random) {
                System.out.println("FIRST NUMBER IS SHORTER THAN THE RANDOM GENERATED NUMBER");
                System.out.println();// FOR SPACE
            }
            if (m > random) {
                System.out.println("SECOND NUMBER IS GREATER THAN THE RANDOM GENERATED NUMBER");
                System.out.println();// FOR SPACE
            } else if (m < random) {
                System.out.println("SECOND NUMBER IS SHORTER THAN THE RANDOM GENERATED NUMBER");
                System.out.println();// FOR SPACE
            }
            if (isTwinPrime(n, m)) {
                System.out.println("GIVEN PAIR OF GUESSES ARE  TWIN PRIME");
                System.out.println();// FOR SPACE
            } else {
                if (n != 1) {
                    if (isPrimeNumber(n)) {
                        System.out.println("FIRST NUMBER IS A PRIME NUMBER");
                        System.out.println();// FOR SPACE
                    } else {
                        System.out.println("FIRST NUMBER IS NOT A PRIME IT'S FACTORS ARE");
                        System.out.println();// FOR SPACE
                        for (int i = 1; i <= n; i++) {
                            if (n % i == 0) {
                                System.out.println(i);
                            }
                        }
                    }
                }
                if (m != 1) {
                    if (isPrimeNumber(m)) {
                        System.out.println("SECOND NUMBER IS A PRIME NUMBER");
                        System.out.println();// FOR SPACE
                    } else {
                        System.out.println("SECOND NUMBER IS NOT A PRIME IT'S FACTORS ARE");
                        System.out.println();// FOR SPACE
                        for (int i = 1; i <= m; i++) {
                            if (m % i == 0) {
                                System.out.println(i);
                            }
                        }
                    }
                }


            }
        }
        System.out.println("THE RANDOM GENERATED NUMBER IS =>  "+random);
        System.out.println();// FOR SPACE

        }

    }


