import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    private static String getADate() {
        System.out.println("Please enter a date in format dd.MM (01.12): ");
        String result = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            result = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }
    public static void main(String [] args) throws IOException {

        //получаем дату от пользователя
        String urlSecond = getADate();
        //System.out.println(urlSecond);

        //ищем эту дату в таблице

        //возвращаем фамилии и имена



    }
}