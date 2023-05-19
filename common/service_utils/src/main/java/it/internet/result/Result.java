package it.internet.result;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation(value = "全局统一返回结果")
public class Result<T> {
    //状态码
    @ApiModelProperty(value = "返回码")
    private Integer code;

    //返回的状态信息
    @ApiModelProperty(value = "返回消息")
    private String message;

    //返回的数据结果
    @ApiModelProperty(value = "返回数据")
    private T data;

    //无参构造
    public Result() {
    }

//    //成功运行，无数据信息
//    public static <T> Result<T> ok(){
//        Result<T> result = new Result<>();
//        result.setCode(200);
//        result.setMessage("成功");
//        return result;
//    }
//
//    //运行失败，无数据信息
//    public static <T> Result<T> fail(){
//        Result<T> result = new Result<>();
//        result.setCode(404);
//        result.setMessage("失败");
//        return result;
//    }

    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = new Result<T>();
        if (body != null) {
            result.setData(body);
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static<T> Result<T> ok(){
        return Result.ok(null);
    }

    /**
     * 操作成功
     * @param data  baseCategory1List
     * @param <T>
     * @return
     */
    public static<T> Result<T> ok(T data){
        return build(data,20000,"成功");
    }

    public static<T> Result<T> fail(){
        return Result.fail(null);
    }

    /**
     * 操作失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(T data){
        return build(data, 20001,"失败");
    }

    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
}