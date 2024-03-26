package top.mmforum.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {
    SUCCESS(200, "success"),
    ERROR(500, "error"),
    NOT_FOUND(404, "not found"),
    UNAUTHORIZED(401, "unauthorized"),
    FORBIDDEN(403, "forbidden"),
    BAD_REQUEST(400, "bad request");

    private final int code;
    private final String message;

}
