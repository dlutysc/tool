import java.io.*;

public class ReplaceUtil {

    public static String read(File src){
        StringBuffer res = new StringBuffer();
        String line;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(src), "UTF-8");
            BufferedReader reader = new BufferedReader(inputStreamReader);
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
        File src = new File("D:/yonyou/上海/脚本/建表/pay_plan_info_2551.sql");
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
        cont = cont.replaceAll("(?i)clear_account_no", "clear_acct_no");
        cont = cont.replaceAll("(?i)clear_account_name", "clear_acct_name");
        cont = cont.replaceAll("(?i)payee_account_no", "payee_acct_no");
        cont = cont.replaceAll("(?i)payee_account_name", "payee_acct_name");
        cont = cont.replaceAll("(?i)pay_account_no", "pay_acct_no");
        cont = cont.replaceAll("(?i)pay_account_name", "pay_acct_name");
        cont = cont.replaceAll("(?i)bl_code", "source_type_code");
        cont = cont.replaceAll("(?i)bl_name", "source_type_name");
        cont = cont.replaceAll("(?i)bsi_id", "dep_bgt_eco_id");
        cont = cont.replaceAll("(?i)bsi_code", "dep_bgt_eco_code");
        cont = cont.replaceAll("(?i)bsi_name", "dep_bgt_eco_name");
        cont = cont.replaceAll("(?i)pf_id", "pay_form_id");
        cont = cont.replaceAll("(?i)pf_code", "pay_form_code");
        cont = cont.replaceAll("(?i)pf_name", "pay_form_name");
        cont = cont.replaceAll("(?i)pm_id", "set_mode_id");
        cont = cont.replaceAll("(?i)pm_code", "set_mode_code");
        cont = cont.replaceAll("(?i)pm_name", "set_mode_name");
        cont = cont.replaceAll("(?i)mb_code", "manage_mof_dep_code");
        cont = cont.replaceAll("(?i)mb_name", "manage_mof_dep_name");
        cont = cont.replaceAll("(?i)bis_code", "pro_code");
        cont = cont.replaceAll("(?i)bis_name", "pro_name");

        System.out.println(cont);
        // 更新源文件
        System.out.println(ReplaceUtil.write(cont, src));
    }
}

