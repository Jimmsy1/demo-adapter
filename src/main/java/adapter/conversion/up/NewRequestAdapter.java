package adapter.conversion.up;

import adapter.conversion.XmlRequest;
import adapter.conversion.adapter.BeanRequestAdapter;
import adapter.conversion.adapter.IRequestAdapter;
import adapter.conversion.adapter.JsonRequestAdapter;

public class NewRequestAdapter extends XmlRequest implements INewRequest {

    public void xmlRequest() {
        super.request();
    }

    public void jsonRequest() {
        this.process(JsonRequestAdapter.class);
    }

    public void beanRequest() {
        this.process(BeanRequestAdapter.class);
    }

    public void process(Class<? extends  IRequestAdapter> clazz){
        try{
            IRequestAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)) {
                adapter.newRequest();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
