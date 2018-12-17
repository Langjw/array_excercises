import java.util.Scanner;

public class Search {
    public String SearchForName() {
        Scanner scan = new Scanner(System.in);

        final int theSize = 20;
        String[] strArrayLast = new String[ theSize ];

        strArrayLast[0] = "Smith";
        strArrayLast[1] = "Barclay";

        String last = "";
        String first = "";
        String str = "";

        while (!last.equals("quit")) {
            System.out.println("");
            System.out.println("Last Name?");
            last = scan.nextLine();

            if (last.equals("quit")) {
                System.out.println("good-bye");
                break;
            }

            else if (last.equals(strArrayLast[0])) {
                System.out.println("First Name?");
                first = scan.nextLine();

                if (first.equals("John")) {
                    System.out.println("John Smith: (812) 339-4916");
                }
                else if (first.equals("Violet")) {
                    System.out.println("Violet Smith: (312) 223-1937");
                }
                else if (first.equals("Willoughby")) {
                    System.out.println("Willoughby Smith: (312) 992-8761");
                }
                else if (first.equals("")) {
                    System.out.println("John Smith: (812) 339-4916");
                    System.out.println("Violet Smith: (312) 223-1937");
                    System.out.println("Willoughby Smith: (312) 992-8761");
                }
                else {
                    System.out.println("Error: Name not found");
                }
            }

            else if (last.equals(strArrayLast[1])) {
                System.out.println("First Name?");
                first = scan.nextLine();
                
                if (first.equals("David")) {
                    System.out.println("David Barclay: (940) 412-4945");
                }
                else if (first.equals("James")) {
                    System.out.println("James Barclay: (418) 665-1223");
                }
                else if (first.equals("Margaret")) {
                    System.out.println("Margaret Barclay: (712) 482-9156");
                }
                else if (first.equals("")) {
                    System.out.println("David Barclay: (940) 412-4945");
                    System.out.println("James Barclay: (418) 665-1223");
                    System.out.println("Margaret Barclay: (712) 482-9156");
                }
                else {
                    System.out.println("Error: Name not found");
                }
            }

            else {
                System.out.println("Error: Name not found");
            }
        }
        return "";
    }
}