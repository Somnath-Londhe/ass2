// Write a java Program to display following pattern:
// 1 
// 0 1
// 0 1 0 
// 1 0 1 0 

public class Q3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("\t"+(j+1)%2);
                
            }
                       System.out.println( );
    }
}
}