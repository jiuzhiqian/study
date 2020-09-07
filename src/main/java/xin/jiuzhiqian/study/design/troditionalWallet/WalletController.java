package xin.jiuzhiqian.study.design.troditionalWallet;

import java.math.BigDecimal;

/**
 * @author : feng
 */
public class WalletController {
    private WalletService walletService;

    public BigDecimal getBalance(Long walletId) {
        return new BigDecimal(walletId);
    }

    public void dEdit(Long walletId, BigDecimal amount) {

    }

    public void crEdit(Long walletId, BigDecimal amount) {

    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {

    }
}