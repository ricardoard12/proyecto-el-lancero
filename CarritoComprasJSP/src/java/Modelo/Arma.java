/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class Arma {
    private int codigo_arma;
    private int codigo_marca;
    private int codigo_modelo;
    private int codigo_color;
    private String serie_arma;
    private String precio_arma;
    private String descripcion_arma;
    private String numero_balistica_arma;
    
    private Marca marca;
    private Modelo_Arma modelo_arma;
    private Color color;
    
    public Arma(){ //Este es un constructor vacio ya que no posee argumentos. Por normal general debe haber uno vacio
        this.setCodigo_arma(0); //este constructor lo unico que solicita es el codigo!
        this.setCodigo_Marca(0);
        this.setCodigo_Modelo(0);
        this.setCodigo_Color(0);
        this.setSerie_Arma(" ");
        this.setPrecio_Arma(" ");
        this.setDescripcion_Arma(" ");
        this.setNumero_balistica_arma(" ");
        
    }
    
    public Arma (int codigo_arma, int codigo_marca, int codigo_modelo, int codigo_color, String serie_arma, 
            String precio_arma, String descripcion_arma, String numero_balistica_arma){
        this.codigo_arma=codigo_arma;
        this.codigo_marca=codigo_marca;
        this.codigo_modelo=codigo_modelo;
        this.codigo_color=codigo_color;
        this.serie_arma=serie_arma;
        this.precio_arma=precio_arma;
        this.descripcion_arma=descripcion_arma;
        this.numero_balistica_arma=numero_balistica_arma;
    }
    
      /*creando metodos get y set*/

    public int getCodigo_arma() {
        return codigo_arma;
    }

    public void setCodigo_arma(int codigo_arma) {
        this.codigo_arma = codigo_arma;
    }
    
    
    
    public int getCodigo_Marca(){
    return codigo_marca;
    }  
        public void setCodigo_Marca(int codigo_marca) {
        this.codigo_marca = codigo_marca;
    }
    
    public int getCodigo_Modelo(){
    return codigo_modelo;
    }
        public void setCodigo_Modelo(int codigo_modelo){
    this.codigo_modelo=codigo_modelo;
    }
    
    public int getCodigo_Color (){
    return codigo_color;
    }
    public void setCodigo_Color (int codigo_color) {
    this.codigo_color=codigo_color;
    }
    
    public String getSerie_Arma(){
    return serie_arma;
    }
    public void setSerie_Arma( String serie_arma){
    this.serie_arma=serie_arma;
    }
    
    public String getPrecio_Arma(){
    return precio_arma;
    }
    public void setPrecio_Arma(String precio_arma){
    this.precio_arma=precio_arma;
    }
    
    public String getDescripcion_Arma(){
    return descripcion_arma;
    }
    public void setDescripcion_Arma(String descripcion_arma){
    this.descripcion_arma=descripcion_arma;
    }

    public String getNumero_balistica_arma() {
        return numero_balistica_arma;
    }

    public void setNumero_balistica_arma(String numero_balistica_arma) {
        this.numero_balistica_arma = numero_balistica_arma;
    }

    
    
    // ************** FK ***********
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo_Arma getModelo_arma() {
        return modelo_arma;
    }

    public void setModelo_arma(Modelo_Arma modelo_arma) {
        this.modelo_arma = modelo_arma;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    }


