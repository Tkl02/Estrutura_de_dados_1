package Aula12.listaaleatoria;

public class atv {
    atv proxima;
    atv anterior;
    Object elemento;

    atv(atv proxima, Object elemento){
        this.proxima = proxima;
        this.anterior = null;
        this.elemento = elemento;
    }

    atv(Object elemento){
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    void setProxima(atv proxima){
        this.proxima = proxima;
    }
    public atv getProxima() {
        return this.proxima;
    }

    void setAnterior(atv anterior){
        this.anterior = anterior;
    }
    public atv getAnterior() {
        return this.anterior;
    }

    public Object getElemento() {
        return this.elemento;
    }
}