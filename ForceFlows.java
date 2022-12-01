package lesson5;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ForceFlows {

    ArrayList<Student> student = new ArrayList<>();
    BufferedReader bufferedReader;

    {
        try {
            bufferedReader = new BufferedReader(new FileReader("students"));{
                String tempString;
                while ((tempString = bufferedReader.readLine()) != null){

                    String [] studentParams = tempString.split(" ");
                    student.add(new Student(studentParams[0], studentParams [1],Integer.parseInt(studentParams[2])));

                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(student);
    }


}
