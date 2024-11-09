import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //read the user input and write the output to a fileScanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String fileName = "student.txt";
//        Student[] students;
//        boolean appRunning = true;

//        while (appRunning){
            System.out.println("Menu\n1 - Add Student to the list and write to the file\n2 - Read and display student list from file\n3 - Exit\nEnter your choice:");
            try{
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        try {
                            System.out.println("Enter the number of students:");
                            int n = scanner.nextInt();
                            for (int i = 0; i < n; i++) {
                                System.out.println("Enter the student name:");
                                String name = scanner.next();
                                System.out.println("Enter the student id:");
                                int id = scanner.nextInt();
                                System.out.println("Enter the student marks:");
                                int marks = scanner.nextInt();
                                Student student = new Student(name, id, marks);

                                //write the student details to the file
                                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                                writer.write(student.getName() + " " + student.getId() + " " + student.getMarks() + "\n");
                                writer.close();
                            };
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try{
                            //read the student details from the file and display it
                            BufferedReader reader = new BufferedReader(new FileReader(fileName));
                            String line;
                            while ((line = reader.readLine()) != null) {
                                System.out.println(line);
                            }
                            reader.close();
                        } catch (IOException e) {
                            if (e instanceof FileNotFoundException) {
                                System.out.println("File not found");
                            } else {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 3:
//                        appRunning = false;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }

//        }
        System.exit(0);
    }
}