package User_uchun;

import enums.Rolla;

public class User extends Umumiyr {

    private  String familyasi;
    private  String parol;
    private  Rolla rolla;

    public User(String ismi, String familyasi, String parol) {
     super(ismi);
      this.familyasi = familyasi;
      this.rolla = Rolla.KLENT;
      this.parol = parol;
    }

    public  String getFamilyasi() {
        return familyasi;
    }

    public  void setFamilyasi(String familyasi) {
        this.familyasi = familyasi;
    }

    public  String getParol() {
        return parol;
    }

    public  void setParol(String parol) {
        this.parol = parol;
    }

    public  Rolla getRolla() {
        return rolla;
    }

    public  void setRolla(Rolla rolla) {
        this.rolla = rolla;
    }
}


