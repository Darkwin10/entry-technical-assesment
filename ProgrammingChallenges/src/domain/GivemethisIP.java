/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Fernando Darwin VazC
 */
public class GivemethisIP {

    private long ip;

    public GivemethisIP() {
    }

    public long getIp() {
        return ip;
    }

    public void setIp(long ip) {
        this.ip = ip;
    }

    public String longToIP(long ip) {
        this.ip = ip;
        int aux = 0;
        String[] ipbytes = new String[4];
        //Conversion from long to binary string
        String binario = Long.toBinaryString(ip);
        //Validation of String length
        if (binario.length() < 32) {
            aux = 32 - binario.length();
            for (int i = 0; i < aux; i++) {
                binario = "0" + binario;
            }
        } else if (binario.length() > 32) {
            return "The number is very large";
        }
        //Conversion from String to char array
        char[] ch1 = binario.toCharArray();
        //Formation of Bytes
        for (int i = 0; i < 4; i++){
            ipbytes[i] = Character.toString(ch1[i*8]) + Character.toString(ch1[(i*8)+1]) + Character.toString(ch1[(i*8)+2]) 
                    + Character.toString(ch1[(i*8)+3])+ Character.toString(ch1[(i*8)+4]) + Character.toString(ch1[(i*8)+5]) 
                    + Character.toString(ch1[(i*8)+6]) + Character.toString(ch1[(i*8)+7]);
        }
        long[] ip2 = new long [4]; 
        //Binary to decimal conversion
        for (int i = 0; i < 4; i++){
            ip2[i] = Long.parseLong(ipbytes[i], 2);
        }
        //Output IP address obtained
        for (int i = 0; i < 4; i++){
            if(i < 3){
                long res = ip2[i];
                System.out.print(ip2[i] + ".");
            }else{
                System.out.print(ip2[i]);
                }
        }
        return null;
    }
}
