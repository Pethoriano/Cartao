import java.util.ArrayList;

public class CCredito {
    
    private double limite;
    private double saldo;
    private ArrayList<Compra> compras;
    
    public CCredito (double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if (this.saldo>= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }else{
            return false;
        }
    }

    public double getLimite(){
        return this.limite;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

}
