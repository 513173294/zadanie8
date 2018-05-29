import java.util.Arrays;
public class Zadanie {
    public static void main(String[] args) {

        String[] imiona = new String[3];
        imiona[0] = "Marek";
        imiona[1] = "Waleria";
        imiona[2] = "Danvir";
        String names = Arrays.toString(imiona);
        System.out.println(names);
        System.out.println(imiona[0] + " " + imiona[1] + " " + imiona[2]);
    }
}