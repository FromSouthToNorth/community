package life.hy.community.cache;

import life.hy.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TagCache {
    public static List<TagDTO> get() {
        ArrayList<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("开发语言");
        program.setTags(Arrays.asList("JavaScript",
                "PHP", "CSS", "HTML", "Java", "Node.js",
                "Python", "C#", "C", "C++", "GoLang"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("平台框架");
        framework.setTags(Arrays.asList("Laravel","Spring","Express",
                "Django","Flask","Yii","Ruby-On-Rails","Koa","Struts"));
        tagDTOS.add(framework);

        TagDTO server = new TagDTO();
        server.setCategoryName("服务器");
        server.setTags(Arrays.asList("Linux","Nginx","Docker",
                "Apache","Ubuntu","Centos","缓存","Tomcat","负载均衡"));
        tagDTOS.add(server);

        TagDTO database = new TagDTO();
        database.setCategoryName("数据库");
        database.setTags(Arrays.asList("MySQL","Redis","SQL",
                "Oracle","NoSQL","Memcached","SQLServer","PostgreSQL","SQLite"));
        tagDTOS.add(database);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("开发工具");
        tool.setTags(Arrays.asList("Git","GitHub","IDEA",
                "Vim","MAVEN","SVN","Eclipse"));
        tagDTOS.add(tool);

        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = tags.split("，");
        List<TagDTO> tagDTOS = get();
        List<String> tagList = tagDTOS.stream().
                flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t))
                .collect(Collectors.joining("，"));
       return invalid;
    }

}
