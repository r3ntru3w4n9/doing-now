/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package route;

import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        // Serialization
        var gson = new Gson();
        System.out.println(gson.toJson(1));
        System.out.println(gson.toJson("abcd"));
        System.out.println(gson.toJson(10));
        int[] values = { 1 };
        System.out.println(gson.toJson(values));

        // Deserialization
        int one1 = gson.fromJson("1", int.class);
        Integer one2 = gson.fromJson("1", Integer.class);
        Long one3 = gson.fromJson("1", Long.class);
        Boolean false0 = gson.fromJson("false", Boolean.class);
        String str = gson.fromJson("\"abc\"", String.class);
        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);

        System.out.printf("%d, %d, %d, %b, %s, %s\n", one1, one2, one3, false0, str, anotherStr.toString());
    }
}
