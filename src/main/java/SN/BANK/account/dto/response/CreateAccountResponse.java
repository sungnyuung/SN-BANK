package SN.BANK.account.dto.response;

import SN.BANK.account.entity.Account;
import SN.BANK.domain.enums.Currency;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CreateAccountResponse {

    private Long accountId;
    private String accountName;
    private String accountNumber;
    private Currency currency;
    private LocalDateTime createdAt;

    public static CreateAccountResponse of(Account account) {
        return CreateAccountResponse.builder()
                .accountId(account.getId())
                .accountName(account.getAccountName())
                .accountNumber(account.getAccountNumber())
                .currency(account.getCurrency())
                .createdAt(account.getCreatedAt())
                .build();
    }

}
