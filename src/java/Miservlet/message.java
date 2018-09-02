
package Miservlet;



class message {
private String Nname;
private String Ffecha;

public void message(String Nname, String Ffecha){
    if (Nname.equals("")){
        System.out.print("debe llenar los campos");
    }
}

    public String getNname() {
        return Nname;
    }

    public void setNname(String Nname) {
        this.Nname = Nname;
    }

    public String getFfecha() {
        return Ffecha;
    }

    public void setFfecha(String Ffecha) {
        this.Ffecha = Ffecha;
    }
    
}
