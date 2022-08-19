package timechannel;


import lombok.Getter;

/**
 * 处理异常，此类问题不应该会发生
 *
 * @author antonybi
 * @date 2022/08/18
 **/
@Getter
public class TimeChannelInternalException extends RuntimeException {

    private final String message;

    public TimeChannelInternalException(String message) {
        super(message);
        this.message = message;
    }

    public TimeChannelInternalException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }
}