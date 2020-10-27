import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        String filePath = "D:/yonyou/上海/脚本/test.txt";
        FileInputStream fin = new FileInputStream(filePath);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String strTmp;
        while((strTmp = buffReader.readLine())!=null){
            System.out.println(strTmp);
            strTmp.replaceAll("en_code", "agency_code");
        }
        buffReader.close();
    }
}
