import java.io.*;

public class ReplaceUtil {

    public static String read(File src){
        StringBuffer res = new StringBuffer();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(src));
            while ((line = reader.readLine()) != null){
                res.append(line + "\n");
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return res.toString();
    }


    public static boolean write(String cont, File dist){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dist));
            writer.write(cont);
            writer.flush();
            writer.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public ReplaceUtil() {
    }


    public static void main(String[] args) {
        File src = new File("D:/yonyou/上海/脚本/insert_epay_receive_detail_3508.sql");
        String cont = ReplaceUtil.read(src);
        System.out.println(cont);
        // 对得到的内容进行处理
        cont = cont.replaceAll("(?i)set_year", "fiscal_year");
        cont = cont.replaceAll("(?i)rg_code", "mof_div_code");
        cont = cont.replaceAll("(?i)en_code", "agency_code");
        cont = cont.replaceAll("(?i)en_name", "agency_name");
        cont = cont.replaceAll("(?i)mk_code", "fund_type_code");
        cont = cont.replaceAll("(?i)mk_name", "fund_type_name");
        cont = cont.replaceAll("(?i)pb_code", "pay_bank_code");
        cont = cont.replaceAll("(?i)pb_name", "pay_bank_name");
        cont = cont.replaceAll("(?i)bs_code", "exp_func_code");
        cont = cont.replaceAll("(?i)bs_name", "exp_func_name");
        cont = cont.replaceAll("(?i)bi_code", "pro_kind_code");
        cont = cont.replaceAll("(?i)bi_name", "pro_kind_name");
        cont = cont.replaceAll("(?i)pk_code", "pay_type_code");
        cont = cont.replaceAll("(?i)pk_name", "pay_type_name");
        cont = cont.replaceAll("(?i)cb_code", "clear_acct_bank_code");
        cont = cont.replaceAll("(?i)cb_name", "clear_acct_bank_name");
        cont = cont.replaceAll("(?i)payee_account_no", "payee_acct_no");
        cont = cont.replaceAll("(?i)payee_account_name", "payee_acct_name");
        cont = cont.replaceAll("(?i)bl_code", "source_type_code");
        cont = cont.replaceAll("(?i)bl_name", "source_type_name");
        cont = cont.replaceAll("(?i)bsi_code", "dep_bgt_eco_code");
        cont = cont.replaceAll("(?i)bsi_name", "dep_bgt_eco_name");

        System.out.println(cont);
        // 更新源文件
        System.out.println(ReplaceUtil.write(cont, src));
    }
}

