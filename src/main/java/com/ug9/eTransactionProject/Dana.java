package com.ug9.eTransactionProject;

public class Dana extends MobileWallet{
    public final long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.setFeeTransferBank(danaFeeTransferBank);
        if (dp instanceof Ovo){
            System.out.println("Akun Dana tidak valid!");
            return;
        }
        super.transfer(dp,nominal);
    }
}
