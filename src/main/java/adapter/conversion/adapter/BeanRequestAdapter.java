package adapter.conversion.adapter;

import adapter.conversion.IRequest;

public class BeanRequestAdapter implements IRequestAdapter {

    public void newRequest() {
        System.out.println("处理JavaBean处理");
    }

    public boolean support(Object adapter) {
        return adapter instanceof BeanRequestAdapter;
    }
}
