package cn.sun.happygou.util;

public class AjaxResult {

    //操作是否成功
    private boolean success=true;
    //返回文本字符串的信息
    private String msg="";
    //返回一个object对象
    private Object object;

    /**
     * 提供一个获取对象实例的方法
     * @return
     */
    public  static  AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
