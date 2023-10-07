import java.io.*;
import java.util.*;
public class VectorDemo{
    public static void main(String args[]){
        Vector<String> vec=new Vector<String>();
        vec.add("Online");
        vec.add("Java");
        vec.add("Complier");
        vec.add("IDE");
        vec.addElement("JDoodle");
        System.out.println("The elements of the vector are:"+vec);
    }
}
