package com.ug9.eTransactionProject;

public class MobileWallet extends DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp) {
        super(nama, saldo);
        this.noHp = noHp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal > 0){
            long total = nominal;
            if (dp instanceof BNImo || dp instanceof BRImo){
                total+=feeTransferBank;
            }
            if (super.getSaldo()>=total){
                dp.setSaldo(dp.getSaldo()+nominal);
                super.setSaldo(super.getSaldo()-total);
                super.printBuktiTransfer(dp,nominal);
            } else {
                System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
                return;
            }
        } else {
            System.out.println("Nominal yang Anda input tidak valid!");
            return;
        }
        feeTransferBank = 0;
    }

}
