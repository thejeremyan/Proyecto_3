package set_get;

public class set_get {

    /**Variables a recuperar**/

    private String puntos_salida;
    private String puntos_destino;
    private String info_lugares;

    private static class SingletonHolder{
        public static set_get set_get = new set_get();
    }

    public set_get(){
        ;
    }

    public static set_get getInstance(){
        return SingletonHolder.set_get;
    }



    /**Metodos de get and set de las variables anteriores**/
    public String getPuntos_salida() {
        return puntos_salida;
    }

    public void setPuntos_salida(String puntos_salida) {
        this.puntos_salida = puntos_salida;
    }

    public String getPuntos_destino() {
        return puntos_destino;
    }

    public void setPuntos_destino(String puntos_destino) {
        this.puntos_destino = puntos_destino;
    }

    public String getInfo_lugares() {
        return info_lugares;
    }

    public void setInfo_lugares(String info_lugares) {
        this.info_lugares = info_lugares;
    }


}
/** Invoke object: set_get set_get = set_get.getInstance();**/