
#question number 3:
# wAP to print patterns 

public class Practice_3 {
    public static void main(String[] args) {
        int n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i==0|| j== (n-1) || i==(n-1) || j==0 || i+j<=(n-1)/2 || j-i>=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}


# question number 4:

public class Practice_4 {
    public static void main(String[] args) {
        int n=14;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}

# question number 4:

public class Practice_5 {
    public static void main(String[] args) {
        int n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i+j<=(n-1)/2 || i-j>=(n-1)/2 || i==0||i==(n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}


#question number 2:

# Write a program to print
# 1 1 1 1
# 2 2 2 2
# 3 3 3 3
# 4 4 4 4

public class Practice_6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(i);
            }
                System.out.println();
            }

        }
    }