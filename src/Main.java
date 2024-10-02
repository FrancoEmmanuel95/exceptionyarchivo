import java.io.*;
import  java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File file = new File("map");

     /*   try {
            PrintWriter archivo = new PrintWriter(archi);
            archivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/


    //HashMap<Integer,String> myMap = new HashMap<>();

    try {
        BufferedReader map = new BufferedReader(new FileReader(file));
        String lineaAct = map.readLine();
        while (lineaAct!=null){
            System.out.println(lineaAct);
            lineaAct = map.readLine();
        }
        map.close();
    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
/*
    myMap.put(7,"siete");
    myMap.put(8,"ocho");
    myMap.put(9,"nueve");
    myMap.put(10,"diez");
    myMap.put(11,"once");
/*
    try {
        PrintWriter map = new PrintWriter(new FileWriter(file,true));
        map.println(myMap);
        map.close();
    } catch (Exception e) {
        e.printStackTrace();
    }


        /*try {
            PrintWriter map = new PrintWriter(file);
            map.println(myMap);
            map.close();
            System.out.println("el archivo se cargo correctamente");

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }

        /*
        for (Map.Entry<Integer,String> entry: myMap.entrySet())
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

*/
        }
    }
