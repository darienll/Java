package dar.iitu.kz.helloworldproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestDBMapper {
    @Select("SELECT static_text FROM test_table ORDER BY id desc limit 1")
    String getLastText();
}
