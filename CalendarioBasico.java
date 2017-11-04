/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declaramos variables dia, mes y año
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor de la clase CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    /**
     *Fijamos la fecha nueva
     */
    public void nuevaFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAnio;
    }

    /**
     *Metodo para obtener fecha
     */
    public String devolverFecha()
    {
        String fechaADevolver = "";
        String elDia = dia + "";
        String elMes = mes + "";
        String elAno = ano + "";
        
        if (elDia.length() < 2) {
            elDia = "0" + elDia;
        }
        
        if (mes < 10) {
            elMes = "0" + elMes;
        }
        
        if (ano < 10) {
            elAno = "0" + elAno;
        }
        
        fechaADevolver = elDia + "-" + elMes + "-" + elAno;
        return fechaADevolver;
    }

    /**
     * Avanza un dia la fecha
     */
    public void incrementarFecha()
    {
        dia += 1;
        if (dia == 31){
            dia = 1;
            mes += 1;
            if (mes == 13){
                mes = 1;
                ano += 1;
            }
        }
    }
}