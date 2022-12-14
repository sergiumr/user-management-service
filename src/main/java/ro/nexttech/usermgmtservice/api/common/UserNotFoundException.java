package ro.nexttech.usermgmtservice.api.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserNotFoundException extends RuntimeException {
    private String message;
}
