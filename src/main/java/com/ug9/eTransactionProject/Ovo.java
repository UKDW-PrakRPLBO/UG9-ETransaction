package com.ug9.eTransactionProject;

public class Ovo extends MobileWallet {
    private final long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.setFeeTransferBank(ovoFeeTransferBank);
        if (dp instanceof Dana){
            System.out.println("Akun OVO tidak valid!");
            return;
        }
        super.transfer(dp,nominal);
    }
}
