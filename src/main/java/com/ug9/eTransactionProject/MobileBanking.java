package com.ug9.eTransactionProject;

public class MobileBanking extends DigitalPayment {
    private String noRekening;
    private final long feeAntarBank = 6000;
    private boolean checkFee = false;

    public MobileBanking(String nama, long saldo, String noRekening) {
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal > 0){
            long total = nominal;
            if(isCheckFee()){
                total+=this.feeAntarBank;
            }
            if (super.getSaldo()>=total){
                super.setSaldo(super.getSaldo()-total);
                dp.setSaldo(dp.getSaldo()+nominal);
                super.printBuktiTransfer(dp,nominal);
            } else {
                System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
                return;
            }
        } else {
            System.out.println("Nominal yang Anda input tidak valid!");
            return;
        }
        checkFee = false;
    }
}
