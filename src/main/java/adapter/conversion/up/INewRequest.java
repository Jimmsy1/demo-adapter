package adapter.conversion.up;

public interface INewRequest {

    //处理xml
    void xmlRequest();

    //处理json
    void jsonRequest();

    //处理javabean
    void beanRequest();
}
