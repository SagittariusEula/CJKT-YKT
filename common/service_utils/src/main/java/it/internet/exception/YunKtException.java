package it.internet.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class YunKtException extends RuntimeException{
    private Integer code;
    private String msg;

    /**
     * 指定位置抛出此异常（try{}catch{}）
     * try {
     *     int a = 10/0;//所需抛出的异常点
     * }catch(Exception e) {
     *     throw new YunKTException(20001,"出现自定义异常");
     * }
     */
}
