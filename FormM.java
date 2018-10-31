public class FormM {
    private String nombre;
    private String primer;
    private String correo;
    private String password;
    private boolean nombreA;
    private boolean apellidoA;
    private boolean correoA;
    private boolean passwordA;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if("Gustavo".equals(nombre)){
            nombreA = true;
            this.nombre = nombre;
        }else{
            nombreA = false;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if("Blanco".equals(apellido)){
            primerC = true;
            this.apellido = apellido;
        }else{
            apellidoA = false;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if("gdeleonlg@gmail.com".equals(correo)){
            correoA = true;
            this.correo = correo;
        }else{
            correoA = false;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if("6464646464".equals(password)){
            passwordA = true;
            this.password = password;
        }else{
            passwordA = false;
        }
    }
    
    public boolean comparar(){
      if(nombreA==true && apellidoA==true && correoA==true && passwordA==true){
        return true;
      }else{ 
        return false;
      }
    }
}