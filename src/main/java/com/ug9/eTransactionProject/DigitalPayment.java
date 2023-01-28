package com.ug9.eTransactionProject;

public abstract class DigitalPayment {
    private String nama;
    private long saldo;

    public DigitalPayment(String nama, long saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public abstract void transfer(DigitalPayment dp, long nominal);

    public void printBuktiTransfer(DigitalPayment penerima, long nominal) {
        String msg = "";
        if (penerima instanceof BNImo) {
            msg = "Transfer ke BNI Mobile";
        } else if (penerima instanceof BRImo) {
            msg = "Transfer ke BRI Mobile";
        } else if (penerima instanceof Dana) {
            msg = "Transfer ke DANA";
        } else if (penerima instanceof Ovo) {
            msg = "Transfer ke OVO";
        }
        System.out.println(msg + " atas nama " + penerima.nama + " sebesar Rp " + nominal + " sukses");
    }
}
