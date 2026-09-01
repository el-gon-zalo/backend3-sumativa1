package cl.translog.batch.domain;

public class CuentaAnual {
    private Integer cuentaId;
    private String fecha;
    private String transaccion;
    private Double monto;
    private String descripcion;

    public CuentaAnual() {}

    // Getters y Setters
    public Integer getCuentaId() { return cuentaId; }
    public void setCuentaId(Integer cuentaId) { this.cuentaId = cuentaId; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getTransaccion() { return transaccion; }
    public void setTransaccion(String transaccion) { this.transaccion = transaccion; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "CuentaAnual{" +
                "cuenta_id=" + cuentaId +
                ", fecha='" + fecha + '\'' +
                ", transaccion='" + transaccion + '\'' +
                ", monto=" + monto +
                ", descripcion=" + descripcion +
                '}';
    }

}