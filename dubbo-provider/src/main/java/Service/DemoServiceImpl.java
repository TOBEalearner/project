package Service;

import org.springframework.stereotype.Service;

import Service.DemoService ;
@Service("demoService")
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        return name;
    }
}