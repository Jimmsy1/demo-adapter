package adapter.conversion.adapter;

public interface IRequestAdapter  {

    boolean support(Object adapter);

    void newRequest();

}
