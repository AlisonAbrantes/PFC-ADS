package util;

import java.security.MessageDigest;


public class Md5 {

    private static String stringHexa(byte[] bytes){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< bytes.length; i++)
        {
            int parteAlta = ((bytes[i]>>4) & 0xf) <<4;
            int parteBaixa = bytes[i] & 0xf;
            if(parteAlta == 0){
                sb.append('0');
            }
            sb.append(Integer.toHexString(parteAlta | parteBaixa));
        }
            return sb.toString();

    }
    public static String senhamd5(String senha) {
        try{
            MessageDigest md= MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            return stringHexa(md.digest());

        }catch(Exception e){
            return null;
        }
    
    }
}
