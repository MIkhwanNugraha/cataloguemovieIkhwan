package com.dicoding.associate.latihan3;

public class latihansaurangan {

    String cuti = "reject";

    public static void main (String [] args){
        latihansaurangan adin = new latihansaurangan();
        adin.setCuti("disetujui");
        String hasilnya = adin.getCuti();

    }

    void setCuti( String cuti){
        this.cuti=cuti;
    }

    String getCuti(){
     return cuti;
    }
}
