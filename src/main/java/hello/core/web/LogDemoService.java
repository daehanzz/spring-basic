package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

//    private final ObjectProvider<MyLogger> objectProvider;
    private final MyLogger myLogger;

    public void logic(String testID) {
//        MyLogger myLogger = objectProvider.getObject()
        myLogger.log("service id = " + testID);
    }
}
