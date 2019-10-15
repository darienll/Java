package dar.iitu.kz.helloworldproject.services;


import dar.iitu.kz.helloworldproject.mapper.TestDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDBServiceIMPL implements TestDBService {

    @Autowired
    private TestDBMapper testDBMapper;
//    private TestDBServiceIMPL(TestDBMapper testDBMapper) {
//        this.testDBMapper = testDBMapper;
//    }

    @Override
    public String getLastRecord() {
        return testDBMapper.getLastText();
    }
}
