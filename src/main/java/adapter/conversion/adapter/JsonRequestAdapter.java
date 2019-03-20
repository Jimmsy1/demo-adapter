package adapter.conversion.adapter;

public class JsonRequestAdapter implements IRequestAdapter{

    public void newRequest() {
        System.out.println("处理Json处理");
    }

    public boolean support(Object adapter) {
        return adapter instanceof JsonRequestAdapter;
    }
}
