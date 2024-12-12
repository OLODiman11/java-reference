package configs;

import beans.AnotherBean;
import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean(name = {"anotherBean"})
    @Scope(value = "singleton")
    public AnotherBean anotherBean() {
        return new AnotherBean();
    }

    @Bean(name = {"myBean", "alias1", "alias2"})
    @Scope(value = "singleton")
    public MyBean myBean(AnotherBean anotherBean) {
        MyBean myBean = new MyBean(123, 321, "test1", "test2");
        myBean.setAnotherBean(anotherBean);
        return myBean;
    }

}
