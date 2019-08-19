package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Getter
@RequiredArgsConstructor
public enum MaritalStatus {



    SINGLE(1,"холостой"), MARRIED(2,"женат"), DIVORCED(3,"разведён");

    private final int dbcode;
    private final String desc;





    public static MaritalStatus findByDbCode(int dbcode) {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbcode == dbcode) {
                return status;
            }
        }
        throw new IllegalStateException(dbcode + " not supported yet");
    }












}
