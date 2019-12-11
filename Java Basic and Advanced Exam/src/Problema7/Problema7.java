package Problema7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Problema7 {

        static Map<String, String> mapExamen = new HashMap<String, String>();

        public String obtenerPersonaje(String key){
            String data2 = key +  " "  + mapExamen.get(key);
            System.out.println(key + " " + (mapExamen.get(key)));
            return data2;
        }

        private static void printTxt(String data) {
            File file = new File("C:\\Users\\aaron\\OneDrive\\Escritorio\\Java Basic and Advanced Exam\\src\\Problema7\\Personaje.txt");

            FileWriter fr = null;
            try {
                fr = new FileWriter(file);
                fr.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) throws IOException {
            Problema7 personaje = new Problema7();

            mapExamen.put("a1234", "Steve Jobs");
            mapExamen.put("a1235", "Scott McNealy");
            mapExamen.put("a1236", "Jeff Bezos");
            mapExamen.put("a1237", "Larry Ellison");
            mapExamen.put("a1238", "Bill Gates");

            printTxt(personaje.obtenerPersonaje("a1236"));
        }
}
