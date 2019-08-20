package enums.lab;

import demo.Person;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
public enum HttpCodeEnum {
    INFO(100, 199, new InfoHttpCodeHandler()),
    SUCCESS(200, 299, new SuccessHttpCodeHandler()),
    REDIRECTION(300, 399, new RedirectionHttpCodeHandler());

    private final int min;
    private final int max;
    private final HttpCodeHandler handler;

    HttpCodeEnum(int min, int max, HttpCodeHandler handler) {
        this.min = min;
        this.max = max;
        this.handler = handler;
    }

    public void handle() {
        handler.handle();
    }

    public static HttpCodeEnum findByHttpCode(int code) throws IllegalStateException{
        HttpCodeEnum[] enums = values();
        for (HttpCodeEnum anEnum : enums) {
            if (anEnum.min <= code && code <= anEnum.max) {
                return anEnum;
            }
        }
//        throw new Error("blablab");
        throw new IllegalStateException(code + " not in supported range");
//        return null;
    }




}
